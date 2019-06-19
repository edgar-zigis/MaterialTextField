package com.zigis.materialtextfield.custom

import android.graphics.RectF

class AnimatedRectF(left: Float, top: Float, right: Float, bottom: Float) : RectF(left, top, right, bottom) {

    fun setTop(top: Float) {
        this.top = top
    }

    fun setBottom(bottom: Float) {
        this.bottom = bottom
    }

    fun setRight(right: Float) {
        this.right = right
    }

    fun setLeft(left: Float) {
        this.left = left
    }
}