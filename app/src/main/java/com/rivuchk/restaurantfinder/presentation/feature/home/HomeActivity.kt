package com.rivuchk.restaurantfinder.presentation.feature.home

import com.rivuchk.restaurantfinder.presentation.base.BaseActivity
import com.rivuchk.restaurantfinder.presentation.base.Intent
import io.reactivex.Observable

class HomeActivity : BaseActivity<HomeViewModel>(), Intent<HomeAction, HomeState> {
    override fun action(): Observable<HomeAction> {
        return Observable.merge(
                initialAction(), initialAction()
        )
    }

    override fun state(state: HomeState) {
        when (state) {
            is HomeState.Initial -> {

            }
        }
    }

    override fun viewModel() = HomeViewModel()

    private fun initialAction() = Observable.just(HomeAction.Initial)
}