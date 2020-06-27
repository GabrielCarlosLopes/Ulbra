package com.lopes.asgerenciadordeinvestimentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ativos_list.*

class AtivosList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ativos_list)

        val name = intent.getStringExtra("name")

        nameCoin.text = name

        if(name == "BTC"){
            imgMoedaAdd.setImageResource(R.drawable.bitcoin)
        }else if(name == "ETH") {
            imgMoedaAdd.setImageResource(R.drawable.ethereum)
        }else if(name == "XRP") {
            imgMoedaAdd.setImageResource(R.drawable.xrp)
        }else if(name == "BCH") {
            imgMoedaAdd.setImageResource(R.drawable.bcash)
        }else if(name == "LTC") {
            imgMoedaAdd.setImageResource(R.drawable.litecoin)
        }


        buttonAddAtivo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, addCompra::class.java)
            val name = name
            intent.putExtra("name", name)
            startActivity(intent)
        })


        buttonBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        })

    }
}