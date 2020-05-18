package com.godohdev.reactivecomponent.external.dispatcher

import kotlinx.coroutines.CoroutineDispatcher

/**
 *
 * Created by Wahyu Permadi on 18/05/20.
 * Android Engineer
 *
 **/

interface CoroutinesContextDispatcher {
    fun io(): CoroutineDispatcher
    fun ui(): CoroutineDispatcher
    fun immediate(): CoroutineDispatcher
}