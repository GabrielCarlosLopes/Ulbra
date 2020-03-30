package com.lopes.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("peso", edtPeso.text.toString())
            intent.putExtra("altura", edtAltura.text.toString())
            startActivity(intent)
        })


    }
}
