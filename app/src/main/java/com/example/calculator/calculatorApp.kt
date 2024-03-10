package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.Purple40


@Composable
fun calculatorApp(
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
                //TODO figure out how to get number 2
                text = "${calculatorViewModel.mutableState.number1}\n ${calculatorViewModel.mutableState.number2}",
                modifier = Modifier
                    .padding(8.dp)
                    .width(500.dp)
                    .height(100.dp)
                    .background(color = Color.White),
                textAlign = TextAlign.Right
            )

            Divider(
                color = Purple40,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 17.dp, vertical = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val numbers: List<Int> = (0..9).toList()
                    items(numbers) { buttonText ->
                        CalculatorButton(
                            text = buttonText,
                            modifier = Modifier.background(color = Color.Gray, shape = CircleShape),
                            contentColor = Color.White,
                            onClick = { calculatorViewModel.addition(buttonText)}
                        )
                    }

                }

            }
            val mathOperations = listOf("+", "-", "*", "/","=","AC")
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.Bottom,
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                items(mathOperations) { buttonText ->
                    CalculatorButton(
                        text = buttonText,
                        modifier = Modifier.background(color = Color.Gray, shape = CircleShape),
                        contentColor = Color.White,
                        onClick = {calculatorViewModel.onAction(buttonText)}
                    )
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
