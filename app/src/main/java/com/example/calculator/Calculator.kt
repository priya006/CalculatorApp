package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun calculator(
    viewModel:  CalculatorViewModel
) {

    Box(
        modifier = Modifier
            .fillMaxSize() // Occupy the whole available space
            .background(color = Color.Black), // Set background color
        contentAlignment = Alignment.TopEnd // Align children to center
    )
    {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .background(color = Color.White),
            horizontalAlignment = Alignment.Start
        )
        {

            // Content inside the Box
            Text(
                text = viewModel.mutableState.number1.toString(),
                modifier = Modifier
                    .padding(8.dp)
                    .width(2000.dp),
                textAlign = TextAlign.Center

            )
        }
    }

    Row(
        modifier = Modifier.fillMaxWidth().padding(75.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        CalCulatorButton(
            "Del",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {CalculatorActions.Delete}
        )
        CalCulatorButton(
            "/",
            modifier = Modifier.weight(30f),
            backgroundColor =   Color.LightGray,
            onClick = {CalculatorOperation.Divide}
        )

        CalCulatorButton(
            "+",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {CalculatorOperation.Add}
        )
        CalCulatorButton(
            "=",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {CalculatorActions.Calculate}
        )
        CalCulatorButton(
            "*",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {CalculatorOperation.Multiply}
        )
        CalCulatorButton(
            "-",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {CalculatorOperation.Subtract}
        )



    }

    Row(
        modifier = Modifier.fillMaxWidth().padding(150.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        CalCulatorButton(
            "1",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {viewModel.onAction(calculatorActions = CalculatorActions.Number(1))}
        )
        CalCulatorButton(
            "2",
            modifier = Modifier.weight(30f),
            backgroundColor =   Color.LightGray,
            onClick = {viewModel.onAction(calculatorActions = CalculatorActions.Number(2))}
        )

        CalCulatorButton(
            "3",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {viewModel.onAction(calculatorActions = CalculatorActions.Number(3))}
        )
        CalCulatorButton(
            "4",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {viewModel.onAction(calculatorActions = CalculatorActions.Number(4))}
        )
        CalCulatorButton(
            "5",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {viewModel.onAction(calculatorActions = CalculatorActions.Number(5))}
        )
        CalCulatorButton(
            "6",
            modifier = Modifier.weight(30f),
            backgroundColor = Color.LightGray,
            onClick = {viewModel.onAction(calculatorActions = CalculatorActions.Number(6))}
        )
    }
}

//@Preview
//@Composable
//fun PreviewMyBox() {
//    calculator(state = CalculatorState(1,2, CalculatorOperation.Add),{})
//}
//TODO Add the Box
//TODO Column
//Text
//Row
//Calculator Button
//Preview
