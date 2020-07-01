package com.lopes.asgerenciadordeinvestimentos

import android.content.Intent
import android.os.AsyncTask
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lopes.asgerenciadordeinvestimentos.API.Http
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin
import com.lopes.asgerenciadordeinvestimentos.Obejtos.CoinHttp
import kotlinx.android.synthetic.main.item.view.*
import java.util.*

class AdapterHome (private val coins: List<Coin>): RecyclerView.Adapter<AdapterHome.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val vh = VH(v)
        vh.itemView.buttonAdd.setOnClickListener(View.OnClickListener {
            val intent = Intent(v.context, AtivosList::class.java)
            val coinName = vh.coinName.text
            intent.putExtra("name", coinName)
            v.context.startActivity(intent)
        })
        return vh
    }

    override fun getItemCount(): Int {
        return coins.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {


        var coin = coins[position]
        holder.coinName.text = coin.coin.toString()

        if (coin.coin.toString() == "BTC") {
            holder.img.setImageResource(R.drawable.bitcoin)
        } else if (coin.coin.toString() == "ETH") {
            holder.img.setImageResource(R.drawable.ethereum)
        } else if (coin.coin.toString() == "XRP") {
            holder.img.setImageResource(R.drawable.xrp)
        } else if (coin.coin.toString() == "BCH") {
            holder.img.setImageResource(R.drawable.bcash)
        } else if (coin.coin.toString() == "LTC") {
            holder.img.setImageResource(R.drawable.litecoin)
        }
    }


    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var coinName: TextView = itemView.tagCoin
        var img: ImageView = itemView.imgCoin
    }

}

