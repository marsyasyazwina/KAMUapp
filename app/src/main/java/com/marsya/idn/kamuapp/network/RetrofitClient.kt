package com.marsya.idn.kamuapp.network

import com.google.android.gms.common.api.Api
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://62fae7b53c4f110faaa075fd.mockapi.io/kamuapp"

    val instance: Api by lazy {
        val retrofit: = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(Api::class.java)
    }
}