package com.lopes.asgerenciadordeinvestimentos

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteDatabase
import android.util.Log


/**
 * Vamos começar criando nossa classe auxiliar CRUD do banco de dados
 * baseado no SQLiteHelper.
 */
class DbHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    /**
     * Nosso método onCreate ().
     * Chamado quando o banco de dados é criado pela primeira vez. Isto é
     * onde a criação de tabelas e a população inicial das tabelas
     * deve acontecer.
     */
    override fun onCreate(db: SQLiteDatabase) {
        val sql="CREATE TABLE $TABLE_COIN" +
                    "($COIN_ID INTEGER PRIMARY KEY " + "AUTOINCREMENT," +
                    "$COIN TEXT, " +
                    "$COIN_VALUE DOUBLE);"

        var sql2="CREATE TABLE $TABLE_ATIVOS " +
                    "($ATIVO_ID  INTEGER PRIMARY KEY" + " AUTOINCREMENT, " +
                    "$ATIVO_DATA DATETIME, " +
                    "$ATIVO_QUANTIDADE INTEGER, " +
                    "$ATIVO_VALOR DECIMAL, " +
                    "$ATIVO_TIPO TEXT, " +
                    "$ID_COIN INTEGER, " +
                    "FOREIGN KEY ($ID_COIN) REFERENCES $TABLE_COIN ($COIN_ID)" +
                    ");"
        db.execSQL(sql2)
        db.execSQL(sql)
        Log.e("LOG","Criando")
    }
    /**
     * Vamos criar nosso método onUpgrade
     * Chamado quando o banco de dados precisa ser atualizado. A implementação deve
     * use esse método para descartar tabelas, adicionar tabelas ou fazer qualquer outra coisa que precisar
     * para atualizar para a nova versão do esquema.
     */
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ATIVOS)
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_COIN)
        onCreate(db)
    }


}