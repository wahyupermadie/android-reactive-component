package com.godohdev.reactivecomponent.presentation.components.maintoolbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.godohdev.reactivecomponent.R
import com.godohdev.reactivecomponent.external.components.UIView
import com.godohdev.reactivecomponent.external.show

/**
 *
 * Created by Wahyu Permadi on 18/05/20.
 * Android Engineer
 *
 **/

class MainToolbarView constructor(
    viewGroup: ViewGroup,
    private val listener: MainToolbarListener
) : UIView(viewGroup) {

    private val view: View = LayoutInflater
        .from(viewContainer.context)
        .inflate(R.layout.component_toolbar, null)
        .findViewById(R.id.toolbar)

    override val containerId: Int
        get() = view.id

    fun bind() {
        view.findViewById<ImageView>(R.id.ivAction).setOnClickListener {
            listener.onBellIconClick()
        }
    }

    override fun show() {
        view.show()
    }

    override fun hide() {
        view.show()
    }

    interface MainToolbarListener {
        fun onBellIconClick()
    }
}