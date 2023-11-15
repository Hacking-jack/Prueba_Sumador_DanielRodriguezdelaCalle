package com.example.prueba1_sumador

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.prueba1_sumador.ui.ResultadoScreen
import com.example.prueba1_sumador.ui.SumaViewModel


enum class SumadorScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Result(title = R.string.resultados)

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SumadorApp(

    ) {
    val viewModel : SumaViewModel = viewModel()
    val navController: NavHostController =  rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = SumadorScreen.valueOf(
        backStackEntry?.destination?.route ?: "inicio"
    )


        NavHost(
            navController = navController,
            startDestination = SumadorScreen.Start,
            modifier = Modifier.padding(8.dp)){

            composable("Inicio"){
                SumaScreen(  viewModel,navController,modifier = Modifier)
            }
            composable( "Resultado") {
                ResultadoScreen(
                    viewModel= viewModel,
                    onBackClicked= navController,
                    modifier = Modifier
                )
            }
        }


}
