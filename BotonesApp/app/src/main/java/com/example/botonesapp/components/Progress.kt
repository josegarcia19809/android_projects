package com.example.botonesapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Progress(
    modifier: Modifier = Modifier,
    color: Color = Color.Blue
) {
    Box(
        modifier = modifier.fillMaxSize(), // ocupa todo el espacio disponible
        contentAlignment = Alignment.Center // centra el contenido
    ) {
        CircularProgressIndicator(
            Modifier.size(140.dp),
            color = Color.Red,
            strokeWidth = 15.dp,
            trackColor = Color.LightGray
        )
    }
}