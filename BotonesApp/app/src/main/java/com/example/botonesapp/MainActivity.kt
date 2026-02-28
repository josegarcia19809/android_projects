package com.example.botonesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botonesapp.ui.theme.BotonesAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FloatingActionButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BotonesAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Contenido(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Contenido(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()
        Space()
        BotonSecundario()
        Space()
        BotonOutlined()
        Space()
        BotonTexto()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        BotonSwitchConTexto()
        Space()
        BotonSwitchColor()
        Space()
        BotonConIcono()
        Space()
        BotonFlotante()
    }
}

@Composable
fun BotonFlotante() {
    FloatingActionButton(
        onClick = { },
        containerColor = Color(0xFF1976D2),
        contentColor = Color.White
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Agregar"
        )
    }
}
@Composable
fun BotonConIcono() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6200EE),
            contentColor = Color.White
        )
    ) {

        Icon(
            imageVector = Icons.Default.ShoppingCart,
            contentDescription = "Carrito",
            modifier = Modifier.padding(end = 8.dp)
        )

        Text(
            text = "Comprar",
            fontSize = 18.sp
        )
    }
}
@Composable
fun BotonSwitchColor() {

    var estado by remember { mutableStateOf(true) }

    Switch(
        checked = estado,
        onCheckedChange = { estado = it },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = Color(0xFF388E3C),
            uncheckedTrackColor = Color.LightGray
        )
    )
}

@Composable
fun BotonSwitchConTexto() {

    var estado by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = if (estado) "Activado" else "Desactivado",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.width(10.dp))

        Switch(
            checked = estado,
            onCheckedChange = { estado = it }
        )
    }
}

@Composable
fun BotonSwitch() {

    var estado by remember { mutableStateOf(false) }

    Switch(
        checked = estado,
        onCheckedChange = { nuevoValor ->
            estado = nuevoValor
        }
    )
}
@Composable
fun BotonIcono() {
    IconButton(onClick = {}) {
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favorito",
            tint = Color(0xFFE53935)
        )
    }
}

@Composable
fun BotonNormal() {
    ElevatedButton(
        onClick = {},
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = Color(0xFF1976D2),
            contentColor = Color.White
        )
    ) {
        Text(text = "Primario", fontSize = 20.sp)
    }
}

@Composable
fun BotonSecundario() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF388E3C),
            contentColor = Color.White
        )
    ) {
        Text(text = "Secundario", fontSize = 20.sp)
    }
}

@Composable
fun BotonOutlined() {
    OutlinedButton(
        onClick = {},
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color(0xFFD32F2F)
        ),
        border = BorderStroke(2.dp, Color(0xFFD32F2F))
    ) {
        Text(text = "Outlined", fontSize = 20.sp)
    }
}

@Composable
fun BotonTexto() {
    TextButton(
        onClick = {},
        colors = ButtonDefaults.textButtonColors(
            contentColor = Color(0xFF7B1FA2)
        )
    ) {
        Text(text = "Text Button", fontSize = 20.sp)
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}
