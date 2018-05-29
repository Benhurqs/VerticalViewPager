package com.benhurqs.verticalviewpager

import android.support.v4.view.ViewPager
import android.view.View

/**
 * Created by benhur.souza on 29/05/18.
 */
class CustomPageTransform: ViewPager.PageTransformer{

    override fun transformPage(page: View, position: Float) {
        if (position < -1) {
            // This page is way off-screen to the left
//            page.alpha = 0f
        } else if (position <= 1) {
//            page.alpha = 1f

            // Counteract the default slide transition
            page.translationX = page.width * -position

            // set Y position to swipe in from top
            val yPosition = position * page.height
            page.translationY = yPosition
        } else {
            // This page is way off screen to the right
//            page.alpha = 0f
        }
    }
}