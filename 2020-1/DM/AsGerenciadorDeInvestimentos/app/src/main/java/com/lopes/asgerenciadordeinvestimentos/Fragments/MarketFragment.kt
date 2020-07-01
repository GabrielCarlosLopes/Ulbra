package com.lopes.asgerenciadordeinvestimentos

import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lopes.asgerenciadordeinvestimentos.API.Http
import com.lopes.asgerenciadordeinvestimentos.Obejtos.CoinHttp
import kotlinx.android.synthetic.main.fragment_market.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MarketFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MarketFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_market, container, false)
    }

    fun CarregaDados() {
        if(asyncTask==null) {
            if(Http.hasConnetcion(requireContext())){
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
                when (nameForUpdate) {
                    "BTC" -> {
                        valorBTCForText = result.buy.toDouble().toString()
                    }
                    "ETH" -> {
                        valorETH.text = result.buy.toDouble().toString()
                    }
                    "XRP" -> {
                        valorXRP.text = result.buy.toDouble().toString()
                    }
                    "BCH" -> {
                        valorBCH.text = result.buy.toDouble().toString()
                    }
                    "LTC" -> {
                        valorLTC.text = result.buy.toDouble().toString()
                    }
                }
            }

            Log.e("LOG", "TESTE " + result)


            asyncTask = null
        }


        override fun onPostExecute(result: CoinHttp?) {
            super.onPostExecute(result)
            update(result as CoinHttp)
        }

    }


    private var asyncTask : tesk? = null
    lateinit var nameForUpdate: String
    var valorBTCForText : String? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nameForUpdate = "BTC"
        CarregaDados()
        valorBTC.text = valorBTCForText
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MarketFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String?, param2: String?) =
            MarketFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
