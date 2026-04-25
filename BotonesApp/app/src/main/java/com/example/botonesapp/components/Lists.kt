package com.example.botonesapp.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyBasicList(paddingValues: PaddingValues) {
    val names = listOf(
        "José",
        "María",
        "Juan",
        "Ana",
        "Luis",
        "Carlos",
        "Laura",
        "Miguel",
        "Sofía",
        "Jorge",
        "Lucía",
        "Pedro",
        "Elena",
        "Diego",
        "Valeria",
        "Andrés",
        "Fernanda",
        "Ricardo",
        "Daniela",
        "Hugo",
        "Paula",
        "Fernando",
        "Camila",
        "Raúl",
        "Adriana",
        "Eduardo",
        "Gabriela",
        "Sergio",
        "Natalia",
        "Alberto",
        "Patricia",
        "Francisco",
        "Alejandra",
        "Roberto",
        "Claudia",
        "Manuel",
        "Diana",
        "Javier",
        "Mónica",
        "Iván",
        "Verónica",
        "Emilio",
        "Isabel",
        "Guillermo",
        "Rosa",
        "Arturo",
        "Silvia",
        "Tomás",
        "Carmen",
        "Óscar",
        "Teresa"
    )
    LazyColumn {
        items(names) {
            Text(it, modifier = Modifier.padding(24.dp))
        }
    }
}