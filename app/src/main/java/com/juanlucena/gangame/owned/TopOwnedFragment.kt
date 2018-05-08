package com.juanlucena.gangame.owned

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.juanlucena.common.BaseListFragment
import com.juanlucena.common.DataBindingRecyclerAdapter
import com.juanlucena.gangame.BR
import com.juanlucena.gangame.R
import com.juanlucena.gangame.TopGame

/**
 * Created by juanantonio.garcia on 03/05/2018.
 */
class TopOwnedFragment : BaseListFragment(){

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_top_owned
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Casting con la palabra reservada as
        (listAdapter as DataBindingRecyclerAdapter<TopGame>).items.addAll(getDummyTopGame())
    }

    fun getDummyTopGame() : ArrayList<TopGame>{
        return arrayListOf(TopGame("Counter Strike",
                13407338,
                80,
                "Valve",
                9.99F,
                1,
                "http://cdn.akamai.steamstatic.com/steam/apps/10/capsule_184x69.jpg"))
    }
}