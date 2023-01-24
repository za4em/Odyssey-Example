package com.example.navigation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import ru.alexgladkov.odyssey.compose.extensions.push
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun HiltScreenOne() {
    val viewModel: ViewModelOne = hiltViewModel()
    val rootController = LocalRootController.current
    Button(
        onClick = {
            rootController.push("two")
        }
    ) {
        Text("Push")
    }
    NumberLabel(viewModel.randomLifecycleValue)
}