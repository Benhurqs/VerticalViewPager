package com.benhurqs.verticalviewpager

import android.app.Fragment
import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.RelativeLayout
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.view.*


/**
 * Created by benhur.souza on 29/05/18.
 */

class VerticalViewPager : ViewPager, View.OnScrollChangeListener {

    constructor(context: Context) : super(context) {
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}


//    override fun onPageScrolled(position: Int, offset: Float, offsetPixels: Int) {
//        super.onPageScrolled(position, offset, offsetPixels)
//
//        val layoutParams = FrameLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT)
//
//        layoutParams.width = 500
//        layoutParams.height = 400
//
//        val v = (adapter as SlideAdapter).getItem(position) as Fragment
//
//        v.layoutParams = layoutParams
//
//    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        var event: MotionEvent? = ev
        event?.setLocation(ev!!.y, ev!!.x)

        return super.onTouchEvent(event)
    }

    private var mCurrentView: View? = null

    override fun onScrollChange(v: View?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int) {

    }
}
