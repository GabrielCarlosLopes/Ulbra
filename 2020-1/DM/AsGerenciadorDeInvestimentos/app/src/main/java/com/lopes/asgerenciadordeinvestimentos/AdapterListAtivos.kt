package com.lopes.asgerenciadordeinvestimentos

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item2.view.*


class AdapterListAtivos(private val ativos: List<Ativo>): RecyclerView.Adapter<AdapterListAtivos.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item2,parent,false)
        val vh = VH(v)
        return vh
    }

    override fun getItemCount(): Int {
        return ativos.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        var ativo = ativos[position]
        holder.qtdAtivo.text = ativo.quantidade.toString()
        holder.valorTotalAtivo.text = (ativo.quantidade?.times(ativo.valorMoeda!!))?.toDouble().toString()

        holder.deleteButton.setOnClickListener(View.OnClickListener {
                val ativoDao = AtivoDao(it.context)
                ativoDao.remove(ativo)
                val intent = Intent(it.context, MainActivity::class.java)
                Toast.makeText(it.context, "Ativo removido com sucesso", Toast.LENGTH_SHORT).show()
                it.context.startActivity(intent)
        })
    }



    class VH(itemView: View): RecyclerView.ViewHolder(itemView){
        val qtdAtivo: TextView = itemView.qtdAtivo
        val valorTotalAtivo: TextView = itemView.valorTotalAtivo
        val deleteButton: ImageView = itemView.deleteButtonAtivo
    }

}