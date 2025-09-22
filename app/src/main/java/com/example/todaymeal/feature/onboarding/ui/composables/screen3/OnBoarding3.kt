package com.example.todaymeal.feature.onboarding.ui.composables.screen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.todaymeal.R
import com.example.todaymeal.feature.onboarding.ui.composables.progress.ProgressDashes
import com.example.todaymeal.feature.onboarding.ui.composables.SkipOnboarding
import com.example.todaymeal.feature.onboarding.ui.composables.navigation.OnBoardingScreens
import com.example.todaymeal.feature.personalize.data.constants.Cuisine
import com.example.todaymeal.feature.personalize.data.constants.Dietary
import com.example.todaymeal.ui.theme.dimens

@Composable
fun OnBoarding3(navController: NavHostController) {
    val dietary = Dietary.entries.map { it.name }
    val cuisine = Cuisine.entries.map { it.name }
    val dietaryCheckedStates = remember { mutableStateListOf(*Array(dietary.size) { false }) }
    val cuisineCheckedStates = remember { mutableStateListOf(*Array(cuisine.size) { false }) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .padding(horizontal = MaterialTheme.dimens.paddingMedium)
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SkipOnboarding(navController = navController)
        ProgressDashes(totalDots = 3, selectedIndex = 2)
        Column(
            verticalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.paddingMedium)
        ) {
            Text(
                text = stringResource(R.string.personalize_your_experience),
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = stringResource(R.string.personalize_desc),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.height(MaterialTheme.dimens.paddingMedium))
            Text(
                text = stringResource(R.string.dietary_preferences),
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.secondary
            )
            CheckListGrid(
                modifier = Modifier.weight(0.3f),
                checkedStates = dietaryCheckedStates,
                items = dietary
            )
            Spacer(modifier = Modifier.height(MaterialTheme.dimens.paddingMedium))
            Text(
                text = stringResource(R.string.cuisine_preferences),
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.secondary
            )
            CheckListGrid(
                modifier = Modifier.weight(0.3f),
                checkedStates = cuisineCheckedStates,
                items = cuisine
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.paddingMedium)
            ) {
                ElevatedButton(
                    modifier = Modifier.weight(0.5f),
                    onClick = { navController.navigate(OnBoardingScreens.Features.route) },
                    colors = ButtonColors(
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                        disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.5f),
                        disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer.copy(alpha = 0.3f)
                    ),
                    shape = RoundedCornerShape(MaterialTheme.dimens.roundCorner)
                ) {
                    Text(
                        text = stringResource(R.string.previous),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
                ElevatedButton(
                    modifier = Modifier.weight(0.5f),
                    onClick = { navController.navigate(OnBoardingScreens.Main.route) },
                    colors = ButtonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                        disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f),
                        disabledContentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f)
                    ),
                    shape = RoundedCornerShape(MaterialTheme.dimens.roundCorner)
                ) {
                    Text(
                        text = stringResource(R.string.next),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }
}