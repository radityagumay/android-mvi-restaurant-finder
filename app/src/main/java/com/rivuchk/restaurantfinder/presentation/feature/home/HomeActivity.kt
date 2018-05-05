package com.rivuchk.restaurantfinder.presentation.feature.home

import com.rivuchk.restaurantfinder.presentation.base.BaseActivity
import com.rivuchk.restaurantfinder.presentation.base.Intent
import io.reactivex.Observable
import javax.inject.Inject

class HomeActivity : BaseActivity<HomeViewModel>(), Intent<HomeAction, HomeState> {

    @Inject
    lateinit var viewModel: HomeViewModel

    override fun setupInjection() {

    }

    override fun onViewReady() {
        compositeDisposable.add(viewModel.state().subscribe(::state))
        viewModel.processAction(action())
    }

    override fun viewModel() = viewModel

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

    private fun initialAction() = Observable.just(HomeAction.Initial)
}