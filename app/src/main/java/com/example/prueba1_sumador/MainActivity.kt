package com.example.prueba1_sumador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.prueba1_sumador.ui.theme.Prueba1_SumadorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            Prueba1_SumadorTheme {
                SumadorApp()
            }
        }
    }
}
