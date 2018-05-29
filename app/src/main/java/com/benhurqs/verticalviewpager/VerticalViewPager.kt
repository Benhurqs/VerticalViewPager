package com.benhurqs.verticalviewpager

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

/**
 * Created by benhur.souza on 29/05/18.
 */

class VerticalViewPager : ViewPager {

//    var mAdapter: SlideAdapter? = null

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

//    fun setAdapter(mAdapter: SlideAdapter){
//        this.mAdapter = mAdapter
//    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        var event: MotionEvent? = ev
        event?.setLocation(ev!!.y, ev!!.x)

        return super.onTouchEvent(event)
    }

//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        var height = 0
//        val v = (adapter as SlideAdapter)!!.getCurrentItem()
//        if (v != null) {
//            v!!.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED))
//            height = v!!.getMeasuredHeight()
//        }
//
//       var heightSpec = View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.EXACTLY)
//
//
//        super.onMeasure(widthMeasureSpec, heightSpec)
//    }

}
