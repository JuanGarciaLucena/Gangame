package com.juanlucena.common

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by juanantonio.garcia on 04/05/2018.
 */
class DataBindingViewHolder<MODEL>(val itemVariableId : Int, val binding : ViewDataBinding) : RecyclerView.ViewHolder(binding.root){

    fun bindItem(item : MODEL){

        binding.setVariable(itemVariableId, item)
        binding.executePendingBindings()
    }

}