package com.example.todaymeal.feature.converter.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.todaymeal.R
import com.example.todaymeal.feature.converter.data.Units
import com.example.todaymeal.ui.theme.dimens

@Composable
fun Converter() {
    var amount by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .padding(horizontal = MaterialTheme.dimens.paddingMedium)
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(MaterialTheme.dimens.paddingSmall),
            text = stringResource(R.string.unit_converter),
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            modifier = Modifier.padding(MaterialTheme.dimens.paddingLarge),
            text = stringResource(R.string.from),
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.secondary
        )
        ConvertField(
            placeholder = R.string.amount,
            textFieldValue = amount,
            onChangeTextFieldValue = {
                if (amount.toIntOrNull() != null)
                    amount = it
            },
            dropDownOptions = Units.entries.map{ it.name }
        )
        ElevatedButton(
            modifier = Modifier.size(MaterialTheme.dimens.circleBtn),
            onClick = {  },
            colors = ButtonColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary,
                disabledContainerColor = MaterialTheme.colorScheme.tertiary.copy(alpha = 0.3f),
                disabledContentColor = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.3f)
            ),
            shape = CircleShape
        ) {
            Icon(
                modifier = Modifier.size(MaterialTheme.dimens.circleBtn),
                painter = painterResource(R.drawable.swap_vert_32),
                contentDescription = "Swap Btn"
            )
        }
        Text(
            modifier = Modifier.padding(MaterialTheme.dimens.paddingLarge),
            text = stringResource(R.string.to),
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.secondary
        )
        ConvertField(
            placeholder = R.string.result,
            textFieldValue = result,
            onChangeTextFieldValue = {
                if (result.toIntOrNull() != null)
                    result = it
            },
            dropDownOptions = Units.entries.map{ it.name }
        )
    }
}