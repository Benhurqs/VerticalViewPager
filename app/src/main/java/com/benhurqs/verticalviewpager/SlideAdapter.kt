package com.benhurqs.verticalviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by benhur.souza on 29/05/18.
 */
class SlideAdapter(var fm: FragmentManager ): FragmentStatePagerAdapter(fm){


    override fun getItem(position: Int): Fragment {
        if(position%2==0){
            return GreeFragment()
        }
        return SlideFragment()
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getPageWidth(position: Int): Float {
        return 0.80f
    }



}