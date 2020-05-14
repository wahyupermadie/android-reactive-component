package com.godohdev.reactivecomponent.presentation.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 *
 * Created by Wahyu Permadi on 14/05/20.
 * Android Engineer
 *
 **/

abstract class BaseActivity<VM : BaseViewModel> : AppCompatActivity() {
    protected inline fun <reified T : ViewDataBinding> binding(
        @LayoutRes resId: Int
    ): T = DataBindingUtil.setContentView(this, resId)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onViewLoaded()
        setupObserver(getViewModel())
    }

    private fun setupObserver(viewModel: VM) {

    }

    abstract fun getViewModel() : VM
    abstract fun onViewLoaded()
}