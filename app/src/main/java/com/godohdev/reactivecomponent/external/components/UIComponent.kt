package com.godohdev.reactivecomponent.external.components

import androidx.annotation.IdRes
import androidx.lifecycle.LifecycleObserver
import kotlinx.coroutines.flow.Flow

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

interface UIComponent<T> : LifecycleObserver {
    @IdRes
    fun containerId(): Int
    fun interactionEvents(): Flow<T>
}