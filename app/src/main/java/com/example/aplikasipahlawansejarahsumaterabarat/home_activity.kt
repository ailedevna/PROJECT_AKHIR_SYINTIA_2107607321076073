package com.example.aplikasipahlawansejarahsumaterabarat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_activity : AppCompatActivity() {
    private lateinit var buttonpahlawan : Button
    private lateinit var buttonprofil : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonpahlawan = findViewById(R.id.pahlawan)
        buttonprofil = findViewById(R.id.profil)

        buttonpahlawan.setOnClickListener {
            val move = Intent(this@home_activity, kategoripahlawan_activity::class.java)
            startActivity(move)
        }
        buttonprofil.setOnClickListener {
            val move = Intent(this@home_activity, Profil::class.java)
            startActivity(move)
        }
    }
}