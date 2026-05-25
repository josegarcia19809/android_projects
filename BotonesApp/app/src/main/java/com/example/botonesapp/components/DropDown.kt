package com.example.botonesapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MenuPrincipal() {

    var expanded by remember {
        mutableStateOf(false)
    }

    var opcionSeleccionada by remember {
        mutableStateOf("Selecciona una opción")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Caja tipo ComboBox
        Box {

            OutlinedCard(
                modifier = Modifier
                    .width(250.dp)
                    .clickable {
                        expanded = true
                    }
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(text = opcionSeleccionada)

                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Abrir menú"
                    )
                }
            }

            MenuDesplegable(
                expanded = expanded,
                onDismiss = {
                    expanded = false
                }
            ) {

                ItemMenu(
                    texto = "Perfil",
                    onClick = {
                        opcionSeleccionada = "Perfil"
                        expanded = false
                    }
                )

                ItemMenu(
                    texto = "Configuración",
                    onClick = {
                        opcionSeleccionada = "Configuración"
                        expanded = false
                    }
                )

                ItemMenu(
                    texto = "Cerrar sesión",
                    onClick = {
                        opcionSeleccionada = "Cerrar sesión"
                        expanded = false
                    }
                )
            }
        }
    }
}

@Composable
fun MenuDesplegable(
    expanded: Boolean,
    onDismiss: () -> Unit,
    contenido: @Composable () -> Unit
) {

    Box {

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                onDismiss()
            }
        ) {

            contenido()
        }
    }
}

@Composable
fun ItemMenu(
    texto: String,
    onClick: () -> Unit
) {

    DropdownMenuItem(
        text = {
            Text(text = texto)
        },
        onClick = {
            onClick()
        }
    )

}