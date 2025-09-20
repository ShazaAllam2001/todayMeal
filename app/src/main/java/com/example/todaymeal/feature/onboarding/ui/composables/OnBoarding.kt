package com.example.todaymeal.feature.onboarding.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.todaymeal.feature.onboarding.ui.composables.navigation.OnBoardingNavGraph

@Composable
fun OnBoarding() {
    val navController = rememberNavController()

    Scaffold(
    ) { innerPadding ->
        Box(Modifier.padding(innerPadding)) {
            OnBoardingNavGraph(
                navController = navController
            )
        }
    }
}

