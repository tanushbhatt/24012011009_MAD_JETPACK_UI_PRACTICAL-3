package com.example.a24012011009_mad_practical_3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColorBoxApp(modifier: Modifier = Modifier){
    var redState by remember { mutableStateOf(true) }
    var blueState by remember { mutableStateOf(true) }
    var greenState by remember { mutableStateOf(true) }

    Column(Modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = redState,
                onCheckedChange = {
                    redState = it
                }
            )
            Text(
                text = "Red"
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically){
            Checkbox(
                checked = blueState,
                onCheckedChange = {
                    blueState = it
                }
            )
            Text(
                text = "Blue"
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically){
            Checkbox(
                checked = greenState,
                onCheckedChange = {
                    greenState = it
                }
            )
            Text(
                text = "Green"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            if(redState){
                Box(
                    modifier = Modifier.fillMaxSize()
                        .background(Color.Red)
                )
            }
            if(blueState){
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(16.dp).background(Color.Blue)
                )
            }
            if(greenState){
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(40.dp).background(Color.Green)
                )
            }
        }

    }
}
















//package com.example.a24012011009_mad_practical_3
//
//import android.graphics.Paint
//import android.widget.CheckBox
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Checkbox
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
//@Composable
//fun checkbox(modifier: Modifier = Modifier) {
//    var redstate by remember { mutableStateOf(true)}
//    var bluestate by remember { mutableStateOf(true)}
//    var greenstate by remember { mutableStateOf(true)}
//
//    Column(Modifier.padding(15.dp)) {
//        listOf(
//            "Red" to redstate,
//            "Green" to greenstate,
//            "Blue" to bluestate
//        ).forEach { (name, checked) ->
//            Row(verticalAlignment = Alignment.CenterVertically){
//
//        }
//}
//    Row() {
//        Checkbox(
//            checked = bluestate,
//            onCheckedChange = {
//                bluestate = it
//            }
//        )
//        Text(text = "Blue")
//    }
//}
//
//    Row(){
//
//        Checkbox(
//            checked = greenstate,
//            onCheckedChange = {
//                greenstate = it
//            }
//        )
//        Text(text = "Green")
//    }
//}
//
//
//@Composable
//@Preview
//fun CheckBoxDemo(){
//    var state by remember() { mutableSetOf(false) }
//    CheckBox(
//        checked = state,
//        onCheckedChange = {
//            state = it
//        }
//    )
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    CheckBoxDemo(modifier)
//}
//
//
//
//
////Row(modifier  =Modifier.clickable{
////    onClicked(!checked)
////}, verticalAlignment = Alignment.CenterVertically) {
////    Checkbox(
////        checked  = checked,
////        onCheckedChange = {
////            onClicked(it)
////        }
////    )
////    Text(
////    text = label,
////    modifier = Modifier.padding(8.dp)
////    )
////}
////)
//
//
//
//
//
////Box(
////    modifier = Modifier
////    .fillMaxSize()
////    .padding(top = 16.dp)
////){
////    if(redstate){
////        Box(
////            modifier = Modifier.fillMaxSize().background(Color.Red)
////        )
////    }
////    if(greenstate){
////        Box(
////            modifier = Modifier.fillMaxSize().padding(32.dp).background(Color.Color)
////        )
////    }
////    if(bluestate){
////        Box(
////            modifier = Modifier.fillMaxSize().padding(64.dp).background(Color.Blue)
////        )
////    }
////
////    }
////}