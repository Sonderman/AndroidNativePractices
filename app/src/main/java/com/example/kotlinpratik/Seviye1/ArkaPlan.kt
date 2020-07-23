package com.example.kotlinpratik.Seviye1

import android.graphics.Typeface
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinpratik.R


class ArkaPlan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.arkaplan)

        val type = Typeface.createFromAsset(assets, "font/nightype.ttf")
        val ark_ptext = findViewById<TextView>(R.id.metintext)
        ark_ptext.typeface = type
        val hello = findViewById<TextView>(R.id.Arka_yazi)
        hello.setOnClickListener { Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT).show() }

    }

}
