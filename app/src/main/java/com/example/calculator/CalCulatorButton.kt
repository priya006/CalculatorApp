package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CalCulatorButton(
    numbersAndSymbols: String,
    modifier: Modifier,
    backgroundColor: Color,
    onClick: () -> Unit
) {
    Box(modifier = Modifier
        .clip(CircleShape)
        .clickable {
            onClick()
        }
        .background(color = backgroundColor)
            then(modifier))
    {

        Column( verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.Start
              ){
            //Add Child Component Text
            Text(text = numbersAndSymbols,
                fontSize =  36.sp,
                color = Color.White)
        }



    }


    
}