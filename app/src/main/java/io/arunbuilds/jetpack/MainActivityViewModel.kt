package io.arunbuilds.jetpack

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingValue: Int) : ViewModel() {
    private var counter = 0

    init {
        counter = startingValue
    }

    fun getCurrentCount() = counter

    fun getUpdatedCount() = ++counter
}