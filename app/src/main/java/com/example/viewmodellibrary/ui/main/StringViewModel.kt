package com.example.viewmodellibrary.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class StringViewModel(var text: String) : ViewModel() {

    val liveData = MutableLiveData<String>()

    fun getLiveData(): String {
        liveData.value = text
        return liveData.value!!
    }
}