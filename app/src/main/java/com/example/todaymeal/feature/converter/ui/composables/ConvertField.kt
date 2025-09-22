package com.example.todaymeal.feature.converter.ui.composables

import androidx.annotation.StringRes
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.todaymeal.ui.theme.dimens

@Composable
fun ConvertField(
    @StringRes placeholder: Int,
    textFieldValue: String,
    onChangeTextFieldValue: (String) -> Unit,
    dropDownOptions: List<String>
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .border(
                MaterialTheme.dimens.borderWidth,
                MaterialTheme.colorScheme.primary
            )
    ) {
        TextField(
            modifier = Modifier.weight(0.6f),
            placeholder = { Text(stringResource(placeholder)) },
            value = textFieldValue,
            onValueChange = onChangeTextFieldValue
        )
        DropdownList(
            modifier = Modifier.weight(0.4f),
            options = dropDownOptions
        )
    }
}