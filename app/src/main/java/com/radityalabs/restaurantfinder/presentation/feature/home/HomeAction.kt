package com.radityalabs.restaurantfinder.presentation.feature.home

import com.radityalabs.restaurantfinder.presentation.base.Action

sealed class HomeAction: Action {
    object Initial : HomeAction()
}