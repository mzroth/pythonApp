package com.example.pythonapp.ui.compose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pythonapp.R
import com.example.pythonapp.ui.theme.PythonAppTheme
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        modifier = modifier.fillMaxSize(),
        scaffoldState = scaffoldState,
        drawerContent = {
            AppDrawer()
        },
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            scope.launch {
                                scaffoldState.drawerState.open()
                            }
                        }
                    ) {
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

private val screens = listOf("Find Trips", "My Trips", "Saved Trips", "Price Alerts", "My Account")

@Composable
fun AppDrawer(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 48.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "something"
        )
        for (screen in screens) {
            Spacer(Modifier.height(24.dp))
            Text(text = screen, style = MaterialTheme.typography.h4)
        }
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

@Preview
@Composable
fun CraneDrawerPreview() {
    PythonAppTheme {
        AppDrawer()
    }
}
