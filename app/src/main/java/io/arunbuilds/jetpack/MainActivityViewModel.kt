package io.arunbuilds.jetpack

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var counter = 0

    fun getCurrentCount() = counter

    fun getUpdatedCount() = ++counter
}