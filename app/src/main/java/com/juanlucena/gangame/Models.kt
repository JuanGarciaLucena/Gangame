package com.juanlucena.gangame

/**
 * Created by juanantonio.garcia on 04/05/2018.
 */

data class Deal(var title : String, var salePrice : Float, var normalPrice : Float, var metacriticScore : Int, var steamRating : Int, var thumb : String)

data class TopGame(var title : String, var owners : Int, var steamRating: Int, var publisher : String, var price : Float, var position : Int, var thumb : String)