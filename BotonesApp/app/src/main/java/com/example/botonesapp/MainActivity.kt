package com.example.botonesapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.botonesapp.components.BotonCambiarTema
import com.example.botonesapp.components.BotonConIcono
import com.example.botonesapp.components.BotonFlotante
import com.example.botonesapp.components.BotonIcono
import com.example.botonesapp.components.BotonNormal
import com.example.botonesapp.components.BotonOutlined
import com.example.botonesapp.components.BotonSecundario
import com.example.botonesapp.components.BotonSwitch
import com.example.botonesapp.components.BotonSwitchColor
import com.example.botonesapp.components.BotonSwitchConTexto
import com.example.botonesapp.components.BotonTexto
import com.example.botonesapp.components.FraudAlertCard
import com.example.botonesapp.components.Imagenes
import com.example.botonesapp.components.ListaCheckBox
import com.example.botonesapp.components.MenuPrincipal
import com.example.botonesapp.components.MyBasicList
import com.example.botonesapp.components.MyBasicList2
import com.example.botonesapp.components.MyBasicList3
import com.example.botonesapp.components.PantallaCheckBox
import com.example.botonesapp.components.PantallaSwitch
import com.example.botonesapp.components.PantallaTriState
import com.example.botonesapp.components.Progress
import com.example.botonesapp.components.Space
import com.example.botonesapp.components.Tarjeta
import com.example.botonesapp.ui.theme.BotonesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var darkTheme by remember { mutableStateOf(false) }
            BotonesAppTheme(darkTheme = darkTheme) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    floatingActionButton = {
                        BotonCambiarTema {
                            darkTheme = !darkTheme
                        }
                    }) { innerPadding ->
                    //Contenido(innerPadding)
                    //Imagenes(innerPadding)
                    //MyBasicList3(innerPadding)
                    // Progress(modifier = Modifier.padding(innerPadding))
                    //Tarjeta(innerPadding)
                    // FraudAlertCard()
                    //PantallaSwitch()
//                    PantallaCheckBox()
//                    ListaCheckBox()
//                    PantallaTriState()
                    cargarComponentes(innerPadding)
                }
            }
        }
    }
}

@Composable
fun cargarComponentes(paddingValues: PaddingValues) {
    MenuPrincipal()
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


