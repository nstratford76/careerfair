package com.example.careerfair.ui.jobs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JobsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is jobs Fragment"
    }
    val text: LiveData<String> = _text
}