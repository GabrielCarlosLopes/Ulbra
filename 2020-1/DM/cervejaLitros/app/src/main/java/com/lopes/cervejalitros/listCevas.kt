package com.lopes.cervejalitros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_list_cevas.*
import java.util.*


class listCevas : AppCompatActivity() {
    private var newList: ArrayList<Cerveja> =
    intent.getSerializableExtra("lista") as ArrayList<Cerveja>
    var adapter = CevasAdapter(newList)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_cevas)
        init()
    }

    fun init(){
        rvDados.adapter=adapter
        val layout = GridLayoutManager(this, 2)
        rvDados.layoutManager=layout
    }
}
