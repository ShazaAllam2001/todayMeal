package com.example.todaymeal.feature.main.ui.composables.navigation

enum class Screens(
    val route: String,
    val parameter: String
) {
    RecipeDetails(
        route = "recipe",
        parameter = "recipeId"
    )
}