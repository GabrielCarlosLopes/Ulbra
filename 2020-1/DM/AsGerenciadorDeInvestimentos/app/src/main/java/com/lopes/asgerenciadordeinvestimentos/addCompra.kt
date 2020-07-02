package com.lopes.asgerenciadordeinvestimentos

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.lopes.asgerenciadordeinvestimentos.API.Http
import com.lopes.asgerenciadordeinvestimentos.Obejtos.CoinHttp
import kotlinx.android.synthetic.main.activity_add_compra.*

class addCompra : AppCompatActivity() {

    lateinit var nameCoin : String
    private var asyncTask : teskCompra? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_compra)

        val name = intent.getStringExtra("name")

        nameCoinBuy.text = name

        nameCoin = name
        CarregaDados()

        buttonBackCompra.setOnClickListener(View.OnClickListener {
            onBackPressed()
        })

        buttonNewCompra.setOnClickListener(View.OnClickListener {
            if(nCoins.text.isEmpty()){
                Toast.makeText(this, "Digite uma quantidade", Toast.LENGTH_SHORT).show()
            }else{
                val ativoDao = AtivoDao(this)
                val ativo = Ativo(null, null, nCoins.text.toString().toInt(), valor_moeda.text.toString().toDouble(), name)
                ativoDao.insertInAtivo(ativo)
                nCoins.setText("")
                Toast.makeText(this, "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
                onBackPressed()
            }
        })


    }

    fun CarregaDados() {
        if(asyncTask==null) {
            if(Http.hasConnetcion(this)){
                if (asyncTask?.status != AsyncTask.Status.RUNNING) {
                    asyncTask = teskCompra()
                    asyncTask?.execute()
                }
            }
        }
    }


    inner class teskCompra: AsyncTask<Void, Void, CoinHttp?>(){

        override fun onPreExecute() {
            super.onPreExecute()
        }


        override fun doInBackground(vararg params: Void?): CoinHttp? {
            return Http.loadCoin(nameCoin)
        }

        private fun update(result: CoinHttp?) {

            Log.e("LOG", "TESTE " + result)
            if (result != null) {
                valor_moeda.text = result.buy.toDouble().toString()
            }

            asyncTask = null
        }


        override fun onPostExecute(result: CoinHttp?) {
            super.onPostExecute(result)
            update(result as CoinHttp)
        }

    }
}
