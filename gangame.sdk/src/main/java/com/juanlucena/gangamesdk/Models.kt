package com.juanlucena.gangamesdk

import com.google.gson.annotations.SerializedName

/**
 * Created by juanlucena on 13/05/2018.
 */


data class Deal(var title : String,
                var salePrice : Float,
                var normalPrice : Float,
                var metacriticScore : Int,
                @SerializedName("steamRatingPercent") var steamRating : Int)

data class TopGame(@SerializedName("name") var title : String,
                   var publisher : String,
                   @SerializedName("score_rank") var steamRating : Int,
                   var owners : Int,
                   var price : Float,
                   var thumb : String)