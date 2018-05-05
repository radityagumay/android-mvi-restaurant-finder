package com.rivuchk.restaurantfinder.presentation.base

import io.reactivex.Observable

interface BaseViewModel<I : Action, S : State> {
    fun processAction(action: Observable<I>)

    fun state(): Observable<S>
}
