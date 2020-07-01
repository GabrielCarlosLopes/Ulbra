package com.lopes.asgerenciadordeinvestimentos

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.util.Log
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin

class CoinDao(context: Context) {

    var banco = DbHelper(context)

    fun insertCoin(coin: Coin): String {
        val db = banco.writableDatabase
        val contentValues = ContentValues()

        contentValues.put(COIN_ID, coin.idCoin )
        contentValues.put(COIN, coin.coin)

        var resp_id=db.insert(TABLE_COIN, null, contentValues)
        val msg = if(resp_id!=-1L){
            "Inserido com sucesso"
        }else{
            "Erro ao inserir"
        }
        db.close()
        return msg
    }

    fun getAllCoins(): ArrayList<Coin>{
        Log.v("LOG", "GetAll")
        val db = banco.writableDatabase
        val sql = "SELECT * from "+ TABLE_COIN
        val cursor = db.rawQuery(sql, null)
        val coins = ArrayList<Coin>()
        while (cursor.moveToNext()){
            val coin = coinFromCursor(cursor)
            coins.add(coin)
        }
        cursor.close()
        db.close()
        Log.v("LOG", "Get ${coins.size}")
        return coins
    }

    fun getCoinName(name: String): Boolean {
        Log.v("LOG", "GetCoin")
        val db = banco.writableDatabase
        val sql = "SELECT * from $TABLE_COIN WHERE $COIN like '%$name%'"
        val cursor = db.rawQuery(sql ,null)
        val coins =ArrayList<Coin>()
        while (cursor.moveToNext()){
            val coin= coinFromCursor(cursor)
            coins.add(coin)
        }
        cursor.close()
        db.close()

        return coins.size > 0
    }

    fun getInvestimentos(): Double {
        Log.v("LOG", "GetCoin")
        var total : Double = 0.0
        val db = banco.writableDatabase
        val sql = "SELECT sum($ATIVO_VALOR*$ATIVO_QUANTIDADE) from $TABLE_ATIVOS"
        val cursor = db.rawQuery(sql ,null)
        while (cursor.moveToNext()){
            total = cursor.getDouble(0)
        }
        cursor.close()
        db.close()

        return total
    }



    private fun coinFromCursor(cursor: Cursor): Coin{
        val id = cursor.getInt(cursor.getColumnIndex(COIN_ID))
        val coinType = cursor.getString(cursor.getColumnIndex(COIN))
        return Coin(id,coinType);
    }
}