package com.example.pythonapp.ui.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pythonapp.ui.theme.PythonAppTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Text("Hello world")
    }
}

@Preview
@Composable
fun PreviewHome() {
    PythonAppTheme {
        HomeScreen()
    }
}