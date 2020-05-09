package com.lopes.covidworld

import android.annotation.SuppressLint
import android.content.Intent
import android.os.AsyncTask
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import com.lopes.covidworld.activitys.all_countrys
import com.lopes.covidworld.ws.HttpUf
import kotlinx.android.synthetic.main.activity_home.*
import java.io.IOException

class HomeActivity : AppCompatActivity() {

    private var listStates = arrayListOf<States>()
    private var asyncTask : StatesTask? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.appBar))

        btnAllStates.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, all_states::class.java)
            this.startActivity(intent)
        })

        btnAllCountry.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, all_countrys::class.java)
            this.startActivity(intent)
        })

        btnSearch.setOnClickListener(View.OnClickListener {
            CarregaDados()
            val intent = Intent(this, all_countrys::class.java)
            this.startActivity(intent)
        })

    }

    fun CarregaDados(){
        listStates.clear()
        if(asyncTask==null){
                if(HttpUf.hasConnection(this)){
                    if(asyncTask?.status != AsyncTask.Status.RUNNING){
                        asyncTask = StatesTask()
                        asyncTask?.execute()
                    }
            }
        }
    }

    @SuppressLint("StaticFieldLeak")
    inner class StatesTask: AsyncTask<Void, Void, List<States?>>(){

        override fun onPreExecute() {
            super.onPreExecute()
        }


        @SuppressLint("WrongThread")
        @RequiresApi(Build.VERSION_CODES.O)
        override fun doInBackground(vararg params: Void?): List<States>? {
            return HttpUf.loadState(uf.text.toString().toLowerCase())
        }

        private fun update(result: List<States>?){
            if(result != null) {
                listStates.clear()
                listStates.addAll(result.reversed())
            }
            asyncTask = null
        }

        override fun onPostExecute(result: List<States?>?) {
            super.onPostExecute(result)
            update(result as List<States>?)
        }
    }
}
