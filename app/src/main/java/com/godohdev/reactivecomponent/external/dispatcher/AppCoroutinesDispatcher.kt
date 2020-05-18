package com.godohdev.reactivecomponent.external.dispatcher

import kotlinx.coroutines.Dispatchers

/**
 *
 * Created by Wahyu Permadi on 18/05/20.
 * Android Engineer
 *
 **/

class AppCoroutinesDispatcher : CoroutinesContextDispatcher {
    override fun io() = Dispatchers.IO
    override fun ui() = Dispatchers.Main
    override fun immediate() = Dispatchers.Unconfined
}