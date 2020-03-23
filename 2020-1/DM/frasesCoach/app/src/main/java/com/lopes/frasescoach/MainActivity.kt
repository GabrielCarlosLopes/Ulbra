package com.lopes.frasescoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickFrase(view: View) {
        val frases = resources.getTextArray(R.array.frases)
        var sortear = Random.nextInt(0, frases.size-1);

        fraseShow.text = frases[sortear]

    }
}
