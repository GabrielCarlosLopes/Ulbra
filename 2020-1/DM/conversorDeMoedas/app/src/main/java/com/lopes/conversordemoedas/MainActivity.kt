package com.lopes.conversordemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun converter(view: View) {
        var valor = editText.text.toString().toDouble()

        Dolar.text = "$valor R$ em Dólar é "+(valor / 5)+" U$"
        Euro.text = "$valor R$ em Euro é "+(valor / 4)+" €"

    }
}
