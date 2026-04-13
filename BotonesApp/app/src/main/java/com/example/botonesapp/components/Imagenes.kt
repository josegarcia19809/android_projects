package com.example.botonesapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.botonesapp.R

@Composable
fun Imagenes(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.venado2),
            contentDescription = "image profile"
        )

        Image(
            painter = painterResource(R.drawable.venado2),
            contentDescription = "image profile",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(50))
                .border(
                    width = 4.dp, shape = CircleShape,
                    brush = Brush.linearGradient(colors = listOf(Color.Red, Color.White))
                ),
            contentScale = ContentScale.FillBounds
        )

        AsyncImage(
            model = "https://i.blogs.es/9d6c67/rawjpeg/1366_2000.jpg",
            contentDescription = "Imagen desde internet",
            modifier = Modifier.size(250.dp)
        )

        Icon(
            painter = painterResource(R.drawable.baseline_bluetooth_searching_24),
            contentDescription = null,
            modifier = Modifier.size(100.dp),
            tint = Color.Blue
        )

    }
}