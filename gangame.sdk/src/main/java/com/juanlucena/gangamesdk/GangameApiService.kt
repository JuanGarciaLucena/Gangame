package com.juanlucena.gangamesdk

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by juanlucena on 13/05/2018.
 */
class GangameApiService {

    val apiClient : RetrofitGangameApi

    init {
        val apiClientConfig =
                Retrofit.Builder()
                .baseUrl(Routes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()

        apiClient = apiClientConfig.create(RetrofitGangameApi :: class.java)
    }
}