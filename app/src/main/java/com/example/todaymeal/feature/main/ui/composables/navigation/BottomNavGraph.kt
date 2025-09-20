package com.example.todaymeal.feature.main.ui.composables.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todaymeal.feature.analyze.ui.composables.Analyze
import com.example.todaymeal.feature.converter.ui.composables.Converter
import com.example.todaymeal.feature.favortites.ui.composables.Favorites
import com.example.todaymeal.feature.recipes.ui.composables.Recipes
import com.example.todaymeal.feature.recipes.ui.composables.recipeDetails.RecipeDetails

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = BottomBarTabs.Recipes.route
    ) {
        composable(route = BottomBarTabs.Recipes.route) {
            Recipes()
        }
        composable(route = BottomBarTabs.Analyze.route) {
            Analyze()
        }
        composable(route = BottomBarTabs.Favorites.route) {
            Favorites()
        }
        composable(route = BottomBarTabs.Converter.route) {
            Converter()
        }
        composable(
            route = Screens.RecipeDetails.route,
            arguments = listOf(navArgument(Screens.RecipeDetails.parameter){
                type = NavType.StringType
            })
        ) {
            val recipeId = it.arguments?.getString(Screens.RecipeDetails.parameter)?:""

            RecipeDetails()
        }
    }
}