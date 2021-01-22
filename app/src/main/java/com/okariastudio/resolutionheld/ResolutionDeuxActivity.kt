package com.okariastudio.resolutionheld

import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class ResolutionDeuxActivity : AppCompatActivity() {

    var rondList : MutableList<Rond>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resolution_deux)
        val pleinEcran = WindowManager.LayoutParams.FLAG_FULLSCREEN
        window.setFlags(pleinEcran, pleinEcran)

        loadData()

        val imageVList : Array<ImageView> = arrayOf(findViewById(R.id.rond1),findViewById(R.id.rond2),findViewById(R.id.rond3),findViewById(R.id.rond4),findViewById(R.id.rond5),findViewById(R.id.rond6),findViewById(R.id.rond7),findViewById(R.id.rond8),findViewById(R.id.rond9),findViewById(R.id.rond10),findViewById(R.id.rond11),findViewById(R.id.rond12),findViewById(R.id.rond13),findViewById(R.id.rond14),findViewById(R.id.rond15),findViewById(R.id.rond16),findViewById(R.id.rond17),findViewById(R.id.rond18),findViewById(R.id.rond19),findViewById(R.id.rond20),findViewById(R.id.rond21),findViewById(R.id.rond22),findViewById(R.id.rond23),findViewById(R.id.rond24),findViewById(R.id.rond25),findViewById(R.id.rond26),findViewById(R.id.rond27),findViewById(R.id.rond28),findViewById(R.id.rond29),findViewById(R.id.rond30),findViewById(R.id.rond31))
        val imageDoneList = intArrayOf(R.drawable.blancun,R.drawable.blancdeux,R.drawable.blanc3,R.drawable.blanc4,R.drawable.blanc5,R.drawable.blanc6,R.drawable.blanc7,R.drawable.blanc8,R.drawable.blanc9,R.drawable.blanc10,R.drawable.blanc11,R.drawable.blanc12,R.drawable.blanc13,R.drawable.blanc14,R.drawable.blanc15,R.drawable.blanc16,R.drawable.blanc17,R.drawable.blanc18,R.drawable.blanc19,R.drawable.blanc20,R.drawable.blanc21,R.drawable.blanc22,R.drawable.blanc23,R.drawable.blanc24,R.drawable.blanc25,R.drawable.blanc26,R.drawable.blanc27,R.drawable.blanc28,R.drawable.blanc29,R.drawable.blanc30,R.drawable.blanc31)
        val imageToDoList = intArrayOf(R.drawable.noir1,R.drawable.noir2,R.drawable.noir3,R.drawable.noir4,R.drawable.noir5,R.drawable.noir6,R.drawable.noir7,R.drawable.noir8,R.drawable.noir9,R.drawable.noir10,R.drawable.noir11,R.drawable.noir12,R.drawable.noir13,R.drawable.noir14,R.drawable.noir15,R.drawable.noir16,R.drawable.noir17,R.drawable.noir18,R.drawable.noir19,R.drawable.noir20,R.drawable.noir21,R.drawable.noir22,R.drawable.noir23,R.drawable.noir24,R.drawable.noir25,R.drawable.noir26,R.drawable.noir27,R.drawable.noir28,R.drawable.noir29,R.drawable.noir30,R.drawable.noir31)

        for(i in 1..31){
            if(rondList?.get(i-1)?.state == 1){
                imageVList[i-1].setImageResource(imageDoneList[i-1])
            } else {
                imageVList[i-1].setImageResource(imageToDoList[i-1])
            }
            imageVList[i-1].setOnClickListener {
                if(rondList?.get(i-1)?.state == 1) {
                    imageVList[i-1].setImageResource(imageToDoList[i-1])
                    rondList?.get(i-1)?.state = 0
                    saveData()
                } else {
                    imageVList[i-1].setImageResource(imageDoneList[i-1])
                    rondList?.get(i-1)?.state = 1
                    saveData()
                }
            }
        }


        val resetButton : Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener {
            val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
            alertDialog.setMessage("Voulez-vous vraiment réinitialiser cette résolution ?")
                .setPositiveButton("Oui", DialogInterface.OnClickListener { dialog, which ->
                    for(i in 0..30){
                        imageVList[i].setImageResource(imageToDoList[i])
                        rondList?.get(i)?.state = 0
                    }
                    saveData()
                })
                .setNegativeButton("Non",
                    DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
            alertDialog.create()?.show()
        }

        val previousButton : Button = findViewById(R.id.next)
        previousButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun saveData(){
        val sharedPreferences : SharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE)
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        val gson = Gson()
        val json : String = gson.toJson(rondList)
        editor.putString("list2", json)
        editor.apply()
    }

    fun loadData(){
        val sharedPreferences : SharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE)
        val gson = Gson()
        val json : String? = sharedPreferences.getString("list2", null)
        val type = object : TypeToken<ArrayList<Rond?>?>() {}.type
        rondList = gson.fromJson(json, type)


        if(rondList==null){
            rondList = ArrayList()
            for(i in 1..31){
                (rondList as ArrayList<Rond>).add(Rond(i, 0))
            }
        }
    }
}