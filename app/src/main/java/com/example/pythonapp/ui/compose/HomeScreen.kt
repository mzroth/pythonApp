package com.example.pythonapp.ui.compose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pythonapp.R
import com.example.pythonapp.ui.theme.PythonAppTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "menu"
                        )
                    }
                }
            )
        }
    ) {
        Text("Hello world")
    }
}

@Composable
@Preview(name = "Home screen")
@Preview(name = "Home screen dark mode", uiMode = UI_MODE_NIGHT_YES)
fun PreviewHome() {
    PythonAppTheme {
        HomeScreen()
    }
}
