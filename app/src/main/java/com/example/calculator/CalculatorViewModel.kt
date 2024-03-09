package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


//ViewModel Responsible for getting the events and changing the state in the UI. Also, State is preserved here.
//As Viewmodel outlives activity life cycle
class CalculatorViewModel : ViewModel() {

    var mutableState by mutableStateOf(CalculatorState())


    //Delete the last character when Delete is pressed
    fun delete() {
        if (mutableState.number1 != null) {
            mutableState = mutableState.copy(number1 = mutableState.number1)
        }
    }

    fun enterNumber(digit: Int) {
        if (mutableState.number1 != null) {
            mutableState = mutableState.copy(
                number1 = digit
            )
            return
        }

        if (mutableState.number2 != null) {

            mutableState = mutableState.copy(
                number2 = digit

            )
            return
        }
    }


    //The State gets the Symbol
    fun enterOperation(symbol: String) {
        if (symbol in "+-×÷") {
            if (mutableState != null) {
                val lastChar = mutableState.symbol
                mutableState = mutableState.copy(
                    symbol = lastChar
                )
            }
        }

    }

    fun calCulate() {
        //get the number and add to the state
        var number1 = mutableState.number1
        var number2 = mutableState.number2

        //Updating the state
        if (number1 != null && number2 != null) {
            mutableState = mutableState.copy(
                number1 = number1 + number2,
                number2 = null,
                symbol = null
            )
        }

    }

    fun onAction(operation: String) {
        when (operation) {
            "+" -> enterOperation("+")
            "=" -> calCulate()
            else -> {}
        }
    }
}




