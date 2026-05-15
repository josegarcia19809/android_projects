package com.example.botonesapp.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ToggleControl : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PantallaSwitch()
        }
    }
}

@Composable
fun PantallaSwitch() {

    // Estado del Switch
    var activado by remember {
        mutableStateOf(false)
    }
// Estado Switch con thumbContent
    var activadoIcono by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Switch(
            checked = activado,
            onCheckedChange = {
                activado = it
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = if (activado)
                "✅ Switch ACTIVADO"
            else
                "❌ Switch DESACTIVADO",

            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Switch(
            checked = activadoIcono,
            onCheckedChange = {
                activadoIcono = it
            },

            thumbContent = {
                Icon(
                    imageVector =
                        if (activadoIcono)
                            Icons.Default.Check
                        else
                            Icons.Default.Close,

                    contentDescription = null
                )
            }
        )

        Text(
            text = if (activadoIcono)
                "🌙 Modo activado"
            else
                "☀️ Modo desactivado"
        )
    }
}