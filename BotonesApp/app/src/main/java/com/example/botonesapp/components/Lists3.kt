package com.example.botonesapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import com.example.botonesapp.R

@Composable
fun MyBasicList3(paddingValues: PaddingValues) {
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

    val imagenes = listOf(
        "jesus",
        "juan",
        "maria",
        "nohemi",
        "pedro",
        "ruth"
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5)),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            top = paddingValues.calculateTopPadding(),
            bottom = paddingValues.calculateBottomPadding()
        ),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(names) { name ->

            val randomText = descriptions.random()

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        println("Click en $name")
                    },
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                val randomImageName = imagenes.random()

                val imageRes = when (randomImageName) {
                    "jesus" -> R.drawable.jesus
                    "juan" -> R.drawable.juan
                    "maria" -> R.drawable.maria
                    "nohemi" -> R.drawable.nohemi
                    "pedro" -> R.drawable.pedro
                    "ruth" -> R.drawable.ruth
                    else -> R.drawable.jesus
                }

                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(id = imageRes),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                    )

                    Column(
                        modifier = Modifier.padding(start = 12.dp)
                    ) {
                        Text(
                            text = name,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF222222)
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = randomText,
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}