package com.example.careerfair.ui.applications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ApplicationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is applications Fragment"
    }
    val text: LiveData<String> = _text
}