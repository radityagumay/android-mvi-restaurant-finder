package com.rivuchk.restaurantfinder.presentation.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<T : ViewModel> : AppCompatActivity() {

    private val viewModel: T by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProviders
                .of(this, Factory.getInstance(this))
                .get(viewModel()::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel
    }

    abstract fun viewModel(): T
}