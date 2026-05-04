package com.example.botonesapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Progress(
    modifier: Modifier = Modifier,
    color: Color = Color.Blue
) {
    var progress by remember { mutableFloatStateOf(0.5f) }
    Column(
        modifier = modifier.fillMaxSize(), // ocupa todo el espacio disponible
        verticalArrangement = Arrangement.Center, // centra el contenido
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            Modifier.size(140.dp),
            color = Color.Red,
            strokeWidth = 15.dp,
            trackColor = Color.LightGray
        )
        Spacer(Modifier.height(24.dp))
        LinearProgressIndicator(
            color = Color.Red,
            strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
            trackColor = Color.LightGray
        )

        Spacer(Modifier.height(24.dp))
        CircularProgressIndicator(
            progress = { progress },
            Modifier.size(140.dp),
            color = Color.Red,
            strokeWidth = 15.dp,
            trackColor = Color.LightGray
        )
        Spacer(Modifier.height(24.dp))
        Row(Modifier.padding(24.dp)) {
            Button(onClick = { progress += 0.1f }) { Text("<-") }
            Spacer(Modifier.width(24.dp))
            Button(onClick = { progress -= 0.1f }) { Text("->") }
        }

    }
}