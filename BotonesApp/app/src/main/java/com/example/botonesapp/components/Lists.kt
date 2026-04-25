package com.example.botonesapp.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
    val descriptions = listOf(
        "Usuario activo",
        "Nuevo registro",
        "Cliente frecuente",
        "Invitado",
        "Cuenta verificada",
        "Sin actividad reciente"
    )
    LazyColumn {
        items(names) {
            val randomText = descriptions.random()
            Text(
                it, modifier = Modifier.padding(20.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF222222)
            )

            // ⚪ Texto secundario (más suave)
            Text(
                modifier = Modifier.padding(20.dp),
                text = randomText,
                fontSize = 14.sp,
                color = Color.Gray
            )

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 6.dp),
                thickness = 1.dp,
                color = Color.LightGray
            )
        }
    }
}