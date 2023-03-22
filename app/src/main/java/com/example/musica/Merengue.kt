package com.example.musica

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Merengue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merengue)
        var play=findViewById<Button>(R.id.play)
        var stop=findViewById<Button>(R.id.stop)
        var mp=MediaPlayer()
        play.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.mucis))
            mp.prepare()
            mp.start()
        }
        stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp=MediaPlayer()
        }
    }
}