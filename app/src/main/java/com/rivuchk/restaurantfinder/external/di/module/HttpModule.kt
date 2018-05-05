package com.rivuchk.restaurantfinder.external.di.module

import com.rivuchk.restaurantfinder.data.network.NetworkService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class HttpModule {
    @Provides
    fun networkService(retrofit: Retrofit): NetworkService {
        return retrofit.create(NetworkService::class.java)
    }
}