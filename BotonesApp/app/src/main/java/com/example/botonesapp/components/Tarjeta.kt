package com.example.botonesapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botonesapp.R

val playFont = FontFamily(
    Font(resId = R.font.playwrite_ar_guides_regular)
)

@Composable
fun Tarjeta(paddingValues: PaddingValues) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Texto con fuente personalizada
            Text(
                text = "Uso de fuentes en Android",
                fontFamily = playFont,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Texto con fuente por default
            Text(
                text = "Texto con fuente predeterminada",
                fontSize = 16.sp
            )
        }
    }
}