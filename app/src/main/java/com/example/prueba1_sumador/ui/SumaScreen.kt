package com.example.prueba1_sumador.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prueba1_sumador.R

@ExperimentalMaterial3Api
@Composable
fun SumaScreen( viewModel: SumaViewModel,
                navController: NavController,
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        var variable1 by rememberSaveable {
            mutableStateOf(0)
        }
        var variable2 by rememberSaveable {
            mutableStateOf(0)
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium))
        ) {
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            OutlinedTextField( value= viewModel.variable1 ,onValueChange = {viewModel.variable1= it}, modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            OutlinedTextField(value= viewModel.variable2,onValueChange={viewModel.variable2 = it},modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            Button(  onClick ={
                viewModel.calculate()
                navController.navigate("resultado")
            } ) {
                Text(text ="+")
            }
        }
       
    }
}