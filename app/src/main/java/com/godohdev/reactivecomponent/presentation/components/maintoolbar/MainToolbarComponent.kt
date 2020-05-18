package com.godohdev.reactivecomponent.presentation.components.maintoolbar

import android.view.ViewGroup
import androidx.annotation.VisibleForTesting
import com.godohdev.reactivecomponent.external.components.EventBusFactory
import com.godohdev.reactivecomponent.external.components.UIComponent
import com.godohdev.reactivecomponent.external.dispatcher.CoroutinesContextDispatcher
import com.godohdev.reactivecomponent.presentation.components.maintoolbar.state.MainToolbarStateEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

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
    private val dispatcher: CoroutinesContextDispatcher
) : UIComponent<MainToolbarInteractionEvent>,
    CoroutineScope by coroutineScope, MainToolbarView.MainToolbarListener {

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    val uiView = initView(container)

    private fun initView(container: ViewGroup): MainToolbarView {
        return MainToolbarView(container, this)
    }

    init {
        container.addView(uiView.view)
        launch(dispatcher.immediate()){
            bus.getSafeManagedFlow(MainToolbarStateEvent::class.java)
                .collect {
                    when(it){
                        MainToolbarStateEvent.Init -> setupToolbarView()
                    }
                }
        }
    }

    private fun setupToolbarView() {
        uiView.bind()
        uiView.view
    }

    override fun containerId(): Int {
        return uiView.containerId
    }

    override fun interactionEvents(): Flow<MainToolbarInteractionEvent> {
        return bus.getSafeManagedFlow(MainToolbarInteractionEvent::class.java)
    }

    override fun onBellIconClick() {
        launch(dispatcher.immediate()){
            bus.emit(
                MainToolbarInteractionEvent::class.java,
                MainToolbarInteractionEvent.ToolbarBellIconClick
            )
        }
    }
}