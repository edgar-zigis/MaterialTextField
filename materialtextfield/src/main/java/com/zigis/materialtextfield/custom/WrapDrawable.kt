package com.zigis.materialtextfield.custom

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import android.os.Build

class WrapDrawable(private val drawable: Drawable) : Drawable() {

    override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
        super.setBounds(left, top, right, bottom)
        val drawable = drawable
        drawable.setBounds(left, top, right, bottom)
    }

    override fun getConstantState(): ConstantState? {
        return drawable.constantState
    }

    override fun setAlpha(alpha: Int) {
        drawable.alpha = alpha
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        drawable.colorFilter = colorFilter
    }

    override fun getOpacity(): Int {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR2) {
            return drawable.alpha
        }
        return PixelFormat.OPAQUE
    }

    override fun draw(canvas: Canvas) {
        val drawable = drawable
        drawable.draw(canvas)
    }

    override fun getIntrinsicWidth(): Int {
        return drawable.bounds.width()
    }

    override fun getIntrinsicHeight(): Int {
        return drawable.bounds.height()
    }
}