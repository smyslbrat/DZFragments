package com.example.dzfragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel() {
    val message: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val message2: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}