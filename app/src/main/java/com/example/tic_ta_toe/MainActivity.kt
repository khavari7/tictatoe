package com.example.tic_ta_toe


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tic_ta_toe.ui.theme.TictatoeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TictatoeTheme {
                Tic_Ta_Toe()
            }
        }
    }
}

