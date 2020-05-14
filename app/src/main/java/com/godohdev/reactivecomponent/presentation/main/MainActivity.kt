package com.godohdev.reactivecomponent.presentation.main

import com.godohdev.reactivecomponent.R.layout
import com.godohdev.reactivecomponent.databinding.ActivityMainBinding
import com.godohdev.reactivecomponent.presentation.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<MainViewModel>() {
    private lateinit var binding: ActivityMainBinding
    private val mainVm by viewModel<MainViewModel>()

    override fun getViewModel(): MainViewModel = mainVm

    override fun onViewLoaded() {
        binding = binding(layout.activity_main)
    }
}
