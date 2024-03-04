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

//    fun delete() {
//        if (mutableState.number1.length > 1){
//           mutableState = mutableState.copy(number1 = mutableState.number1.dropLast(2))
//        }
//    }

    fun enterNumber(digit: Int){
        if(mutableState.number1 != null) {
            mutableState = mutableState.copy(
                number1 =  digit
            )
            return
        }
    }

    private fun enterOperation(){

    }

    fun onAction(calculatorActions: CalculatorActions){
        when(calculatorActions){
            is CalculatorActions.Number -> enterNumber(calculatorActions.number)
            is CalculatorActions.Operation -> enterOperation()
            else -> {}
        }
    }
}


//View model with State
//New  Composables start until getting the String