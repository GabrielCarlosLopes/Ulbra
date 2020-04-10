package com.lopes.cervejalitros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itens.view.*

class CevasAdapter(private var cevas: List<Cerveja>):RecyclerView.Adapter<CevasAdapter.VH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itens,parent,false)
        val vh = VH(v)
        return vh
    }

    override fun getItemCount(): Int {
        return cevas.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        var ceva = cevas[position]
        holder.marcaCard.text = ceva.marca
        holder.mlsCard.text = ceva.mls.toString()
        holder.valorCard.text = ceva.preco.toString()
    }


    class VH(itemView: View):RecyclerView.ViewHolder(itemView){
        var marcaCard:TextView = itemView.marcaCard
        var mlsCard:TextView = itemView.mlsCard
        var valorCard:TextView = itemView.valorCard
    }
}