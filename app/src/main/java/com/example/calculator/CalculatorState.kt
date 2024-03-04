package com.example.calculator

data class CalculatorState(
    val number1: Int = 1,
    val number2: Int = 1,
    val Symbol: CalculatorOperation? = null
)
