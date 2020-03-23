package com.lopes.conversormoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        fun convertClick(view: View){
            val dolar = dolarController.text.toString().toDouble();
            val euro = euroController.text.toString().toDouble();
            val real = realController.text.toString().toDouble();


            Log.i(dolar.toString(), euro.toString())
        }
    }
}
