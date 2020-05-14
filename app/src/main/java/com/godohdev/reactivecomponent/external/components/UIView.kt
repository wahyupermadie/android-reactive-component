package com.godohdev.reactivecomponent.external.components

import android.view.ViewGroup
import androidx.annotation.IdRes

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

abstract class UIView(val viewContainer: ViewGroup) {
    @get:IdRes
    abstract val containerId: Int
    abstract fun show()
    abstract fun hide()
}