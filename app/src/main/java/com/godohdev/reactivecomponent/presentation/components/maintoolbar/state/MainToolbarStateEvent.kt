package com.godohdev.reactivecomponent.presentation.components.maintoolbar.state

import com.godohdev.reactivecomponent.external.components.ComponentEvent

/**
 *
 * Created by Wahyu Permadi on 19/05/20.
 * Android Engineer
 *
 **/

sealed class MainToolbarStateEvent: ComponentEvent {
    object Init : MainToolbarStateEvent()
}