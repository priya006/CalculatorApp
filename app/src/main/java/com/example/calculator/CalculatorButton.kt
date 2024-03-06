package com.example.calculator


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colorScheme.secondary,
    contentColor: Color = MaterialTheme.colorScheme.onSecondary,
    shape: Shape = RoundedCornerShape(8.dp),
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .background(backgroundColor, shape)
            .clickable { onClick }
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = contentColor,


            )
    }
}


@Preview
@Composable
fun CalculatorButtonPreview() {
    CalculatorButton(
        text = "1",
        modifier = Modifier.background(color = Color.Gray, shape = CircleShape),
        contentColor = Color.White
    ) {

    }

//    CalculatorButton(
//        text = "+",
//        modifier = Modifier.background(color = Color.Gray, shape = CutCornerShape(
//            topStart = 8.dp,
//            topEnd = 8.dp,
//            bottomStart = 8.dp,
//            bottomEnd = 8.dp
//        )),
//        contentColor = Color.White
//    ) {

}
