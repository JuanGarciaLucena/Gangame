package com.juanlucena.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by juanantonio.garcia on 03/05/2018.
 */


fun ViewGroup.inflate(layoutResId : Int, attachToRoot : Boolean = false) : View{
    val inflater = LayoutInflater.from(context)
    return inflater.inflate(layoutResId, this, attachToRoot)
}