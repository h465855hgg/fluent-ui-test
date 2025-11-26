package org.fluent.test

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.background.Mica
import io.github.composefluent.component.*
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Home
import io.github.composefluent.icons.regular.Mail
import io.github.composefluent.icons.regular.Person
import io.github.composefluent.icons.regular.Settings

@Composable

fun App() {
    FluentTheme {
        Mica(Modifier.fillMaxSize()) {
            Column(Modifier.padding(8.dp)) {

                var selectedIndex by remember { mutableStateOf(0) }
                val navigationState = rememberNavigationState()

                NavigationView(
                    displayMode =  NavigationDisplayMode.Left,
                    state = navigationState,
                    menuItems = {
                        menuItem(
                            selected = 0 == selectedIndex,
                            onClick = { selectedIndex = 0 },
                            text = { Text("Home") },
                            icon = { Icon(Icons.Default.Home, contentDescription = null) },
                        )
                        menuItem(
                            selected = 1 == selectedIndex,
                            onClick = { selectedIndex = 1 },
                            text = { Text("Account") },
                            icon = { Icon(Icons.Default.Person, contentDescription = null) },
                        )
                        menuItem(
                            selected = 2 == selectedIndex,
                            onClick = { selectedIndex = 2 },
                            text = { Text("Inbox") },
                            icon = { Icon(Icons.Default.Mail, contentDescription = null) },

                        )
                    },
                    footerItems = {
                        menuItem(
                            selected = 3 == selectedIndex,
                            onClick = { selectedIndex = 3 },
                            text = { Text("Settings") },
                            icon = { Icon(Icons.Default.Settings, contentDescription = null) },
                        )
                    },
                    pane = {},
                    modifier = Modifier.height(300.dp)
                )
            }
        }
    }
}