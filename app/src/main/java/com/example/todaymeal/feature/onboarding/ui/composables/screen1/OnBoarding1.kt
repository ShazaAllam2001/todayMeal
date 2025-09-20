package com.example.todaymeal.feature.onboarding.ui.composables.screen1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.todaymeal.feature.onboarding.ui.composables.SkipOnboarding
import com.example.todaymeal.R
import com.example.todaymeal.feature.onboarding.ui.composables.ProgressDots
import com.example.todaymeal.feature.onboarding.ui.composables.navigation.OnBoardingScreens
import com.example.todaymeal.ui.theme.dimens

@Composable
fun OnBoarding1(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(MaterialTheme.dimens.paddingMedium)
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SkipOnboarding()
        Image(
            modifier = Modifier.clip(CircleShape),
            painter = painterResource(R.drawable.onboarding1),
            contentDescription = "Onboarding Welcome"
        )
        ProgressDots(totalDots = 3, selectedIndex = 0)
        Column(
            modifier = Modifier.padding(
                horizontal = MaterialTheme.dimens.paddingSmall,
                vertical = MaterialTheme.dimens.paddingMedium
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.welcome_to),
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = stringResource(R.string.today_s_meal),
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.labelLarge
            )
            Spacer(modifier = Modifier.height(MaterialTheme.dimens.paddingMedium))
            Text(
                text = stringResource(R.string.app_desc),
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        ElevatedButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate(OnBoardingScreens.Features.route) },
            colors = ButtonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.secondary,
                disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f),
                disabledContentColor = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.3f)
            ),
            shape = RoundedCornerShape(MaterialTheme.dimens.roundCorner)
        ) {
            Text(
                text = stringResource(R.string.start),
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}