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

        val iv1 : ImageView = findViewById(R.id.rond1)
        if(rondList?.get(0)?.state == 1) {
            iv1.setImageResource(R.drawable.blancun)
        } else {
            iv1.setImageResource(R.drawable.noir1)
        }
        iv1.setOnClickListener {
            if(rondList?.get(0)?.state == 1) {
                iv1.setImageResource(R.drawable.noir1)
                rondList?.get(0)?.state = 0
                saveData()
            } else {
                iv1.setImageResource(R.drawable.blancun)
                rondList?.get(0)?.state = 1
                saveData()
            }
        }

        val iv2 : ImageView = findViewById(R.id.rond2)
        if(rondList?.get(1)?.state == 1) {
            iv2.setImageResource(R.drawable.blancdeux)
        } else {
            iv2.setImageResource(R.drawable.noir2)
        }
        iv2.setOnClickListener {
            if(rondList?.get(1)?.state == 1) {
                iv2.setImageResource(R.drawable.noir2)
                rondList?.get(1)?.state = 0
                saveData()
            } else {
                iv2.setImageResource(R.drawable.blancdeux)
                rondList?.get(1)?.state = 1
                saveData()
            }
        }

        val iv3 : ImageView = findViewById(R.id.rond3)
        if(rondList?.get(2)?.state == 1) {
            iv3.setImageResource(R.drawable.blanc3)
        } else {
            iv3.setImageResource(R.drawable.noir3)
        }
        iv3.setOnClickListener {
            if(rondList?.get(2)?.state == 1) {
                iv3.setImageResource(R.drawable.noir3)
                rondList?.get(2)?.state = 0
                saveData()
            } else {
                iv3.setImageResource(R.drawable.blanc3)
                rondList?.get(2)?.state = 1
                saveData()
            }
        }

        val iv4 : ImageView = findViewById(R.id.rond4)
        if(rondList?.get(3)?.state == 1) {
            iv4.setImageResource(R.drawable.blanc4)
        } else {
            iv4.setImageResource(R.drawable.noir4)
        }
        iv4.setOnClickListener {
            if(rondList?.get(3)?.state == 1) {
                iv4.setImageResource(R.drawable.noir4)
                rondList?.get(3)?.state = 0
                saveData()
            } else {
                iv4.setImageResource(R.drawable.blanc4)
                rondList?.get(3)?.state = 1
                saveData()
            }
        }

        val iv5 : ImageView = findViewById(R.id.rond5)
        if(rondList?.get(4)?.state == 1) {
            iv5.setImageResource(R.drawable.blanc5)
        } else {
            iv5.setImageResource(R.drawable.noir5)
        }
        iv5.setOnClickListener {
            if(rondList?.get(4)?.state == 1) {
                iv5.setImageResource(R.drawable.noir5)
                rondList?.get(4)?.state = 0
                saveData()
            } else {
                iv5.setImageResource(R.drawable.blanc5)
                rondList?.get(4)?.state = 1
                saveData()
            }
        }

        val iv6 : ImageView = findViewById(R.id.rond6)
        if(rondList?.get(5)?.state == 1) {
            iv6.setImageResource(R.drawable.blanc6)
        } else {
            iv6.setImageResource(R.drawable.noir6)
        }
        iv6.setOnClickListener {
            if(rondList?.get(5)?.state == 1) {
                iv6.setImageResource(R.drawable.noir6)
                rondList?.get(5)?.state = 0
                saveData()
            } else {
                iv6.setImageResource(R.drawable.blanc6)
                rondList?.get(5)?.state = 1
                saveData()
            }
        }

        val iv7 : ImageView = findViewById(R.id.rond7)
        if(rondList?.get(6)?.state == 1) {
            iv7.setImageResource(R.drawable.blanc7)
        } else {
            iv7.setImageResource(R.drawable.noir7)
        }
        iv7.setOnClickListener {
            if(rondList?.get(6)?.state == 1) {
                iv7.setImageResource(R.drawable.noir7)
                rondList?.get(6)?.state = 0
                saveData()
            } else {
                iv7.setImageResource(R.drawable.blanc7)
                rondList?.get(6)?.state = 1
                saveData()
            }
        }

        val iv8 : ImageView = findViewById(R.id.rond8)
        if(rondList?.get(7)?.state == 1) {
            iv8.setImageResource(R.drawable.blanc8)
        } else {
            iv8.setImageResource(R.drawable.noir8)
        }
        iv8.setOnClickListener {
            if(rondList?.get(7)?.state == 1) {
                iv8.setImageResource(R.drawable.noir8)
                rondList?.get(7)?.state = 0
                saveData()
            } else {
                iv8.setImageResource(R.drawable.blanc8)
                rondList?.get(7)?.state = 1
                saveData()
            }
        }

        val iv9 : ImageView = findViewById(R.id.rond9)
        if(rondList?.get(8)?.state == 1) {
            iv9.setImageResource(R.drawable.blanc9)
        } else {
            iv9.setImageResource(R.drawable.noir9)
        }
        iv9.setOnClickListener {
            if(rondList?.get(8)?.state == 1) {
                iv9.setImageResource(R.drawable.noir9)
                rondList?.get(8)?.state = 0
                saveData()
            } else {
                iv9.setImageResource(R.drawable.blanc9)
                rondList?.get(8)?.state = 1
                saveData()
            }
        }

        val iv10 : ImageView = findViewById(R.id.rond10)
        if(rondList?.get(9)?.state == 1) {
            iv10.setImageResource(R.drawable.blanc10)
        } else {
            iv10.setImageResource(R.drawable.noir10)
        }
        iv10.setOnClickListener {
            if(rondList?.get(9)?.state == 1) {
                iv10.setImageResource(R.drawable.noir10)
                rondList?.get(9)?.state = 0
                saveData()
            } else {
                iv10.setImageResource(R.drawable.blanc10)
                rondList?.get(9)?.state = 1
                saveData()
            }
        }

        val iv11 : ImageView = findViewById(R.id.rond11)
        if(rondList?.get(10)?.state == 1) {
            iv11.setImageResource(R.drawable.blanc11)
        } else {
            iv11.setImageResource(R.drawable.noir11)
        }
        iv11.setOnClickListener {
            if(rondList?.get(10)?.state == 1) {
                iv11.setImageResource(R.drawable.noir11)
                rondList?.get(10)?.state = 0
                saveData()
            } else {
                iv11.setImageResource(R.drawable.blanc11)
                rondList?.get(10)?.state = 1
                saveData()
            }
        }

        val iv12 : ImageView = findViewById(R.id.rond12)
        if(rondList?.get(11)?.state == 1) {
            iv12.setImageResource(R.drawable.blanc12)
        } else {
            iv12.setImageResource(R.drawable.noir12)
        }
        iv12.setOnClickListener {
            if(rondList?.get(11)?.state == 1) {
                iv12.setImageResource(R.drawable.noir12)
                rondList?.get(11)?.state = 0
                saveData()
            } else {
                iv12.setImageResource(R.drawable.blanc12)
                rondList?.get(11)?.state = 1
                saveData()
            }
        }

        val iv13 : ImageView = findViewById(R.id.rond13)
        if(rondList?.get(12)?.state == 1) {
            iv13.setImageResource(R.drawable.blanc13)
        } else {
            iv13.setImageResource(R.drawable.noir13)
        }
        iv13.setOnClickListener {
            if(rondList?.get(12)?.state == 1) {
                iv13.setImageResource(R.drawable.noir13)
                rondList?.get(12)?.state = 0
                saveData()
            } else {
                iv13.setImageResource(R.drawable.blanc13)
                rondList?.get(12)?.state = 1
                saveData()
            }
        }

        val iv14 : ImageView = findViewById(R.id.rond14)
        if(rondList?.get(13)?.state == 1) {
            iv14.setImageResource(R.drawable.blanc14)
        } else {
            iv14.setImageResource(R.drawable.noir14)
        }
        iv14.setOnClickListener {
            if(rondList?.get(13)?.state == 1) {
                iv14.setImageResource(R.drawable.noir14)
                rondList?.get(13)?.state = 0
                saveData()
            } else {
                iv14.setImageResource(R.drawable.blanc14)
                rondList?.get(13)?.state = 1
                saveData()
            }
        }

        val iv15 : ImageView = findViewById(R.id.rond15)
        if(rondList?.get(14)?.state == 1) {
            iv15.setImageResource(R.drawable.blanc15)
        } else {
            iv15.setImageResource(R.drawable.noir15)
        }
        iv15.setOnClickListener {
            if(rondList?.get(14)?.state == 1) {
                iv15.setImageResource(R.drawable.noir15)
                rondList?.get(14)?.state = 0
                saveData()
            } else {
                iv15.setImageResource(R.drawable.blanc15)
                rondList?.get(14)?.state = 1
                saveData()
            }
        }

        val iv16 : ImageView = findViewById(R.id.rond16)
        if(rondList?.get(15)?.state == 1) {
            iv16.setImageResource(R.drawable.blanc16)
        } else {
            iv16.setImageResource(R.drawable.noir16)
        }
        iv16.setOnClickListener {
            if(rondList?.get(15)?.state == 1) {
                iv16.setImageResource(R.drawable.noir16)
                rondList?.get(15)?.state = 0
                saveData()
            } else {
                iv16.setImageResource(R.drawable.blanc16)
                rondList?.get(15)?.state = 1
                saveData()
            }
        }

        val iv17 : ImageView = findViewById(R.id.rond17)
        if(rondList?.get(16)?.state == 1) {
            iv17.setImageResource(R.drawable.blanc17)
        } else {
            iv17.setImageResource(R.drawable.noir17)
        }
        iv17.setOnClickListener {
            if(rondList?.get(16)?.state == 1) {
                iv17.setImageResource(R.drawable.noir17)
                rondList?.get(16)?.state = 0
                saveData()
            } else {
                iv17.setImageResource(R.drawable.blanc17)
                rondList?.get(16)?.state = 1
                saveData()
            }
        }

        val iv18 : ImageView = findViewById(R.id.rond18)
        if(rondList?.get(17)?.state == 1) {
            iv18.setImageResource(R.drawable.blanc18)
        } else {
            iv18.setImageResource(R.drawable.noir18)
        }
        iv18.setOnClickListener {
            if(rondList?.get(17)?.state == 1) {
                iv18.setImageResource(R.drawable.noir18)
                rondList?.get(17)?.state = 0
                saveData()
            } else {
                iv18.setImageResource(R.drawable.blanc18)
                rondList?.get(17)?.state = 1
                saveData()
            }
        }

        val iv19 : ImageView = findViewById(R.id.rond19)
        if(rondList?.get(18)?.state == 1) {
            iv19.setImageResource(R.drawable.blanc19)
        } else {
            iv19.setImageResource(R.drawable.noir19)
        }
        iv19.setOnClickListener {
            if(rondList?.get(18)?.state == 1) {
                iv19.setImageResource(R.drawable.noir19)
                rondList?.get(18)?.state = 0
                saveData()
            } else {
                iv19.setImageResource(R.drawable.blanc19)
                rondList?.get(18)?.state = 1
                saveData()
            }
        }

        val iv20 : ImageView = findViewById(R.id.rond20)
        if(rondList?.get(19)?.state == 1) {
            iv20.setImageResource(R.drawable.blanc20)
        } else {
            iv20.setImageResource(R.drawable.noir20)
        }
        iv20.setOnClickListener {
            if(rondList?.get(19)?.state == 1) {
                iv20.setImageResource(R.drawable.noir20)
                rondList?.get(19)?.state = 0
                saveData()
            } else {
                iv20.setImageResource(R.drawable.blanc20)
                rondList?.get(19)?.state = 1
                saveData()
            }
        }

        val iv21 : ImageView = findViewById(R.id.rond21)
        if(rondList?.get(20)?.state == 1) {
            iv21.setImageResource(R.drawable.blanc21)
        } else {
            iv21.setImageResource(R.drawable.noir21)
        }
        iv21.setOnClickListener {
            if(rondList?.get(20)?.state == 1) {
                iv21.setImageResource(R.drawable.noir21)
                rondList?.get(20)?.state = 0
                saveData()
            } else {
                iv21.setImageResource(R.drawable.blanc21)
                rondList?.get(20)?.state = 1
                saveData()
            }
        }

        val iv22 : ImageView = findViewById(R.id.rond22)
        if(rondList?.get(21)?.state == 1) {
            iv22.setImageResource(R.drawable.blanc22)
        } else {
            iv22.setImageResource(R.drawable.noir22)
        }
        iv22.setOnClickListener {
            if(rondList?.get(21)?.state == 1) {
                iv22.setImageResource(R.drawable.noir22)
                rondList?.get(21)?.state = 0
                saveData()
            } else {
                iv22.setImageResource(R.drawable.blanc22)
                rondList?.get(21)?.state = 1
                saveData()
            }
        }

        val iv23 : ImageView = findViewById(R.id.rond23)
        if(rondList?.get(22)?.state == 1) {
            iv23.setImageResource(R.drawable.blanc23)
        } else {
            iv23.setImageResource(R.drawable.noir23)
        }
        iv23.setOnClickListener {
            if(rondList?.get(22)?.state == 1) {
                iv23.setImageResource(R.drawable.noir23)
                rondList?.get(22)?.state = 0
                saveData()
            } else {
                iv23.setImageResource(R.drawable.blanc23)
                rondList?.get(22)?.state = 1
                saveData()
            }
        }

        val iv24 : ImageView = findViewById(R.id.rond24)
        if(rondList?.get(23)?.state == 1) {
            iv24.setImageResource(R.drawable.blanc24)
        } else {
            iv24.setImageResource(R.drawable.noir24)
        }
        iv24.setOnClickListener {
            if(rondList?.get(23)?.state == 1) {
                iv24.setImageResource(R.drawable.noir24)
                rondList?.get(23)?.state = 0
                saveData()
            } else {
                iv24.setImageResource(R.drawable.blanc24)
                rondList?.get(23)?.state = 1
                saveData()
            }
        }

        val iv25 : ImageView = findViewById(R.id.rond25)
        if(rondList?.get(24)?.state == 1) {
            iv25.setImageResource(R.drawable.blanc25)
        } else {
            iv25.setImageResource(R.drawable.noir25)
        }
        iv25.setOnClickListener {
            if(rondList?.get(24)?.state == 1) {
                iv25.setImageResource(R.drawable.noir25)
                rondList?.get(24)?.state = 0
                saveData()
            } else {
                iv25.setImageResource(R.drawable.blanc25)
                rondList?.get(24)?.state = 1
                saveData()
            }
        }

        val iv26 : ImageView = findViewById(R.id.rond26)
        if(rondList?.get(25)?.state == 1) {
            iv26.setImageResource(R.drawable.blanc26)
        } else {
            iv26.setImageResource(R.drawable.noir26)
        }
        iv26.setOnClickListener {
            if(rondList?.get(25)?.state == 1) {
                iv26.setImageResource(R.drawable.noir26)
                rondList?.get(25)?.state = 0
                saveData()
            } else {
                iv26.setImageResource(R.drawable.blanc26)
                rondList?.get(25)?.state = 1
                saveData()
            }
        }

        val iv27 : ImageView = findViewById(R.id.rond27)
        if(rondList?.get(26)?.state == 1) {
            iv27.setImageResource(R.drawable.blanc27)
        } else {
            iv27.setImageResource(R.drawable.noir27)
        }
        iv27.setOnClickListener {
            if(rondList?.get(26)?.state == 1) {
                iv27.setImageResource(R.drawable.noir27)
                rondList?.get(26)?.state = 0
                saveData()
            } else {
                iv27.setImageResource(R.drawable.blanc27)
                rondList?.get(26)?.state = 1
                saveData()
            }
        }

        val iv28 : ImageView = findViewById(R.id.rond28)
        if(rondList?.get(27)?.state == 1) {
            iv28.setImageResource(R.drawable.blanc28)
        } else {
            iv28.setImageResource(R.drawable.noir28)
        }
        iv28.setOnClickListener {
            if(rondList?.get(27)?.state == 1) {
                iv28.setImageResource(R.drawable.noir28)
                rondList?.get(27)?.state = 0
                saveData()
            } else {
                iv28.setImageResource(R.drawable.blanc28)
                rondList?.get(27)?.state = 1
                saveData()
            }
        }

        val iv29 : ImageView = findViewById(R.id.rond29)
        if(rondList?.get(28)?.state == 1) {
            iv29.setImageResource(R.drawable.blanc29)
        } else {
            iv29.setImageResource(R.drawable.noir29)
        }
        iv29.setOnClickListener {
            if(rondList?.get(28)?.state == 1) {
                iv29.setImageResource(R.drawable.noir29)
                rondList?.get(28)?.state = 0
                saveData()
            } else {
                iv29.setImageResource(R.drawable.blanc29)
                rondList?.get(28)?.state = 1
                saveData()
            }
        }

        val iv30 : ImageView = findViewById(R.id.rond30)
        if(rondList?.get(29)?.state == 1) {
            iv30.setImageResource(R.drawable.blanc30)
        } else {
            iv30.setImageResource(R.drawable.noir30)
        }
        iv30.setOnClickListener {
            if(rondList?.get(29)?.state == 1) {
                iv30.setImageResource(R.drawable.noir30)
                rondList?.get(29)?.state = 0
                saveData()
            } else {
                iv30.setImageResource(R.drawable.blanc30)
                rondList?.get(29)?.state = 1
                saveData()
            }
        }

        val iv31 : ImageView = findViewById(R.id.rond31)
        if(rondList?.get(30)?.state == 1) {
            iv31.setImageResource(R.drawable.blanc31)
        } else {
            iv31.setImageResource(R.drawable.noir31)
        }
        iv31.setOnClickListener {
            if(rondList?.get(30)?.state == 1) {
                iv31.setImageResource(R.drawable.noir31)
                rondList?.get(30)?.state = 0
                saveData()
            } else {
                iv31.setImageResource(R.drawable.blanc31)
                rondList?.get(30)?.state = 1
                saveData()
            }
        }



        val resetButton : Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener {
            val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
            alertDialog.setMessage("Voulez-vous vraiment réinitialiser cette résolution ?")
                .setPositiveButton("Oui", DialogInterface.OnClickListener { dialog, which ->
                    iv1.setImageResource(R.drawable.noir1)
                    iv2.setImageResource(R.drawable.noir2)
                    iv3.setImageResource(R.drawable.noir3)
                    iv4.setImageResource(R.drawable.noir4)
                    iv5.setImageResource(R.drawable.noir5)
                    iv6.setImageResource(R.drawable.noir6)
                    iv7.setImageResource(R.drawable.noir7)
                    iv8.setImageResource(R.drawable.noir8)
                    iv9.setImageResource(R.drawable.noir9)
                    iv10.setImageResource(R.drawable.noir10)
                    iv11.setImageResource(R.drawable.noir11)
                    iv12.setImageResource(R.drawable.noir12)
                    iv13.setImageResource(R.drawable.noir13)
                    iv14.setImageResource(R.drawable.noir14)
                    iv15.setImageResource(R.drawable.noir15)
                    iv16.setImageResource(R.drawable.noir16)
                    iv17.setImageResource(R.drawable.noir17)
                    iv18.setImageResource(R.drawable.noir18)
                    iv19.setImageResource(R.drawable.noir19)
                    iv20.setImageResource(R.drawable.noir20)
                    iv21.setImageResource(R.drawable.noir21)
                    iv22.setImageResource(R.drawable.noir22)
                    iv23.setImageResource(R.drawable.noir23)
                    iv24.setImageResource(R.drawable.noir24)
                    iv25.setImageResource(R.drawable.noir25)
                    iv26.setImageResource(R.drawable.noir26)
                    iv27.setImageResource(R.drawable.noir27)
                    iv28.setImageResource(R.drawable.noir28)
                    iv29.setImageResource(R.drawable.noir29)
                    iv30.setImageResource(R.drawable.noir30)
                    iv31.setImageResource(R.drawable.noir31)
                    for(i in 0..30){
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
        val sharedPreferences : SharedPreferences = getSharedPreferences(
            "shared preferences",
            MODE_PRIVATE
        )
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        val gson = Gson()
        val json : String = gson.toJson(rondList)
        editor.putString("list2", json)
        editor.apply()
    }

    fun loadData(){
        val sharedPreferences : SharedPreferences = getSharedPreferences(
            "shared preferences",
            MODE_PRIVATE
        )
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