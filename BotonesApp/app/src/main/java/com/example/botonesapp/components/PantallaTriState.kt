package com.example.botonesapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PantallaTriState() {

    // Estados de los checkbox hijos
    val opciones = remember {
        mutableStateListOf(false, false, false)
    }

    // Estado del TriStateCheckbox
    val estadoPadre = when {

        opciones.all { it } ->
            ToggleableState.On

        opciones.none { it } ->
            ToggleableState.Off

        else ->
            ToggleableState.Indeterminate
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "📚 Materias",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        // TRI STATE CHECKBOX
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            TriStateCheckbox(
                state = estadoPadre,

                onClick = {

                    val nuevoEstado =
                        estadoPadre != ToggleableState.On

                    for (i in opciones.indices) {
                        opciones[i] = nuevoEstado
                    }
                }
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Seleccionar todas",
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // CHECKBOX HIJOS
        val materias = listOf(
            "📘 Matemáticas",
            "💻 Programación",
            "🧪 Química"
        )

        materias.forEachIndexed { indice, materia ->

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Checkbox(
                    checked = opciones[indice],

                    onCheckedChange = {

                        opciones[indice] = it
                    }
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = materia,
                    fontSize = 18.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text =
                when (estadoPadre) {

                    ToggleableState.On ->
                        "✅ Todas seleccionadas"

                    ToggleableState.Off ->
                        "❌ Ninguna seleccionada"

                    ToggleableState.Indeterminate ->
                        "⚠️ Selección parcial"
                },

            fontSize = 20.sp
        )
    }
}