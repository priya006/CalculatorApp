package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun calculator(
    calculatorViewModel: CalculatorViewModel
) {

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
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = calculatorViewModel.mutableState.number1.toString(),
                modifier = Modifier
                    .padding(8.dp)
                    .width(500.dp)
                    .height(100.dp)
                    .background(color = Color.White),
                textAlign = TextAlign.Right
            )
        }



        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(10) {
                CalculatorButton(
                    text = "1",
                    modifier = Modifier.background(color = Color.Gray, shape = CircleShape),
                    contentColor = Color.White
                ) {

                }
            }

        }
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(10) {
                CalculatorButton(
                    text = "2",
                    modifier = Modifier.background(color = Color.Gray, shape = CircleShape),
                    contentColor = Color.White
                ) {

                }
            }

        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomEnd),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(10) {
                CalculatorButton(
                    text = "3",
                    modifier = Modifier.background(color = Color.Gray, shape = CircleShape),
                    contentColor = Color.White
                ) {

                }
            }

        }

    }


}


@Preview
@Composable
fun CalculatorPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(color = Color.Black),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = "123", // Assuming calculatorViewModel.mutableState.number1.toString()
                modifier = Modifier
                    .padding(8.dp)
                    .width(500.dp)
                    .height(100.dp)
                    .background(color = Color.White),
                textAlign = TextAlign.Right
            )
        }


    }
}
