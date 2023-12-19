package com.example.aplikasipahlawansejarahsumaterabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pahlawan : AppCompatActivity() {
    private lateinit var bagussalim : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pahlawan)

        bagussalim = findViewById(R.id.pahlawan_txt5)

        bagussalim.setOnClickListener{
            val move = Intent(this@pahlawan, agussalim_activity::class.java)
            startActivity(move)

        }
        
    }
}