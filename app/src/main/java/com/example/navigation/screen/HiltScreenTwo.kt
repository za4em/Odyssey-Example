package com.example.navigation.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun HiltScreenTwo() {
    val viewModel: ViewModelTwo = hiltViewModel()
    val rootController = LocalRootController.current
    Button(
        onClick = {
            rootController.popBackStack()
        }
    ) {
        Text("Back")
    }
    NumberLabel(viewModel.randomLifecycleValue)
}