package com.ivydad.module.android_archor

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Point
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target


class AnchorView : FrameLayout{

    constructor(context: Context) : super(context){
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        initView(context)
    }
    var containerImageView:AppCompatImageView? = null
    fun initView(context: Context){
        containerImageView = AppCompatImageView(context)
        containerImageView?.scaleType = ImageView.ScaleType.FIT_CENTER
        var params = LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT)
        addView(containerImageView,params)
    }

    fun setAnchorData(anchorinfos:List<AnchorInfo>,contentUrl:String,anchorWidth:Int = 100,anchorHeight:Int = 100,anchorClick:(AnchorInfo)->Unit = {}){

        Glide.with(this).asBitmap().load(contentUrl).listener(object : RequestListener<Bitmap>{
            override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Bitmap>?, isFirstResource: Boolean): Boolean {
               return true;
            }

            override fun onResourceReady(resource: Bitmap?, model: Any?, target: Target<Bitmap>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                post {
                    if(resource != null){
                        containerImageView?.setImageBitmap(resource)
                        anchorinfos.forEach {info->
                            addAnchor(resource.width,resource.height,info,anchorClick,anchorWidth,anchorHeight)
                        }
                    }else{
                        /*todo 提示图片预加载失败*/

                    }
                }
                return true;
            }


        }).preload()

    }

    private fun addAnchor(loadImgWidth:Int,loadImgHeight:Int,anchorInfo: AnchorInfo,anchorClick:(AnchorInfo)->Unit,anchorWidth:Int,anchorHeight:Int){

        var containertWidth = measuredWidth
        var containerHeight = measuredHeight

        var containerRatio = containertWidth * 1.0f / containerHeight * 1.0f
        var loadImgRatio = loadImgWidth * 1.0f / loadImgHeight * 1.0f
        var point = Point(0,0)
        if(containerRatio > loadImgRatio){
            /*垂直充满*/
            point.x = ((containertWidth - loadImgRatio * containerHeight)/2 + loadImgRatio * containerHeight*anchorInfo.widthPercent ).toInt()
            point.y = (containerHeight * anchorInfo.heightPercent).toInt()

        }else{
            /*水平充满*/
            point.x = (containertWidth * anchorInfo.widthPercent).toInt()
            point.y = ((containerHeight - containertWidth / loadImgRatio)/2 + containertWidth / loadImgRatio*anchorInfo.heightPercent).toInt()
        }

        var anchorImg = AppCompatImageView(context)
        /*todo 这里的宽高是anchor 的宽高 可以自己修改*/
        var params = LayoutParams(anchorWidth,anchorHeight)
        addView(anchorImg,params)
        anchorImg.translationX = point.x.toFloat()
        anchorImg.translationY = point.y.toFloat()
        Glide.with(context).load(anchorInfo.imgUrl).into(anchorImg)

        anchorImg.setOnClickListener {
            anchorClick(anchorInfo)
        }
    }

}


class  AnchorInfo{

    var widthPercent = 0f
    var heightPercent = 0f
    var imgUrl = ""

}
