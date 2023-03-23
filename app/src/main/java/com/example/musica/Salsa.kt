package com.example.musica

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_salsa.*

class Salsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salsa)
        var play=findViewById<Button>(R.id.play2)
        var stop=findViewById<Button>(R.id.stop2)
        var mp= MediaPlayer()
        play2.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.pista2))
            mp.prepare()
            mp.start()
        }
        stop2.setOnClickListener {
            mp.stop()
            mp.release()
            mp= MediaPlayer()
        }
    }
}