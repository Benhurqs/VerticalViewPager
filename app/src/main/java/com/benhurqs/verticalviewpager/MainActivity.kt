package com.benhurqs.verticalviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = SlideAdapter(supportFragmentManager)
        viewpager.adapter = adapter
        viewpager.setPageTransformer(true, CustomPageTransform())

    }

    //https://cdn-images-1.medium.com/max/800/1*hLJ9YuOPYlbcNGMdzUh7Jw.gif
}
