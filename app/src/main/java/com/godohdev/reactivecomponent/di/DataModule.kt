package com.godohdev.reactivecomponent.di

import com.godohdev.reactivecomponent.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

val dataModule = module {
    viewModel { MainViewModel(get()) }
}