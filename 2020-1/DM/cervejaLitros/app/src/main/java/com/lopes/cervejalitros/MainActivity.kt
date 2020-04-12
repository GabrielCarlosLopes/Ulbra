package com.lopes.cervejalitros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lista = arrayListOf<Cerveja>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "Por favor digite somente os mls. Por exemplo 1L = 1000 ml", Toast.LENGTH_LONG).show()

        btnAdicionar.setOnClickListener(View.OnClickListener {
            add()
        })

        btnList.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, listCevas::class.java)
            intent.putExtra("lista", lista)
            startActivity(intent)
        })
    }

    fun add() {
        if (marcaText.text.toString().length > 3) {
            val cerveja = Cerveja(
                marcaText.text.toString(),
                litrosText.text.toString().toDouble(),
                valorText.text.toString().toDouble()
            )
            marcaText.text?.clear()
            litrosText.text?.clear()
            valorText.text?.clear()
            lista.add(cerveja)
            Toast.makeText(applicationContext, "CERVEJA ADICIONADA", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(applicationContext, "ALGO DEU ERRADO", Toast.LENGTH_SHORT).show()
        }
    }

}


