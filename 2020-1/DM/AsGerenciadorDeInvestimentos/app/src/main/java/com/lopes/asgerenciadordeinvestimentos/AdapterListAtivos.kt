package com.lopes.asgerenciadordeinvestimentos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AdapterListAtivos(private val ativos: List<Ativo>): RecyclerView.Adapter<AdapterListAtivos.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        val vh = VH(v)
        return vh
    }

    override fun getItemCount(): Int {
        return ativos.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        TODO("Not yet implemented")
    }

    class VH(itemView: View): RecyclerView.ViewHolder(itemView){

    }


}