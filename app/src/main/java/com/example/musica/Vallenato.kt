package com.example.musica

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_salsa.*
import kotlinx.android.synthetic.main.activity_vallenato.*

class Vallenato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vallenato)
        var play=findViewById<Button>(R.id.play3)
        var stop=findViewById<Button>(R.id.stop3)
        var mp= MediaPlayer()
        play3.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.pista3))
            mp.prepare()
            mp.start()
        }
        stop3.setOnClickListener {
            mp.stop()
            mp.release()
            mp= MediaPlayer()
        }
    }
}