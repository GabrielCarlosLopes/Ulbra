package com.lopes.imc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val altura = intent.getStringExtra("altura")
        val peso = intent.getStringExtra("peso")

        var imc = peso.toDouble() / (altura.toDouble()*altura.toDouble())

        imcCalc(imc)
    }

    @SuppressLint("SetTextI18n")
    fun imcCalc(imc: Double){
        if(imc < 18.5){
            textImc.text = "Abaixo do Peso"
        }else if(imc > 18.4 && imc < 25){
            textImc.text = "Peso Normal"
        }else if(imc > 24 && imc < 31){
            textImc.text = "Acima do Peso"
        }else{
            textImc.text = "Obeso"
        }
    }
}
