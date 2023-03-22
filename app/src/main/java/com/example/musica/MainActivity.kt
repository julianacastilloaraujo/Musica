package com.example.musica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_merengue.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnmerengue.setOnClickListener {

            val intent:Intent = Intent(this, Merengue::class.java)
            startActivity(intent)
        }
        btnsalsa.setOnClickListener {

            val intent:Intent = Intent(this, Salsa::class.java)
            startActivity(intent)
        }
        btnvallenato.setOnClickListener {

            val intent:Intent = Intent(this, Vallenato::class.java)
            startActivity(intent)
        }
    }
}