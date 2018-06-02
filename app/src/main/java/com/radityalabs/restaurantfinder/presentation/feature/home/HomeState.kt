package com.radityalabs.restaurantfinder.presentation.feature.home

import com.radityalabs.restaurantfinder.presentation.base.State

sealed class HomeState: State {
    object Initial : HomeState()
}