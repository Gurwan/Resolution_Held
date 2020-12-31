package com.okariastudio.resolutionheld

import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log


class DatabaseHandler(context: Context) : SQLiteOpenHelper(context, "resolutionHeldDB", null, 1) {

    private val DATABASE_NAME = "resolutionHeldDB"
    private val DATABASE_VERSION = 1

    private val TABLE_ONE = "resolution_one"
    private val TABLE_TWO = "resolution_two"

    private val ONE_NUMBER = "oneNumber"
    private val ONE_STATE = "oneState"
    private val TWO_NUMBER = "twoNumber"
    private val TWO_STATE = "twoState"

    private val SQL_CREATE_TABLE_ONE = "CREATE TABLE IF NOT EXISTS $TABLE_ONE($ONE_NUMBER INTEGER PRIMARY KEY, $ONE_STATE INTEGER );"
    private val SQL_CREATE_TABLE_TWO = "CREATE TABLE IF NOT EXISTS $TABLE_TWO($TWO_NUMBER INTEGER PRIMARY KEY, $TWO_STATE INTEGER );"

    override fun onCreate(db: SQLiteDatabase?) {
        try {
            //not null assert !!
            db!!.execSQL(SQL_CREATE_TABLE_ONE)
            db.execSQL(SQL_CREATE_TABLE_TWO)
            val database = this.writableDatabase
            for(i in 1..31){
                try {
                    val contentValues1 = ContentValues()
                    val contentValues2 = ContentValues()
                    contentValues1.put(ONE_NUMBER, i)
                    contentValues1.put(ONE_STATE, 0)
                    contentValues2.put(TWO_NUMBER, i)
                    contentValues2.put(TWO_STATE, 0)
                    database.insert(TABLE_ONE, null, contentValues1)
                    database.insert(TABLE_TWO, null, contentValues2)
                } catch (e: java.lang.Exception) {
                    Log.e(
                        "DATABASEHANDLER",
                        "(FAVORIS) Erreur lors de l'insertion des sons: " + e.message
                    )
                }
            }
            database.close()
        } catch (e: Exception) {
            Log.e("DATABASEHANDLER", " " + e.message)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_ONE");
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_TWO");
        onCreate(db);
    }

    fun clearAll(number : Int) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        if(number==1){
            for(i in 1..31){
                contentValues.put(ONE_NUMBER, i)
                contentValues.put(ONE_STATE, 0)
                database.update(TABLE_ONE, contentValues, "oneNumber = ?", arrayOf(i.toString()))
            }

        } else {
            for(i in 1..31) {
                contentValues.put(TWO_NUMBER, i)
                contentValues.put(TWO_STATE, 0)
                database.update(TABLE_TWO, contentValues, "twoNumber = ?", arrayOf(i.toString()))
            }
        }

    }
}