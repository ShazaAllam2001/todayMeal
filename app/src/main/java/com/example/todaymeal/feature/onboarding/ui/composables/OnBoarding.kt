package com.example.todaymeal.feature.onboarding.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.todaymeal.feature.onboarding.ui.composables.navigation.OnBoardingNavGraph

@Composable
fun OnBoarding() {
    val navController = rememberNavController()

    Box(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
            .systemBarsPadding()
    ) {
        OnBoardingNavGraph(
            navController = navController
        )
    }
}

