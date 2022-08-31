package com.marsya.idn.kamuapp.network

import com.marsya.idn.kamuapp.model.ResponseMain
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ServiceAPI {

    @GET("api/kamuapp")
    fun getData(): Flowable<List<ResponseMain>>
}