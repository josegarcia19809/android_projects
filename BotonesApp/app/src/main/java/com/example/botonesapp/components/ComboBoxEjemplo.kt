package com.example.botonesapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComboBoxEjemplo() {

    var expanded by remember {
        mutableStateOf(false)
    }

    val opciones = listOf(
        "Perfil",
        "Configuración",
        "Cerrar sesión"
    )

    var opcionSeleccionada by remember {
        mutableStateOf(opciones[0])
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            }
        ) {

            OutlinedTextField(
                value = opcionSeleccionada,
                onValueChange = {},
                readOnly = true,
                label = {
                    Text("Opciones")
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = expanded
                    )
                },
                modifier = Modifier.menuAnchor()
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {

                opciones.forEach { opcion ->

                    DropdownMenuItem(
                        text = {
                            Text(opcion)
                        },
                        onClick = {
                            opcionSeleccionada = opcion
                            expanded = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Seleccionaste: $opcionSeleccionada")
    }
}