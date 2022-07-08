package com.example.pythonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pythonapp.ui.compose.HomeScreen
import com.example.pythonapp.ui.theme.PythonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PythonAppTheme {
                HomeScreen()
            }
        }
    }
}