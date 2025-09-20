package com.example.todaymeal.feature.main.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.todaymeal.feature.onboarding.ui.composables.OnBoarding
import com.example.todaymeal.ui.theme.TodayMealTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodayMealTheme {
                OnBoarding()
            }
        }
    }
}