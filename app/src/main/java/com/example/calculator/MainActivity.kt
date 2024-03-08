package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {

    //Declare your view model instance
    private val calculatorViewModel = CalculatorViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                calculatorApp(
                    calculatorViewModel
                )
            }
        }
    }
}

