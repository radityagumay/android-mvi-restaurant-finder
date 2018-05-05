package com.rivuchk.restaurantfinder.external.di.module

import com.rivuchk.restaurantfinder.App
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: App) {
    @Provides
    fun activityContext() = app.applicationContext
}