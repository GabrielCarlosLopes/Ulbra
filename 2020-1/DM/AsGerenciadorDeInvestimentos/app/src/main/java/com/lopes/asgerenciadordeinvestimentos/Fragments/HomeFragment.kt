package com.lopes.asgerenciadordeinvestimentos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var coinList = mutableListOf<Coin>()
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
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private fun initRecyclerView() {
        val adapter2 = AdapterHome(coinList)
        rvDados.adapter = adapter2
        val layout = GridLayoutManager(requireContext(), 1)
        rvDados.layoutManager = layout
    }


    private fun updateAdapter() {
        val appContext = context !!. applicationContext
        val coinDao = CoinDao(appContext)
        coinList.clear()
        coinList = coinDao.getAllCoins()
        if (coinList.isEmpty()) {
            rvDados.visibility = View.GONE;
            txtMoeda.visibility = View.GONE;
            txtValor.visibility = View.GONE;
            msgFree.visibility = View.VISIBLE;
            msgFree.text = "você nao tem nenhuma moeda ativada"
        }
        else {
            rvDados.visibility = View.VISIBLE;
            txtMoeda.visibility = View.VISIBLE;
            txtValor.visibility = View.VISIBLE;
            msgFree.visibility = View.GONE;
        }
        rvDados.adapter?.notifyDataSetChanged()
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateAdapter()
        initRecyclerView()
    }




    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String?, param2: String?) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
