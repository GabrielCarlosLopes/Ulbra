package com.lopes.asgerenciadordeinvestimentos.API

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import com.lopes.asgerenciadordeinvestimentos.Obejtos.CoinHttp
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.TimeUnit

object Http {

    var Json_URL = "https://www.mercadobitcoin.net/api/"

    fun hasConnetcion(ctx: Context):Boolean{
        val cm = ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val info =cm.activeNetworkInfo
        return info!= null && info.isConnected
    }

    fun loadCoin(coin: String): CoinHttp? {
        val client = OkHttpClient.Builder()
            .readTimeout(5, TimeUnit.SECONDS)
            .connectTimeout(10, TimeUnit.SECONDS)
            .build()
        val request = Request.Builder()
            .url("$Json_URL$coin/ticker/")
            .build()
        val response = client.newCall(request).execute()
        val jsonString = response.body?.string()
        val jsonO = JSONObject(jsonString)
        val json = jsonO.getJSONObject("ticker")
        return readJson(json)
    }

    fun readJson(json: JSONObject): CoinHttp?{

        try {
            return CoinHttp(
                json.getString("high"),
                json.getString("low"),
                json.getString("vol"),
                json.getString("last"),
                json.getString("buy"),
                json.getString("sell")
            )
        }catch (e: IOException){
            Log.e("Error", "ERRO")
        }
        return null
    }

}