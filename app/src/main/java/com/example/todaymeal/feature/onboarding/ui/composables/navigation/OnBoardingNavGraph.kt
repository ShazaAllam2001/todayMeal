package com.example.todaymeal.feature.onboarding.ui.composables.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.todaymeal.feature.main.ui.composables.MainScreen
import com.example.todaymeal.feature.onboarding.ui.composables.screen1.OnBoarding1
import com.example.todaymeal.feature.onboarding.ui.composables.screen2.OnBoarding2
import com.example.todaymeal.feature.onboarding.ui.composables.screen3.OnBoarding3

@Composable
fun OnBoardingNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = OnBoardingScreens.Welcome.route
    ) {
        composable(route = OnBoardingScreens.Welcome.route) {
            OnBoarding1(navController = navController)
        }
        composable(route = OnBoardingScreens.Features.route) {
            OnBoarding2(navController = navController)
        }
        composable(route = OnBoardingScreens.Preferences.route) {
            OnBoarding3(navController = navController)
        }
        composable(route = OnBoardingScreens.Main.route) {
            MainScreen()
        }
    }
}