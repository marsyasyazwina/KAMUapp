package com.marsya.idn.kamuapp.view.content.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marsya.idn.kamuapp.model.ResponseMain
import com.marsya.idn.kamuapp.repo.RepositoryMain

class ViewModelMain: ViewModel() {

    val repository = RepositoryMain()

    var responGetData = MutableLiveData<List<ResponseMain>>()
    var isError = MutableLiveData<Throwable>()

}