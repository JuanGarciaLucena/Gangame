package com.juanlucena.gangamesdk

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by juanlucena on 13/05/2018.
 */


interface RetrofitGangameApi {

    @GET(Routes.GET_DEALS)
    fun getDeals() : Call<ArrayList<Deal>>

    @GET(Routes.GET_DEALS)
    fun getRatedGames() : Call<ArrayList<TopGame>>

    @GET(Routes.GET_DEALS)
    fun getMostOwnedGames() : Call<ArrayList<TopGame>>
}