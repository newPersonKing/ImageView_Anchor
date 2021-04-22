# ImageView_Anchor
根据 anchorview 相对图片的百分比位置 动态添加anchor

```

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
```
```
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.ivydad.module.android_archor.AnchorView
        android:id="@+id/anchor_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</FrameLayout>
```
