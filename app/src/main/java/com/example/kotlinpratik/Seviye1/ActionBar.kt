package com.example.kotlinpratik.Seviye1

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import com.example.kotlinpratik.Level1
import com.example.kotlinpratik.R


class ActionBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar)
        val ab = supportActionBar
        ab!!.title = "Başlık"
        ab.subtitle = "AltBaşlık"
        ab.setBackgroundDrawable(resources.getDrawable(R.drawable.buton_tasarimi2))
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            val intent = Intent(applicationContext, Level1::class.java)
            NavUtils.navigateUpTo(this, intent)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
