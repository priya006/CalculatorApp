package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/*
ViewModel Responsible for receiving  the events and changing the state in the UI. Also, State is preserved here.
As View model outlives activity life cycle we like  to hold the state here.
 */
class CalculatorViewModel : ViewModel() {


    var mutableState by mutableStateOf(CalculatorState(number1 = 0, number2 = 0, symbol = ""))


    /*
    When AC is Pressed it gets cleared
     */
    fun clearAll() {
        if (mutableState.number1 != null) {
            mutableState = mutableState.copy(number1 = 0 , number2 = 0, symbol = "")
        }
    }


    fun enterNumber(number: Int) {
        if (mutableState.symbol!!.isEmpty()) {
            mutableState = mutableState.copy(
                number1 = number
            )
        } else {
            mutableState = mutableState.copy(
                number2 = number
            )
        }
    }


    /*
    state is mutated with the symbol or operation entered
     */
    fun enterOperation(symbol: String) {
        if (symbol in "+-×÷") {
            if (mutableState != null) {
                mutableState = mutableState.copy(
                    symbol = symbol
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
           var addedNumber =   number1 + number2
            mutableState = mutableState.copy(
                number1 = addedNumber,
                symbol = "+"
            )
        }
        return
    }

    fun onAction(operation: String) {
        when (operation) {
            "+" -> enterOperation("+")
            "=" -> calCulate()
            "AC" -> clearAll()
            else -> {}
        }
    }
}




