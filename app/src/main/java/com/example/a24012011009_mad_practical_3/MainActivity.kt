package com.example.a24012011009_mad_practical_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a24012011009_mad_practical_3.ui.theme._24012011009_MAD_PRACTICAL3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { // Lamda Function
            _24012011009_MAD_PRACTICAL3Theme{ // Material Theme!
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    //ButtonDemo(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    ColorBoxApp()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _24012011009_MAD_PRACTICAL3Theme {
        Greeting("Android")
    }
}

@Composable
@Preview(showBackground = true)
fun ButtonDemo(modifier: Modifier = Modifier) {
    var counter by remember { mutableStateOf(1) }
    Button(
        modifier = modifier,
        onClick = {
            counter += 1
        }
    ) {
        Text (
            text = counter.toString()
        )
    }
}