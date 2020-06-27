package com.lopes.asgerenciadordeinvestimentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add_compra.*

class addCompra : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_compra)

        val name = intent.getStringExtra("name")

        nameCoinBuy.text = name



    }
}
