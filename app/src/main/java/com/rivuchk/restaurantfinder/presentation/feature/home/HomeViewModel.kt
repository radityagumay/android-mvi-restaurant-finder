package com.rivuchk.restaurantfinder.presentation.feature.home

import android.arch.lifecycle.ViewModel
import com.rivuchk.restaurantfinder.presentation.base.BaseViewModel
import io.reactivex.Observable

class HomeViewModel : ViewModel(), BaseViewModel<HomeAction, HomeState> {
    override fun processAction(action: Observable<HomeAction>) {

    }

    override fun state(): Observable<HomeState> {
    }
}