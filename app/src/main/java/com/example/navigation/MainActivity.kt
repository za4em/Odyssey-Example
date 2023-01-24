package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import dagger.hilt.android.AndroidEntryPoint
import com.example.navigation.screen.HiltScreenOne
import com.example.navigation.screen.HiltScreenTwo
import ru.alexgladkov.odyssey.android.hilt.builder.hiltScreen
import ru.alexgladkov.odyssey.android.hilt.setHiltNavigation
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import ru.alexgladkov.odyssey.compose.setup.OdysseyConfiguration

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val configuration = OdysseyConfiguration(this)
            setHiltNavigation(configuration) {
                generateGraph()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun RootComposeBuilder.generateGraph(): RootComposeBuilder {
    hiltScreen(name = "one") {
        HiltScreenOne()
    }
    hiltScreen(name = "two") {
        HiltScreenTwo()
    }

    return this
}
