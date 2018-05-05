package com.rivuchk.restaurantfinder.presentation.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable

abstract class BaseActivity<T : ViewModel> : AppCompatActivity() {

    var compositeDisposable = CompositeDisposable()

    private val viewModel: T by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProviders
                .of(this, Factory.getInstance(this))
                .get(viewModel()::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupInjection()

        viewModel
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        onViewReady()
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }

    abstract fun viewModel(): T

    abstract fun setupInjection()

    abstract fun onViewReady()
}