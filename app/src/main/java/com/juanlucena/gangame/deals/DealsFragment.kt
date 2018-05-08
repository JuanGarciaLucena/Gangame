package com.juanlucena.gangame.deals

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.juanlucena.common.BaseListFragment
import com.juanlucena.common.DataBindingRecyclerAdapter
import com.juanlucena.gangame.BR
import com.juanlucena.gangame.Deal
import com.juanlucena.gangame.R

/**
 * Created by juanantonio.garcia on 03/05/2018.
 */
class DealsFragment : BaseListFragment(){

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(BR.deal, R.layout.item_deal)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Casting con la palabra reservada as
        (listAdapter as DataBindingRecyclerAdapter<Deal>).items.addAll(getDummyDeals())
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_deals
    }

    fun getDummyDeals() : ArrayList<Deal>{
        return arrayListOf(Deal("Counter Strike",
                0.99F,
                9.99F,
                80,
                80,
                "http://cdn.akamai.steamstatic.com/steam/apps/10/capsule_184x69.jpg"))
    }
}