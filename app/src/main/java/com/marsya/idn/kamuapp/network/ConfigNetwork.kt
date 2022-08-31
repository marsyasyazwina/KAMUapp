package com.marsya.idn.kamuapp.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object ConfigNetwork {
    fun getRetrofit(): Retrofit{
        return Retrofit
            .Builder()
            .baseUrl("https://62fae7b53c4f110faaa075fd.mockapi.io/kamuapp")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
    fun service(): ServiceAPI = getRetrofit().create(ServiceAPI::class.java)
}