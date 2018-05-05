package com.rivuchk.restaurantfinder.presentation.base

import io.reactivex.Observable

interface Intent<I : Action, in S : State> {
    fun action(): Observable<I>
    fun state(state: S)
}