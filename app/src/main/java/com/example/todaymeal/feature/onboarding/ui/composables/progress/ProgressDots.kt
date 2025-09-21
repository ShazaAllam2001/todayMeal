package com.example.todaymeal.feature.onboarding.ui.composables.progress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.example.todaymeal.ui.theme.dimens

@Composable
fun ProgressDots(
    totalDots: Int,
    selectedIndex: Int
) {
    Row(
        modifier = Modifier.padding(MaterialTheme.dimens.paddingMedium),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(totalDots) { index ->
            val color = if (index == selectedIndex) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
            Box(
                modifier = Modifier
                    .size(MaterialTheme.dimens.circleDot)
                    .padding(MaterialTheme.dimens.paddingSmall)
                    .clip(CircleShape)
                    .background(color)
            )
        }
    }
}
