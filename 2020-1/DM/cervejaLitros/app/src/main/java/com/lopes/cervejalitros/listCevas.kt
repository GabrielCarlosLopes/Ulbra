package com.lopes.cervejalitros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_cevas.*

class listCevas : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_cevas)

        val lista = intent.getParcelableArrayListExtra<Cerveja>("lista")
        val adapter = CevasAdapter(lista)
        rvDados.layoutManager = LinearLayoutManager(applicationContext)
        rvDados.itemAnimator = DefaultItemAnimator()
        rvDados.adapter = adapter

    }
}
