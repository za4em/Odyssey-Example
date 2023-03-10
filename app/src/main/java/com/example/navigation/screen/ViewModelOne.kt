package com.example.navigation.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class ViewModelOne @Inject constructor(
) : ViewModel() {

    val randomLifecycleValue = Random(System.currentTimeMillis()).nextInt(1000)
}