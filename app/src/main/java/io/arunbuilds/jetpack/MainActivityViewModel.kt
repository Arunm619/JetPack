package io.arunbuilds.jetpack

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingValue: Int) : ViewModel() {
     var counter = MutableLiveData<String>()
    val currentCount: LiveData<String>
        get() = counter

    init {
        counter.postValue(startingValue.toString())
    }

    fun updateCounterByOne() {
        counter.postValue(counter.value?.toLong()?.plus(1).toString())
    }
}