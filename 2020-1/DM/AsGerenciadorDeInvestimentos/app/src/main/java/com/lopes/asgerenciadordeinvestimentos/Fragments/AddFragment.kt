package com.lopes.asgerenciadordeinvestimentos

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.lopes.asgerenciadordeinvestimentos.API.Http
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin
import com.lopes.asgerenciadordeinvestimentos.Obejtos.CoinHttp
import kotlinx.android.synthetic.main.activity_ativos_list.*
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.item.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@Suppress("UNREACHABLE_CODE")
class AddFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)

    }

    lateinit var coin : String
    private var asyncTask : CoinTask? = null
    private lateinit var valorCoin : CoinHttp

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        btc_card.setOnClickListener(View.OnClickListener {
            val coinDao = CoinDao(requireContext())
            if(coinDao.getCoinName("BTC") == true){
                Toast.makeText(requireContext(), "Você ja tem esta moeda adicionada", Toast.LENGTH_LONG).show()
            }else{
                val coin = Coin(null, "BTC", 1.00)
                coinDao.insertCoin(coin)
                Toast.makeText(requireContext(), "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
            }

        })

        eth_card.setOnClickListener(View.OnClickListener {
            val coinDao = CoinDao(requireContext())
            if(coinDao.getCoinName("ETH") == true){
                Toast.makeText(requireContext(), "Você ja tem esta moeda adicionada", Toast.LENGTH_LONG).show()
            }else{
                val coin = Coin(null, "ETH", 1.00)
                coinDao.insertCoin(coin)
                Toast.makeText(requireContext(), "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
            }
        })

        xrp_card.setOnClickListener(View.OnClickListener {
            val coinDao = CoinDao(requireContext())
            if(coinDao.getCoinName("XRP") == true){
                Toast.makeText(requireContext(), "Você ja tem esta moeda adicionada", Toast.LENGTH_LONG).show()
            }else{
                val coin = Coin(null, "XRP", 1.00)
                coinDao.insertCoin(coin)
                Toast.makeText(requireContext(), "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
            }
        })

        bch_card.setOnClickListener(View.OnClickListener {
            val coinDao = CoinDao(requireContext())
            if(coinDao.getCoinName("BCH") == true){
                Toast.makeText(requireContext(), "Você ja tem esta moeda adicionada", Toast.LENGTH_LONG).show()
            }else{
                val coin = Coin(null, "BCH", 1.00)
                coinDao.insertCoin(coin)
                Toast.makeText(requireContext(), "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
            }
        })

        ltc_card.setOnClickListener(View.OnClickListener {
            val coinDao = CoinDao(requireContext())
            if(coinDao.getCoinName("LTC") == true){
                Toast.makeText(requireContext(), "Você ja tem esta moeda adicionada", Toast.LENGTH_LONG).show()
            }else{
                val coin = Coin(null, "LTC", 1.00)
                coinDao.insertCoin(coin)
                Toast.makeText(requireContext(), "Adicionado com sucesso", Toast.LENGTH_SHORT).show()
            }
        })
    }


    fun CarregaDados() {
        if(asyncTask==null){
            if(Http.hasConnetcion(requireContext())){
                if(asyncTask?.status != AsyncTask.Status.RUNNING){
                    asyncTask = CoinTask()
                    asyncTask?.execute()
                }
            }
        }
    }

    
    @SuppressLint("StaticFieldLeak")
    inner class CoinTask: AsyncTask<Void, Void, CoinHttp?>(){

        override fun onPreExecute() {
            super.onPreExecute()
        }


        override fun doInBackground(vararg params: Void?): CoinHttp? {
            return Http.loadCoin(coin)
        }

        private fun update(result: CoinHttp?){

            if(result != null){
                valorCoin.buy = result.buy
            }
            asyncTask = null
        }

        override fun onPostExecute(result: CoinHttp?) {
            super.onPostExecute(result)
            update(result as CoinHttp?)
        }

    }




    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AddFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String?, param2: String?) =
            AddFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

