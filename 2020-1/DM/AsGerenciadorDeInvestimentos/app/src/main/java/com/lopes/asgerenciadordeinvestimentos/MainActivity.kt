package com.lopes.asgerenciadordeinvestimentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        if(savedInstanceState == null){
            val frag = HomeFragment()
            open(frag)
        }
    }


    private val mOnNavigationItemSelectedListener =  BottomNavigationView.OnNavigationItemSelectedListener {
        val b = (if (it.itemId == R.id.home) {
            val home = HomeFragment.newInstance(null, null)
            open(home)
        } else {
            if (it.itemId != R.id.add) {
            } else {
                val add = AddFragment.newInstance(null, null)
                open(add)
            }
        }) as Boolean
        b
    }

    private fun open(frag: Fragment):Boolean{
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, frag)
        transaction.addToBackStack(null)
        transaction.commit()
        return true
    }


}




