package com.rivuchk.restaurantfinder.presentation.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import com.rivuchk.restaurantfinder.presentation.feature.home.HomeViewModel

class Factory private constructor(private val applicationContext: Context
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == HomeViewModel::class.java) {
            return HomeViewModel() as T
        }
        throw IllegalArgumentException("unknown model class $modelClass")
    }

    companion object : SingletonHolderSingleArg<Factory, Context>(::Factory)
}