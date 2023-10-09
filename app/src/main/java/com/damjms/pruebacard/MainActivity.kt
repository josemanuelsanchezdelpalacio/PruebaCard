package com.damjms.pruebacard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.damjms.pruebacard.ui.theme.PruebaCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        titulo = "TARJETA",
                        descripcion = "Aqui pongo un poco de texto para la card",
                        imagen = R.drawable.logo
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(titulo: String, descripcion: String, imagen: Int) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                // Image on the left side
                Image(
                    painter = painterResource(id = imagen),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(8.dp),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = titulo,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                    Text(
                        text = descripcion,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                }
            }
        }
    }
}
