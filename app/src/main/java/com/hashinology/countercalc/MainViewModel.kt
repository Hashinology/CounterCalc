package com.hashinology.countercalc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var _getNumber: MutableLiveData<Int> = MutableLiveData()
    var getNumber: LiveData<Int> = _getNumber
    var counter = 1

    fun incerement(){
        _getNumber.postValue(counter++)
    }
}