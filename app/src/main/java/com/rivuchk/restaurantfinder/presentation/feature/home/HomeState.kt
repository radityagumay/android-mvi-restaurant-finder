package com.rivuchk.restaurantfinder.presentation.feature.home

import com.rivuchk.restaurantfinder.presentation.base.State

sealed class HomeState: State {
    object Initial : HomeState()
}