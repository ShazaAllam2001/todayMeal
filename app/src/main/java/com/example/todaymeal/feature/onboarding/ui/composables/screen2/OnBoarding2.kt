package com.example.todaymeal.feature.onboarding.ui.composables.screen2

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.todaymeal.R
import com.example.todaymeal.feature.onboarding.ui.composables.progress.ProgressDots
import com.example.todaymeal.feature.onboarding.ui.composables.SkipOnboarding
import com.example.todaymeal.feature.onboarding.ui.composables.navigation.OnBoardingScreens
import com.example.todaymeal.ui.theme.dimens

@Composable
fun OnBoarding2(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .padding(horizontal = MaterialTheme.dimens.paddingMedium)
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SkipOnboarding(navController = navController)
        Image(
            modifier = Modifier.clip(CircleShape),
            painter = painterResource(R.drawable.onboarding2),
            contentDescription = "Onboarding Value"
        )
        ProgressDots(totalDots = 3, selectedIndex = 1)
        Column(
            modifier = Modifier.padding(
                horizontal = MaterialTheme.dimens.paddingSmall,
                vertical = MaterialTheme.dimens.paddingExtraLarge
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.app_features),
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(MaterialTheme.dimens.paddingMedium))
            Text(
                text = stringResource(R.string.app_features_desc),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.paddingMedium)
        ) {
            ElevatedButton(
                modifier = Modifier.weight(0.5f),
                onClick = { navController.navigate(OnBoardingScreens.Welcome.route) },
                colors = ButtonColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                    contentColor = MaterialTheme.colorScheme.onTertiary,
                    disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.5f),
                    disabledContentColor = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.3f)
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
                onClick = { navController.navigate(OnBoardingScreens.Preferences.route) },
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