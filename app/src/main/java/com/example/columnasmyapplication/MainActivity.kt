package com.example.columnasmyapplication
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.columnasmyapplication.ui.theme.ColumnasMyApplicationTheme
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            app()


        }
    }
}

@Preview
@Composable
fun app() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        item {
            Image(
                modifier = Modifier.fillMaxWidth().height(400.dp),
                painter = painterResource(id = R.drawable.snoopy_dancing),
                contentDescription = "snoopy"
            )
            Text(
                text = "zayra",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = "Suscribete", color = Color.White)
            Text(text = "Hola", color = Color.White)
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                item {
                    Text(text = "Stack:", color = Color.White)
                    Text(text = "Java", color = Color.White)
                    Text(text = "c++", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)
                    Text(text = "SUSCRIBETE", color = Color.White)


                }
            }

        }
    }
}