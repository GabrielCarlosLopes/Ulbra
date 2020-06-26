package com.lopes.asgerenciadordeinvestimentos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin
import kotlinx.android.synthetic.main.item.view.*

class AdapterHome (private val coins: List<Coin>): RecyclerView.Adapter<AdapterHome.VH>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
            val vh = VH(v)
            return vh
        }

        override fun getItemCount(): Int {
            return coins.size
        }

        override fun onBindViewHolder(holder: VH, position: Int) {
            var coin = coins[position]
            holder.coinName.text=coin.coin.toString()
            holder.valorCoin.text=coin.valorCoin.toString()
        }


        class VH(itemView: View):RecyclerView.ViewHolder(itemView){
            var coinName:TextView = itemView.tagCoin
            var valorCoin:TextView = itemView.valorCoin
        }


}