package com.lopes.cervejalitros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itens.view.*
import java.text.DecimalFormat

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
        val df = DecimalFormat("#.00")
        var ceva = cevas[position]
        holder.marcaCard.text = ceva.marca
        holder.mlsCard.text = df.format(ceva.mls)
        holder.valorCard.text = df.format(ceva.preco)
        holder.valorMl.text = df.format(ceva.valorMls)
    }


    class VH(itemView: View):RecyclerView.ViewHolder(itemView){
        var marcaCard:TextView = itemView.marcaCard
        var mlsCard:TextView = itemView.mlsCard
        var valorCard:TextView = itemView.valorCard
        var valorMl:TextView = itemView.valorMl

    }
}