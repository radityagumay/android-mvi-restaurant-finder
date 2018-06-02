package com.radityalabs.restaurantfinder.external.di.module

import com.radityalabs.restaurantfinder.App
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: App) {
    @Provides
    fun activityContext() = app.applicationContext
}