package com.okariastudio.resolutionheld

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class MainActivity : AppCompatActivity() {

    var rondList : MutableList<Rond>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        val iv1 : ImageView = findViewById(R.id.rond1)
        if(rondList?.get(0)?.state == 1){
            iv1.setImageResource(R.drawable.rondblanc)
            iv1.setOnClickListener {
                iv1.setImageResource(R.drawable.rondnoir)
                rondList?.get(0)?.state = 0
                saveData()
            }
        } else {
            iv1.setOnClickListener {
                iv1.setImageResource(R.drawable.rondblanc)
                rondList?.get(0)?.state = 1
                println(rondList?.get(0)?.state)
                saveData()
            }
        }

        val iv2 : ImageView = findViewById(R.id.rond2)
        if(rondList?.get(1)?.state == 1){
            iv2.setImageResource(R.drawable.rondblanc)
            iv2.setOnClickListener {
                iv2.setImageResource(R.drawable.rondnoir)
                rondList?.get(1)?.state = 0
                saveData()
            }
        } else {
            iv2.setOnClickListener {
                iv2.setImageResource(R.drawable.rondblanc)
                rondList?.get(1)?.state = 1
                println(rondList?.get(1)?.state)
                saveData()
            }
        }

        val iv3 : ImageView = findViewById(R.id.rond3)
        if(rondList?.get(2)?.state == 1){
            iv3.setImageResource(R.drawable.rondblanc)
            iv3.setOnClickListener {
                iv3.setImageResource(R.drawable.rondnoir)
                rondList?.get(2)?.state = 0
                saveData()
            }
        } else {
            iv3.setOnClickListener {
                iv3.setImageResource(R.drawable.rondblanc)
                rondList?.get(2)?.state = 1
                println(rondList?.get(2)?.state)
                saveData()
            }
        }

        val iv4 : ImageView = findViewById(R.id.rond4)
        if(rondList?.get(3)?.state == 1){
            iv4.setImageResource(R.drawable.rondblanc)
            iv4.setOnClickListener {
                iv4.setImageResource(R.drawable.rondnoir)
                rondList?.get(3)?.state = 0
                saveData()
            }
        } else {
            iv4.setOnClickListener {
                iv4.setImageResource(R.drawable.rondblanc)
                rondList?.get(3)?.state = 1
                println(rondList?.get(3)?.state)
                saveData()
            }
        }

        val iv5 : ImageView = findViewById(R.id.rond5)
        if(rondList?.get(4)?.state == 1){
            iv5.setImageResource(R.drawable.rondblanc)
            iv5.setOnClickListener {
                iv5.setImageResource(R.drawable.rondnoir)
                rondList?.get(4)?.state = 0
                saveData()
            }
        } else {
            iv5.setOnClickListener {
                iv5.setImageResource(R.drawable.rondblanc)
                rondList?.get(4)?.state = 1
                println(rondList?.get(4)?.state)
                saveData()
            }
        }

        val iv6 : ImageView = findViewById(R.id.rond6)
        if(rondList?.get(5)?.state == 1){
            iv6.setImageResource(R.drawable.rondblanc)
            iv6.setOnClickListener {
                iv6.setImageResource(R.drawable.rondnoir)
                rondList?.get(5)?.state = 0
                saveData()
            }
        } else {
            iv6.setOnClickListener {
                iv6.setImageResource(R.drawable.rondblanc)
                rondList?.get(5)?.state = 1
                println(rondList?.get(5)?.state)
                saveData()
            }
        }

        val iv7 : ImageView = findViewById(R.id.rond7)
        if(rondList?.get(6)?.state == 1){
            iv7.setImageResource(R.drawable.rondblanc)
            iv7.setOnClickListener {
                iv7.setImageResource(R.drawable.rondnoir)
                rondList?.get(6)?.state = 0
                saveData()
            }
        } else {
            iv7.setOnClickListener {
                iv7.setImageResource(R.drawable.rondblanc)
                rondList?.get(6)?.state = 1
                println(rondList?.get(6)?.state)
                saveData()
            }
        }

        val iv8 : ImageView = findViewById(R.id.rond8)
        if(rondList?.get(7)?.state == 1){
            iv8.setImageResource(R.drawable.rondblanc)
            iv8.setOnClickListener {
                iv8.setImageResource(R.drawable.rondnoir)
                rondList?.get(7)?.state = 0
                saveData()
            }
        } else {
            iv8.setOnClickListener {
                iv8.setImageResource(R.drawable.rondblanc)
                rondList?.get(7)?.state = 1
                println(rondList?.get(7)?.state)
                saveData()
            }
        }

        val iv9 : ImageView = findViewById(R.id.rond9)
        if(rondList?.get(8)?.state == 1){
            iv9.setImageResource(R.drawable.rondblanc)
            iv9.setOnClickListener {
                iv9.setImageResource(R.drawable.rondnoir)
                rondList?.get(8)?.state = 0
                saveData()
            }
        } else {
            iv9.setOnClickListener {
                iv9.setImageResource(R.drawable.rondblanc)
                rondList?.get(8)?.state = 1
                println(rondList?.get(8)?.state)
                saveData()
            }
        }

        val iv10 : ImageView = findViewById(R.id.rond10)
        if(rondList?.get(9)?.state == 1){
            iv10.setImageResource(R.drawable.rondblanc)
            iv10.setOnClickListener {
                iv10.setImageResource(R.drawable.rondnoir)
                rondList?.get(9)?.state = 0
                saveData()
            }
        } else {
            iv10.setOnClickListener {
                iv10.setImageResource(R.drawable.rondblanc)
                rondList?.get(9)?.state = 1
                println(rondList?.get(9)?.state)
                saveData()
            }
        }

        val iv11 : ImageView = findViewById(R.id.rond11)
        if(rondList?.get(10)?.state == 1){
            iv11.setImageResource(R.drawable.rondblanc)
            iv11.setOnClickListener {
                iv11.setImageResource(R.drawable.rondnoir)
                rondList?.get(10)?.state = 0
                saveData()
            }
        } else {
            iv11.setOnClickListener {
                iv11.setImageResource(R.drawable.rondblanc)
                rondList?.get(10)?.state = 1
                println(rondList?.get(10)?.state)
                saveData()
            }
        }

        val iv12 : ImageView = findViewById(R.id.rond12)
        if(rondList?.get(11)?.state == 1){
            iv12.setImageResource(R.drawable.rondblanc)
            iv12.setOnClickListener {
                iv12.setImageResource(R.drawable.rondnoir)
                rondList?.get(11)?.state = 0
                saveData()
            }
        } else {
            iv12.setOnClickListener {
                iv12.setImageResource(R.drawable.rondblanc)
                rondList?.get(11)?.state = 1
                println(rondList?.get(11)?.state)
                saveData()
            }
        }

        val iv13 : ImageView = findViewById(R.id.rond13)
        if(rondList?.get(12)?.state == 1){
            iv13.setImageResource(R.drawable.rondblanc)
            iv13.setOnClickListener {
                iv13.setImageResource(R.drawable.rondnoir)
                rondList?.get(12)?.state = 0
                saveData()
            }
        } else {
            iv13.setOnClickListener {
                iv13.setImageResource(R.drawable.rondblanc)
                rondList?.get(12)?.state = 1
                println(rondList?.get(12)?.state)
                saveData()
            }
        }

        val iv14 : ImageView = findViewById(R.id.rond14)
        if(rondList?.get(13)?.state == 1){
            iv14.setImageResource(R.drawable.rondblanc)
            iv14.setOnClickListener {
                iv14.setImageResource(R.drawable.rondnoir)
                rondList?.get(13)?.state = 0
                saveData()
            }
        } else {
            iv14.setOnClickListener {
                iv14.setImageResource(R.drawable.rondblanc)
                rondList?.get(13)?.state = 1
                println(rondList?.get(13)?.state)
                saveData()
            }
        }

        val iv15 : ImageView = findViewById(R.id.rond15)
        if(rondList?.get(14)?.state == 1){
            iv15.setImageResource(R.drawable.rondblanc)
            iv15.setOnClickListener {
                iv15.setImageResource(R.drawable.rondnoir)
                rondList?.get(14)?.state = 0
                saveData()
            }
        } else {
            iv15.setOnClickListener {
                iv15.setImageResource(R.drawable.rondblanc)
                rondList?.get(14)?.state = 1
                println(rondList?.get(14)?.state)
                saveData()
            }
        }

        val iv16 : ImageView = findViewById(R.id.rond16)
        if(rondList?.get(15)?.state == 1){
            iv16.setImageResource(R.drawable.rondblanc)
            iv16.setOnClickListener {
                iv16.setImageResource(R.drawable.rondnoir)
                rondList?.get(15)?.state = 0
                saveData()
            }
        } else {
            iv16.setOnClickListener {
                iv16.setImageResource(R.drawable.rondblanc)
                rondList?.get(15)?.state = 1
                println(rondList?.get(15)?.state)
                saveData()
            }
        }

        val iv17 : ImageView = findViewById(R.id.rond17)
        if(rondList?.get(16)?.state == 1){
            iv17.setImageResource(R.drawable.rondblanc)
            iv17.setOnClickListener {
                iv17.setImageResource(R.drawable.rondnoir)
                rondList?.get(16)?.state = 0
                saveData()
            }
        } else {
            iv17.setOnClickListener {
                iv17.setImageResource(R.drawable.rondblanc)
                rondList?.get(16)?.state = 1
                println(rondList?.get(16)?.state)
                saveData()
            }
        }

        val iv18 : ImageView = findViewById(R.id.rond18)
        if(rondList?.get(17)?.state == 1){
            iv18.setImageResource(R.drawable.rondblanc)
            iv18.setOnClickListener {
                iv18.setImageResource(R.drawable.rondnoir)
                rondList?.get(17)?.state = 0
                saveData()
            }
        } else {
            iv18.setOnClickListener {
                iv18.setImageResource(R.drawable.rondblanc)
                rondList?.get(17)?.state = 1
                println(rondList?.get(17)?.state)
                saveData()
            }
        }

        val iv19 : ImageView = findViewById(R.id.rond19)
        if(rondList?.get(18)?.state == 1){
            iv19.setImageResource(R.drawable.rondblanc)
            iv19.setOnClickListener {
                iv19.setImageResource(R.drawable.rondnoir)
                rondList?.get(18)?.state = 0
                saveData()
            }
        } else {
            iv19.setOnClickListener {
                iv19.setImageResource(R.drawable.rondblanc)
                rondList?.get(18)?.state = 1
                println(rondList?.get(18)?.state)
                saveData()
            }
        }

        val iv20 : ImageView = findViewById(R.id.rond20)
        if(rondList?.get(19)?.state == 1){
            iv20.setImageResource(R.drawable.rondblanc)
            iv20.setOnClickListener {
                iv20.setImageResource(R.drawable.rondnoir)
                rondList?.get(19)?.state = 0
                saveData()
            }
        } else {
            iv20.setOnClickListener {
                iv20.setImageResource(R.drawable.rondblanc)
                rondList?.get(19)?.state = 1
                println(rondList?.get(19)?.state)
                saveData()
            }
        }

        val iv21 : ImageView = findViewById(R.id.rond21)
        if(rondList?.get(20)?.state == 1){
            iv21.setImageResource(R.drawable.rondblanc)
            iv21.setOnClickListener {
                iv21.setImageResource(R.drawable.rondnoir)
                rondList?.get(20)?.state = 0
                saveData()
            }
        } else {
            iv21.setOnClickListener {
                iv21.setImageResource(R.drawable.rondblanc)
                rondList?.get(20)?.state = 1
                println(rondList?.get(20)?.state)
                saveData()
            }
        }

        val iv22 : ImageView = findViewById(R.id.rond22)
        if(rondList?.get(21)?.state == 1){
            iv22.setImageResource(R.drawable.rondblanc)
            iv22.setOnClickListener {
                iv22.setImageResource(R.drawable.rondnoir)
                rondList?.get(21)?.state = 0
                saveData()
            }
        } else {
            iv22.setOnClickListener {
                iv22.setImageResource(R.drawable.rondblanc)
                rondList?.get(21)?.state = 1
                println(rondList?.get(21)?.state)
                saveData()
            }
        }

        val iv23 : ImageView = findViewById(R.id.rond23)
        if(rondList?.get(22)?.state == 1){
            iv23.setImageResource(R.drawable.rondblanc)
            iv23.setOnClickListener {
                iv23.setImageResource(R.drawable.rondnoir)
                rondList?.get(22)?.state = 0
                saveData()
            }
        } else {
            iv23.setOnClickListener {
                iv23.setImageResource(R.drawable.rondblanc)
                rondList?.get(22)?.state = 1
                println(rondList?.get(22)?.state)
                saveData()
            }
        }

        val iv24 : ImageView = findViewById(R.id.rond24)
        if(rondList?.get(23)?.state == 1){
            iv24.setImageResource(R.drawable.rondblanc)
            iv24.setOnClickListener {
                iv24.setImageResource(R.drawable.rondnoir)
                rondList?.get(23)?.state = 0
                saveData()
            }
        } else {
            iv24.setOnClickListener {
                iv24.setImageResource(R.drawable.rondblanc)
                rondList?.get(23)?.state = 1
                println(rondList?.get(23)?.state)
                saveData()
            }
        }

        val iv25 : ImageView = findViewById(R.id.rond25)
        if(rondList?.get(24)?.state == 1){
            iv25.setImageResource(R.drawable.rondblanc)
            iv25.setOnClickListener {
                iv25.setImageResource(R.drawable.rondnoir)
                rondList?.get(24)?.state = 0
                saveData()
            }
        } else {
            iv25.setOnClickListener {
                iv25.setImageResource(R.drawable.rondblanc)
                rondList?.get(24)?.state = 1
                println(rondList?.get(24)?.state)
                saveData()
            }
        }

        val iv26 : ImageView = findViewById(R.id.rond26)
        if(rondList?.get(25)?.state == 1){
            iv26.setImageResource(R.drawable.rondblanc)
            iv26.setOnClickListener {
                iv26.setImageResource(R.drawable.rondnoir)
                rondList?.get(25)?.state = 0
                saveData()
            }
        } else {
            iv26.setOnClickListener {
                iv26.setImageResource(R.drawable.rondblanc)
                rondList?.get(25)?.state = 1
                println(rondList?.get(25)?.state)
                saveData()
            }
        }

        val iv27 : ImageView = findViewById(R.id.rond27)
        if(rondList?.get(26)?.state == 1){
            iv27.setImageResource(R.drawable.rondblanc)
            iv27.setOnClickListener {
                iv27.setImageResource(R.drawable.rondnoir)
                rondList?.get(26)?.state = 0
                saveData()
            }
        } else {
            iv27.setOnClickListener {
                iv27.setImageResource(R.drawable.rondblanc)
                rondList?.get(26)?.state = 1
                println(rondList?.get(26)?.state)
                saveData()
            }
        }

        val iv28 : ImageView = findViewById(R.id.rond28)
        if(rondList?.get(27)?.state == 1){
            iv28.setImageResource(R.drawable.rondblanc)
            iv28.setOnClickListener {
                iv28.setImageResource(R.drawable.rondnoir)
                rondList?.get(27)?.state = 0
                saveData()
            }
        } else {
            iv28.setOnClickListener {
                iv28.setImageResource(R.drawable.rondblanc)
                rondList?.get(27)?.state = 1
                println(rondList?.get(27)?.state)
                saveData()
            }
        }

        val iv29 : ImageView = findViewById(R.id.rond29)
        if(rondList?.get(28)?.state == 1){
            iv29.setImageResource(R.drawable.rondblanc)
            iv29.setOnClickListener {
                iv29.setImageResource(R.drawable.rondnoir)
                rondList?.get(28)?.state = 0
                saveData()
            }
        } else {
            iv29.setOnClickListener {
                iv29.setImageResource(R.drawable.rondblanc)
                rondList?.get(28)?.state = 1
                println(rondList?.get(28)?.state)
                saveData()
            }
        }

        val iv30 : ImageView = findViewById(R.id.rond30)
        if(rondList?.get(29)?.state == 1){
            iv30.setImageResource(R.drawable.rondblanc)
            iv30.setOnClickListener {
                iv30.setImageResource(R.drawable.rondnoir)
                rondList?.get(29)?.state = 0
                saveData()
            }
        } else {
            iv30.setOnClickListener {
                iv30.setImageResource(R.drawable.rondblanc)
                rondList?.get(29)?.state = 1
                println(rondList?.get(29)?.state)
                saveData()
            }
        }

        val iv31 : ImageView = findViewById(R.id.rond31)
        if(rondList?.get(30)?.state == 1){
            iv31.setImageResource(R.drawable.rondblanc)
            iv31.setOnClickListener {
                iv31.setImageResource(R.drawable.rondnoir)
                rondList?.get(30)?.state = 0
                saveData()
            }
        } else {
            iv31.setOnClickListener {
                iv31.setImageResource(R.drawable.rondblanc)
                rondList?.get(30)?.state = 1
                println(rondList?.get(30)?.state)
                saveData()
            }
        }
    }

    fun saveData(){
        val sharedPreferences : SharedPreferences = getSharedPreferences(
            "shared preferences",
            MODE_PRIVATE
        )
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        val gson = Gson()
        val json : String = gson.toJson(rondList)
        editor.putString("list", json)
        editor.apply()
    }

    fun loadData(){
        val sharedPreferences : SharedPreferences = getSharedPreferences(
            "shared preferences",
            MODE_PRIVATE
        )
        val gson = Gson()
        val json : String? = sharedPreferences.getString("list", null)
        val type = object : TypeToken<ArrayList<Rond?>?>() {}.type
        rondList = gson.fromJson(json,type)

        if(rondList==null){
            rondList = ArrayList()
            for(i in 1..31){
                (rondList as ArrayList<Rond>).add(Rond(i,0))
            }
        }
    }

}