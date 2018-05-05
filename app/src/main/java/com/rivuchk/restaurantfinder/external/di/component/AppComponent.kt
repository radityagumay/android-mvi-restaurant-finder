package com.rivuchk.restaurantfinder.external.di.component

import android.content.Context
import com.rivuchk.restaurantfinder.external.di.module.AppModule
import com.rivuchk.restaurantfinder.external.di.module.HttpModule
import dagger.Component

@Component(modules = arrayOf(
        AppModule::class,
        HttpModule::class
))
interface AppComponent {
    fun context(): Context
}