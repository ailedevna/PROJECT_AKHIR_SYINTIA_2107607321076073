package com.example.aplikasipahlawansejarahsumaterabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pejuang_activity : AppCompatActivity() {
    private lateinit var buttonabdlhalim : Button
    private lateinit var buttonabdlmuiz : Button
    private lateinit var buttonadnnkapaugani : Button
    private lateinit var buttonbagazizchan : Button
    private lateinit var buttonmohnatsir : Button
    private lateinit var buttonrasunasaid : Button
    private lateinit var buttonruhannakudus : Button
    private lateinit var buttonsutansyhrir : Button
    private lateinit var buttonhazairin : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pejuang)

        buttonabdlhalim = findViewById(R.id.pejuang_txt2)
        buttonabdlmuiz = findViewById(R.id.pejuang_txt3)
        buttonadnnkapaugani = findViewById(R.id.pejuang_txt4)
        buttonbagazizchan = findViewById(R.id.pejuang_txt5)
        buttonmohnatsir = findViewById(R.id.pejuang_txt6)
        buttonrasunasaid = findViewById(R.id.pejuang_txt7)
        buttonruhannakudus = findViewById(R.id.pejuang_txt8)
        buttonsutansyhrir = findViewById(R.id.pejuang_txt9)
        buttonhazairin = findViewById(R.id.pejuang_txt10)

        buttonabdlhalim.setOnClickListener{
            val move = Intent(this@pejuang_activity, abdulhalim_activity::class.java)
            startActivity(move)
        }

        buttonabdlmuiz.setOnClickListener{
            val move = Intent(this@pejuang_activity, abdulmuiz_activity::class.java)
            startActivity(move)
        }

        buttonadnnkapaugani.setOnClickListener{
            val move = Intent(this@pejuang_activity, adnankapaugani_activity::class.java)
            startActivity(move)
        }

        buttonbagazizchan.setOnClickListener{
            val move = Intent(this@pejuang_activity, bazizchan_activity::class.java)
            startActivity(move)
        }

        buttonmohnatsir.setOnClickListener{
            val move = Intent(this@pejuang_activity, mohnatsir_activity::class.java)
            startActivity(move)
        }

        buttonrasunasaid.setOnClickListener{
            val move = Intent(this@pejuang_activity, rasunasaid_activity::class.java)
            startActivity(move)
        }

        buttonruhannakudus.setOnClickListener{
            val move = Intent(this@pejuang_activity, ruhannakudus_activity::class.java)
            startActivity(move)
        }

        buttonsutansyhrir.setOnClickListener{
            val move = Intent(this@pejuang_activity, sutansyahrir_activity::class.java)
            startActivity(move)
        }

        buttonhazairin.setOnClickListener{
            val move = Intent(this@pejuang_activity, Hazairin_activity::class.java)
            startActivity(move)
        }
    }
}