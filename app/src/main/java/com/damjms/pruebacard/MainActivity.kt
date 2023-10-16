package com.damjms.pruebacard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.damjms.pruebacard.ui.theme.PruebaCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaCardTheme {
                // A surface container using the 'background' color from the theme
                Column() {
                    Greeting(
                        painterResource(id = R.drawable.logo),
                        "Hola mundo",
                        "Hola mundo es un saludo"
                    )
                    Greeting(
                        painterResource(id = R.drawable.logo),
                        "Hola mundo",
                        "Hola mundo es un saludo"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(image: Painter, titulo: String, descripcion: String) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = Modifier.size(width = 430.dp, height = 200.dp)
    ) {
        Row {
            Image(painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
            )

            Column {
                Text(
                    text = titulo,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(16.dp)
                )
                Text(
                    text = descripcion,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
        }
    }
}
