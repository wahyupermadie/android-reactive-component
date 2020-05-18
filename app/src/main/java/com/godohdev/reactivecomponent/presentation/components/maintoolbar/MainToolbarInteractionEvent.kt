package com.godohdev.reactivecomponent.presentation.components.maintoolbar

import com.godohdev.reactivecomponent.external.components.ComponentEvent

/**
 *
 * Created by Wahyu Permadi on 18/05/20.
 * Android Engineer
 *
 **/

sealed class MainToolbarInteractionEvent : ComponentEvent {
    object ToolbarBellIconClick : MainToolbarInteractionEvent()
}