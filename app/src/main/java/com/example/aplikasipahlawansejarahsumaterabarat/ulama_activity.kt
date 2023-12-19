package com.example.aplikasipahlawansejarahsumaterabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ulama_activity : AppCompatActivity() {
    private lateinit var buttonbuyahamka : Button
    private lateinit var buttonhajiagssalim : Button
    private lateinit var buttonilyasykoub : Button
    private lateinit var buttonmuhyamin : Button
    private lateinit var buttontuankuib : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulama)

        buttonbuyahamka = findViewById(R.id.ulama_txt2)
        buttonhajiagssalim = findViewById(R.id.ulama_txt3)
        buttonilyasykoub = findViewById(R.id.ulama_txt4)
        buttonmuhyamin = findViewById(R.id.ulama_txt5)
        buttontuankuib = findViewById(R.id.ulama_txt6)

        buttonbuyahamka.setOnClickListener{
            val move = Intent(this@ulama_activity, buyahamka_activity::class.java)
            startActivity(move)
        }

        buttonhajiagssalim.setOnClickListener{
            val move = Intent(this@ulama_activity,agussalim_activity::class.java)
            startActivity(move)
        }

        buttonilyasykoub.setOnClickListener{
            val move = Intent(this@ulama_activity, ilyasyakoub_activity::class.java)
            startActivity(move)
        }

        buttonmuhyamin.setOnClickListener{
            val move = Intent(this@ulama_activity, mohyamin_activity::class.java)
            startActivity(move)
        }

        buttontuankuib.setOnClickListener{
            val move = Intent(this@ulama_activity, tuanib_activity::class.java)
            startActivity(move)
        }
    }
}