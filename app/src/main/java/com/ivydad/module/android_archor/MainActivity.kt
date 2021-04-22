package com.ivydad.module.android_archor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        anchor_view.setAnchorData(createAnchorList(),"http://www.baidu.com/img/bdlogo.png",anchorWidth = 50,anchorHeight = 50){
            Log.i("ccccccccccc","it====${it.imgUrl}")
        }
    }

    fun createAnchorList():List<AnchorInfo>{
        var list = ArrayList<AnchorInfo>()

        for (i in 0 .. 10){

            var info = AnchorInfo()
            info.widthPercent = 0.1f * i
            info.heightPercent = 0.1f * i
            info.imgUrl = "http://rongcloud-web.qiniudn.com/docs_demo_rongcloud_logo.png"
            list.add(info)

        }

        return list;

    }


}