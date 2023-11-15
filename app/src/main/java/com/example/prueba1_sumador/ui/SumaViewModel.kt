package com.example.prueba1_sumador.ui


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel;

class SumaViewModel : ViewModel() {

    var variable1 by mutableStateOf("")
    var variable2 by mutableStateOf("")

    var resultado by mutableStateOf("")
    var guardado = mutableListOf<String>()


    fun calculate(

    ) {

        val var1 = variable1.toIntOrNull() ?: 0;
        val var2 =  variable2.toIntOrNull() ?: 0;


        val resu = variable1 + variable2

        resultado =  resu

        guardado.add("$var1 + $var2 = $resu")

        variable1 = ""
        variable2 = ""
    }


}
