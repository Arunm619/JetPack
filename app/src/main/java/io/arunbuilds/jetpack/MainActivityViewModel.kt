package io.arunbuilds.jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingValue: Int) : ViewModel() {
    private var counter = MutableLiveData<Int>()

    init {
        counter.postValue(startingValue)
    }

    fun getCurrentCount(): LiveData<Int> = counter

    fun updateCounterByOne() {
        counter.postValue(counter.value?.plus(1))
    }
}