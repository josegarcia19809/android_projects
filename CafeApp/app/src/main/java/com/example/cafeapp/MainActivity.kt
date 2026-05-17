package com.example.cafeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BackgroundImageScreen()
        }
    }
}

@Composable
fun BackgroundImageScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.fondo_cafe),
            contentDescription = "Fondo de pantalla",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Otros elementos sobre la imagen
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacer(modifier = Modifier.weight(3f))
            Titulo()
            BotonConIcono()
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun PreviewBackgroundImageScreen() {
    BackgroundImageScreen()
}

@Composable
fun Titulo() {
    val pacificoRegular = FontFamily(Font(R.font.pacifico_regular)) // Carga la fuente
    Text(
        text = "COFFE SHOP",
        fontWeight = FontWeight.Bold,
        fontFamily = pacificoRegular,
        fontSize = 48.sp,
        textAlign = TextAlign.Center,
        color = Color(0xFF53231f),
        modifier = Modifier
            .background(Color.White.copy(alpha = 0.0f))
            .padding(8.dp)
    )
}

@Preview
@Composable
private fun TituloPreview() {
    Titulo()
}

@Composable
fun BotonConIcono() {
    val sourceSans = FontFamily(Font(R.font.source_sans3))
    Button(
        onClick = { /* Acción al hacer clic */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF53231f), // Color de fondo del botón
            contentColor = Color.White // Color del contenido (icono y texto)
        ),
        modifier = Modifier.padding(16.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Send, // Ícono predeterminado
            contentDescription = "Icono",
            modifier = Modifier.size(24.dp) // Tamaño del ícono
        )
        Spacer(modifier = Modifier.width(8.dp)) // Espacio entre el ícono y el texto
        Text(
            "INGRESAR",
            fontWeight = FontWeight.Bold,
            fontFamily = sourceSans,
            fontSize = 24.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BotonConIconoPreview() {
    BotonConIcono()
}

