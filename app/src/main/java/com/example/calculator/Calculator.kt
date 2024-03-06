package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun calculator(

) {
    var textValue by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(color = Color.Black),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = textValue,
                modifier = Modifier
                    .padding(8.dp)
                    .width(2000.dp)
                    .height(100.dp)
                    .background(color = Color.White),
                textAlign = TextAlign.Center

            )
            for (i in 0..3) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    for (j in (i - 1) * 3 + 2..i * 3) {
                        Button(
                            onClick = { textValue += j.toString() },
                            modifier = Modifier.width(80.dp)
                        ) {
                            Text(text = j.toString())
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }


            }

            for (i in 0..1) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    for (j in (i - 1) * 3 + 2..i * 3) {
                        Button(
                            onClick = { textValue += j.toString() },
                            modifier = Modifier.width(80.dp)
                        ) {
                            Text(text = "+")
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }

            }


        }
    }
}
