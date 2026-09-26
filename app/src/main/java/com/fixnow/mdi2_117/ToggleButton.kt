package com.fixnow.mdi2_117

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

object ToggleButtonTag {
    const val TAG = "ToggleButton"
}

@Composable
fun ToggleButton(){
    var label by remember { mutableStateOf("Tap me) }
    Button(
        onClick = {
            label = if (label == "Tap me") "Tapped" else "Tap me"
        },
        modifier = Modifier.testTag(ToggleButtonTag.TAG)
    )
}