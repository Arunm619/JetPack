package io.arunbuilds.jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingValue: Int) : ViewModel() {
    private var counter = MutableLiveData<Int>()
    val currentCount: LiveData<Int>
        get() = counter

    init {
        counter.postValue(startingValue)
    }

    fun updateCounterByOne() {
        counter.postValue(counter.value?.plus(1))
    }
}