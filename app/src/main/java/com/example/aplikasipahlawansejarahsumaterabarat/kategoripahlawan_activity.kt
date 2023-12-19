package com.example.aplikasipahlawansejarahsumaterabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class kategoripahlawan_activity : AppCompatActivity() {
    private lateinit var buttonpejuang : TextView
    private lateinit var buttonulama : TextView
    private lateinit var buttonpemimpin : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoripahlawan)

        buttonpejuang = findViewById(R.id.pejuang)
        buttonulama = findViewById(R.id.ulama)
        buttonpemimpin = findViewById(R.id.pemimpin)

        buttonpejuang.setOnClickListener{
            val move = Intent(this@kategoripahlawan_activity, pejuang_activity::class.java)
            startActivity(move)
        }

        buttonulama.setOnClickListener{
            val move = Intent(this@kategoripahlawan_activity, ulama_activity::class.java)
            startActivity(move)
        }

        buttonpemimpin.setOnClickListener{
            val move = Intent(this@kategoripahlawan_activity, pemimpin_activity::class.java)
            startActivity(move)
        }
    }
}