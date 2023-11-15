package com.example.prueba1_sumador.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ResultadoScreen( viewModel: SumaViewModel,onBackClicked: NavController , modifier:Modifier = Modifier ){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(value = viewModel.resultado )
        val guardadosAnt= buildString { for (res in viewModel.guardado ){append("${res}\n") }}
        OutlinedTextField(value = guardadosAnt , modifier = Modifier
            .fillMaxWidth()
        )


        // Botón para volver a la pantalla de entrada
        Button(
            onClick = { onBackClicked.popBackStack() } ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("Volver a la entrada")
        }
    }

}