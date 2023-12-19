package com.example.aplikasipahlawansejarahsumaterabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pemimpin_activity : AppCompatActivity() {
    private lateinit var buttonabdulhalim : Button
    private lateinit var buttonabdulmuiz : Button
    private lateinit var buttonilyasyakoub : Button
    private lateinit var buttonmohhatta : Button
    private lateinit var buttonrasunasaid : Button
    private lateinit var buttonruhannakudus : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemimpin)

        buttonabdulhalim = findViewById(R.id.pemimpin_txt2)
        buttonabdulmuiz = findViewById(R.id.pemimpin_txt3)
        buttonilyasyakoub = findViewById(R.id.pemimpin_txt4)
        buttonmohhatta = findViewById(R.id.pemimpin_txt5)
        buttonrasunasaid = findViewById(R.id.pemimpin_txt6)
        buttonruhannakudus = findViewById(R.id.pemimpin_txt7)

        buttonabdulhalim.setOnClickListener{
            val move = Intent(this@pemimpin_activity, abdulhalim_activity::class.java)
            startActivity(move)
        }

        buttonabdulmuiz.setOnClickListener{
            val move = Intent(this@pemimpin_activity, abdulmuiz_activity::class.java)
            startActivity(move)
        }

        buttonilyasyakoub.setOnClickListener{
            val move = Intent(this@pemimpin_activity, ilyasyakoub_activity::class.java)
            startActivity(move)
        }

        buttonmohhatta.setOnClickListener{
            val move = Intent(this@pemimpin_activity, mohhatta_activity::class.java)
            startActivity(move)
        }

        buttonrasunasaid.setOnClickListener{
            val move = Intent(this@pemimpin_activity, rasunasaid_activity::class.java)
            startActivity(move)
        }

        buttonruhannakudus.setOnClickListener{
            val move = Intent(this@pemimpin_activity, ruhannakudus_activity::class.java)
            startActivity(move)
        }
    }
}