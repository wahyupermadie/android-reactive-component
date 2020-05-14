package com.godohdev.reactivecomponent.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.godohdev.reactivecomponent.R
import com.godohdev.reactivecomponent.R.layout
import com.godohdev.reactivecomponent.databinding.ActivityMainBinding
import com.godohdev.reactivecomponent.presentation.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>() {
    private lateinit var binding: ActivityMainBinding

    override fun getViewModel(): MainViewModel {
        TODO("Not yet implemented")
    }

    override fun onViewLoaded() {
        binding = binding(layout.activity_main)
    }
}
