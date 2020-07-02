package com.lopes.asgerenciadordeinvestimentos

import android.annotation.SuppressLint
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.lopes.asgerenciadordeinvestimentos.API.Http
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin
import com.lopes.asgerenciadordeinvestimentos.Obejtos.CoinHttp
import kotlinx.android.synthetic.main.activity_add_compra.*
import kotlinx.android.synthetic.main.activity_ativos_list.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item2.*
import kotlinx.android.synthetic.main.activity_ativos_list.rvDados as rvDados1

class AtivosList : AppCompatActivity() {

    private var asyncTask : tesk? = null
    lateinit var nameForUpdate: String
    private var ativoList = mutableListOf<Ativo>()
    lateinit var teste : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ativos_list)

        val name = intent.getStringExtra("name")

        nameCoin.text = name

        when (name) {
            "BTC" -> {
                imgMoedaAdd.setImageResource(R.drawable.bitcoin)
            }
            "ETH" -> {
                imgMoedaAdd.setImageResource(R.drawable.ethereum)
            }
            "XRP" -> {
                imgMoedaAdd.setImageResource(R.drawable.xrp)
            }
            "BCH" -> {
                imgMoedaAdd.setImageResource(R.drawable.bcash)
            }
            "LTC" -> {
                imgMoedaAdd.setImageResource(R.drawable.litecoin)
            }
        }

        updateAdapter()
        initRecyclerView()

        buttonAddAtivo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, addCompra::class.java)
            val name = name
            intent.putExtra("name", name)
            startActivity(intent)
        })


        buttonBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        })

    }




    @SuppressLint("SetTextI18n")
    private fun updateAdapter() {
        val ativoDao = AtivoDao(this)
        nameForUpdate = intent.getStringExtra("name")
        CarregaDados()
        ativoList.clear()
        totalValue.text = ativoDao.getAllValueAtivo(nameForUpdate)
        ativoList.clear()
        ativoList = ativoDao.getAllAtivos(nameForUpdate)
        if (ativoList.isEmpty()) {
            rvDados.visibility = View.GONE
            nMoedas.text = ativoList.size.toString()
            msgFreeListAtivo.visibility = View.VISIBLE;
            msgFreeListAtivo.text = "Você nao tem nenhum ativo adicionado"
        }
        else {
            rvDados.visibility = View.VISIBLE
            nMoedas.text = ativoList.size.toString()
            msgFreeListAtivo.visibility = View.GONE;
        }
        rvDados.adapter?.notifyDataSetChanged()
    }

    override fun onResume() {
        super.onResume()
        updateAdapter()
        initRecyclerView()
    }


    private fun initRecyclerView() {
        val adapter2 = AdapterListAtivos(ativoList)
        rvDados.adapter = adapter2
        val layout = GridLayoutManager(this, 1)
        rvDados.layoutManager = layout
    }


    fun CarregaDados() {
        if(asyncTask==null) {
            if(Http.hasConnetcion(this)){
                if (asyncTask?.status != AsyncTask.Status.RUNNING) {
                    asyncTask = tesk()
                    asyncTask?.execute()
                }
            }
        }
    }


    inner class tesk: AsyncTask<Void, Void, CoinHttp?>(){

        override fun onPreExecute() {
            super.onPreExecute()
        }


        override fun doInBackground(vararg params: Void?): CoinHttp? {
            return Http.loadCoin(nameForUpdate)
        }


        private fun update(result: CoinHttp?) {

            if (result != null) {

            }

            Log.e("LOG", "TESTE " + result)


            asyncTask = null
        }


        override fun onPostExecute(result: CoinHttp?) {
            super.onPostExecute(result)
            update(result as CoinHttp)

        }

    }


}