package com.example.sidebar.ui.xitong

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class XitongViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is xitong Fragment"
    }
    val text: LiveData<String> = _text
}