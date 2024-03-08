package com.example.calculator

data class CalculatorState(
    val number1: Int = 1,
    val number2: Int = 2,
    val Symbol: CalculatorOperation? = null
)
