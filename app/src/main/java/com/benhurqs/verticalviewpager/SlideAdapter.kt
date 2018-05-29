package com.benhurqs.verticalviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.View
import android.view.ViewGroup

/**
 * Created by benhur.souza on 29/05/18.
 */
class SlideAdapter(var fm: FragmentManager ): FragmentStatePagerAdapter(fm){

    private var mCurrentView: View? = null

    override fun getItem(position: Int): Fragment {
        return SlideFragment()
    }

    override fun getCount(): Int {
        return 5
    }

//    override fun setPrimaryItem(container: ViewGroup?, position: Int, obj: Any?) {
////        super.setPrimaryItem(container, position, `object`)
//        mCurrentView = obj!! as View
//    }
//
//    fun getCurrentItem(): View?{
//        return mCurrentView
//    }

}