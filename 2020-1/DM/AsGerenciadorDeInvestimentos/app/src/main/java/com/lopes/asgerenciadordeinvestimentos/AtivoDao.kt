package com.lopes.asgerenciadordeinvestimentos

import android.content.Context
import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.lopes.asgerenciadordeinvestimentos.Obejtos.Coin


class AtivoDao(context: Context) {

    var banco = DbHelper(context)

    /**
     * Vamos criar nosso método insert ().
     * Insere dados no banco de dados SQLIte.
     */

    fun insertInAtivo(ativo: Ativo): String {
        val db = banco.writableDatabase
        val contentValues = ContentValues()

        contentValues.put(ATIVO_QUANTIDADE, ativo.quantidade)
        contentValues.put(ATIVO_VALOR, ativo.valorMoeda)
        contentValues.put(ATIVO_TIPO, ativo.tipoMoeda)


        var resp_id=db.insert(TABLE_ATIVOS, null, contentValues)
        val msg = if(resp_id!=-1L){
            "Inserido com sucesso"
        }else{
            "Erro ao inserir"
        }
        db.close()
        return msg
    }

    fun update(ativo: Ativo):
            Boolean {
        val db = banco.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(ATIVO_ID, ativo.id)
        contentValues.put(ATIVO_DATA, ativo.data)
        contentValues.put(ATIVO_QUANTIDADE, ativo.quantidade)
        contentValues.put(ATIVO_VALOR, ativo.valorMoeda)
        contentValues.put(ATIVO_TIPO, ativo.tipoMoeda)
        //db.update()


        db.insertWithOnConflict(TABLE_ATIVOS,null,contentValues,SQLiteDatabase.CONFLICT_REPLACE)
        db.close()

        return true
    }


    fun remove(ativo: Ativo) : Int {
        val db = banco.writableDatabase
        return db.delete(TABLE_ATIVOS,"ID =?", arrayOf(ativo.id.toString()))
    }

    fun getAllAtivos(): ArrayList<Ativo>{
        Log.v("LOG", "GetAll")
        val db = banco.writableDatabase
        val  sql = "SELECT * from "+ TABLE_ATIVOS
        val cursor = db.rawQuery(sql, null)
        val ativos = ArrayList<Ativo>()
        while (cursor.moveToNext()){
            val ativo = ativoFromCursor(cursor)
            ativos.add(ativo)
        }
        cursor.close()
        db.close()
        Log.v("LOG", "Get ${ativos.size}")
        return ativos
    }

    private fun ativoFromCursor(cursor: Cursor): Ativo{
        val id = cursor.getInt(cursor.getColumnIndex(ATIVO_ID))
        val data = cursor.getString(cursor.getColumnIndex(ATIVO_DATA))
        val quantidade = cursor.getInt(cursor.getColumnIndex(ATIVO_QUANTIDADE))
        val valor = cursor.getDouble(cursor.getColumnIndex(ATIVO_VALOR))
        val tipo = cursor.getString(cursor.getColumnIndex(ATIVO_TIPO))
        return Ativo(id, data, quantidade, valor, tipo);
    }
}