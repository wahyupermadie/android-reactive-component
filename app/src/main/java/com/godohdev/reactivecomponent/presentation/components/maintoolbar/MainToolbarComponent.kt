package com.godohdev.reactivecomponent.presentation.components.maintoolbar

import android.view.ViewGroup
import androidx.annotation.VisibleForTesting
import com.godohdev.reactivecomponent.external.components.EventBusFactory
import com.godohdev.reactivecomponent.external.components.UIComponent
import com.godohdev.reactivecomponent.external.dispatcher.CoroutinesContextDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

/**
 *
 * Created by Wahyu Permadi on 18/05/20.
 * Android Engineer
 *
 **/

class MainToolbarComponent constructor(
    container: ViewGroup,
    private val bus: EventBusFactory,
    coroutineScope: CoroutineScope,
    dispatcher: CoroutinesContextDispatcher
) : UIComponent<MainToolbarInteractionEvent>,
    CoroutineScope by coroutineScope, MainToolbarView.MainToolbarListener {

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val uiView = initView(container)

    private fun initView(container: ViewGroup): MainToolbarView {
        return MainToolbarView(container, this)
    }

    override fun containerId(): Int {
        TODO("Not yet implemented")
    }

    override fun interactionEvents(): Flow<MainToolbarInteractionEvent> {
        TODO("Not yet implemented")
    }

    override fun onBellIconClick() {
        TODO("Not yet implemented")
    }
}