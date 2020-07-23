package com.myapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.myapps.Seviye2.MusicPlayer
import com.myapps.Seviye2.Notification
import com.myapps.Seviye2.Sayac

class Level2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)
    }

    fun MenuClick2(view: View) {
        if (view.id == R.id.sayac) {
            val intent = Intent(applicationContext, Sayac::class.java)
            startActivity(intent)
        }
        if (view.id == R.id.musicplayer) {
            val intent = Intent(applicationContext, MusicPlayer::class.java)
            startActivity(intent)
        }
        if (view.id == R.id.bildirim) {
            val intent = Intent(applicationContext, Notification::class.java)
            startActivity(intent)
        }
    }
}
