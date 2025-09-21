package com.example.todaymeal.feature.onboarding.ui.composables.screen3

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.todaymeal.ui.theme.dimens


@Composable
fun CheckListGrid(
    modifier: Modifier = Modifier,
    items: List<String>
) {
    val checkedStates = remember { mutableStateListOf(*Array(items.size) { false }) }

    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.paddingSmall),
        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.dimens.paddingSmall)
    ) {
        items(items.size) { index ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.border(
                    width = MaterialTheme.dimens.borderWidth,
                    color = if(checkedStates[index]) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary,
                    shape = RoundedCornerShape(MaterialTheme.dimens.roundCorner)
                )
                    .padding(MaterialTheme.dimens.paddingExtraSmall)
            ) {
                Checkbox(
                    checked = checkedStates[index],
                    onCheckedChange = { checkedStates[index] = it },
                    colors = CheckboxColors(
                        checkedCheckmarkColor = MaterialTheme.colorScheme.background,
                        uncheckedCheckmarkColor = MaterialTheme.colorScheme.background,
                        checkedBoxColor = MaterialTheme.colorScheme.primary,
                        uncheckedBoxColor = MaterialTheme.colorScheme.background,
                        disabledCheckedBoxColor = Color.Unspecified,
                        disabledUncheckedBoxColor = Color.Unspecified,
                        disabledIndeterminateBoxColor = Color.Unspecified,
                        checkedBorderColor = MaterialTheme.colorScheme.primary,
                        uncheckedBorderColor = MaterialTheme.colorScheme.secondary,
                        disabledBorderColor = Color.Unspecified,
                        disabledUncheckedBorderColor = Color.Unspecified,
                        disabledIndeterminateBorderColor = Color.Unspecified
                    )
                )
                Spacer(modifier = Modifier.width(MaterialTheme.dimens.paddingExtraSmall))
                Text(
                    text = items[index],
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}
