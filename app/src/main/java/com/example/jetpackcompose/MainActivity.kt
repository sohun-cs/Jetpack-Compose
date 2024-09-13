package com.example.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            /*Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            )   {
                ShowText()
                Text(
                    text = "---------- ❤ ----------",
                    fontFamily = FontFamily.Monospace,
                    fontSize = 20.sp,
                    color = Color.Green,
                    fontWeight = FontWeight.Thin,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 32.dp)
                )
                ShowText()
            }*/


            // ScrollLayout()


            Column {

                BoxLayout()
            }

        }
    }


    // Composable TextView 1
    @Composable
    fun ShowText(){

        Column{

            Text(
                text = "Jetpack Compose",
                color = Color.Green,
                fontSize = 28.sp,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
            )

            Text(
                text = "Hello Sohun, Welcome to Jetpack Compose",
                Modifier.padding(16.dp, 8.dp),
                fontFamily = FontFamily.Serif,
                color = Color.Magenta
            )

            Text(
                text = "This is Jetpack Compose used for UI design",
                Modifier.padding(16.dp, 8.dp),
                fontFamily = FontFamily.Monospace,
                color = Color.Blue
            )

            Text(
                text = "Jetpack Compose is the future of Android UI",
                Modifier.padding(16.dp, 8.dp),
                fontFamily = FontFamily.SansSerif,
                color = Color.Gray
            )

            val skills = arrayOf("Java", "Kotlin", "XML", "Jetpack Compose", "Firebase", "Room")
            for(skill in skills)
                Text(
                    text = skill,
                    modifier = Modifier.padding(28.dp, 2.dp)
                )

            Text(
                text = "I love Android..\n".repeat(20),
                textAlign = TextAlign.Center,
                color = Color.Red,
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
                    .padding(0.dp, 16.dp, 0.dp, 0.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .height(1132.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                for(i in 1..61){
                    Text(
                        text = "Jetpack Compose",
                        color = Color.White,
                        textAlign = TextAlign.Center


                    )
                }
            }
        }
    }


    // Composable View 2
    @Composable
    fun ScrollLayout(){
        LazyColumn (
            content = {
                item {
                    for( i in 1 .. 100){
                        Text(text = "Focus on your goal")
                    }
                }
            }
        )

    }


    @Composable
    fun BoxLayout(){
        val context = LocalContext.current
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Box Layout", color = Color.Red, modifier = Modifier.align(Alignment.TopStart))
            Text(text = "Box Layout", color = Color.Magenta, modifier = Modifier.align(Alignment.Center))
            Text(text = "Box Layout", color = Color.Blue, modifier = Modifier.align(Alignment.BottomEnd))

            Button(onClick = {
                Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
            ) {
                Text(text = "Button", color = Color.White)
            }
        }

    }


    @Preview(showBackground = true)
    @Composable
    fun ShowTextPreview(){
        JetpackComposeTheme {
            ShowText()
        }
    }
}


