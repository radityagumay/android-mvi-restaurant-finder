package com.rivuchk.restaurantfinder.presentation.feature.home

import com.rivuchk.restaurantfinder.presentation.base.Action

sealed class HomeAction: Action {
    object Initial : HomeAction()
}