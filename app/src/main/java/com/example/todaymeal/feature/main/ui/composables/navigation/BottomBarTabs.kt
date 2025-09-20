package com.example.todaymeal.feature.main.ui.composables.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.todaymeal.R

enum class BottomBarTabs(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val route: String
) {
    Recipes(
        title = R.string.recipes,
        icon = R.drawable.soup_kitchen_24,
        route = "recipes"
    ),
    Analyze(
        title = R.string.analyze,
        icon = R.drawable.photo_camera_24,
        route = "analyze"
    ),
    Favorites(
        title = R.string.favorites,
        icon = R.drawable.favorite_24,
        route = "favorites"
    ),
    Converter(
        title = R.string.converter,
        icon = R.drawable.scale_24,
        route = "converter"
    )
}