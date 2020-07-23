package com.myapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

import com.myapps.Seviye1.*

class Level1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level1)


    }

    fun MenuClick(view: View) {

        if (view.id == R.id.button) {
            val ark_plan_page = Intent(applicationContext, ArkaPlan::class.java)
            startActivity(ark_plan_page)
        }
        if (view.id == R.id.button2) {
            val slayt_page = Intent(applicationContext, Slayt::class.java)
            startActivity(slayt_page)
        }
        if (view.id == R.id.button5) {
            val Color_Changer_page = Intent(applicationContext, Background_Color_Changer::class.java)
            startActivity(Color_Changer_page)
        }
        if (view.id == R.id.button3) {
            val Toast_page = Intent(applicationContext, ToastMessage::class.java)
            startActivity(Toast_page)
        }
        if (view.id == R.id.button4) {
            val Butonk_page = Intent(applicationContext, Buton_Kullanimi::class.java)
            startActivity(Butonk_page)
        }

        if (view.id == R.id.button8) {
            val Texttpye = Intent(applicationContext, TextView::class.java)
            startActivity(Texttpye)
        }
        if (view.id == R.id.button9) {
            val Imagebutton = Intent(applicationContext, ImageButton::class.java)
            startActivity(Imagebutton)
        }
        if (view.id == R.id.button10) {
            val Listview = Intent(applicationContext, Listview::class.java)
            startActivity(Listview)
        }
        if (view.id == R.id.button11) {
            val Check = Intent(applicationContext, Chekbox::class.java)
            startActivity(Check)
        }
        if (view.id == R.id.button12) {
            val Spiner = Intent(applicationContext, AcilirListe::class.java)
            startActivity(Spiner)
        }
        if (view.id == R.id.button13) {
            val Verigonder = Intent(applicationContext, VeriGonder::class.java)
            startActivity(Verigonder)
        }
        if (view.id == R.id.button14) {
            val AramaYap = Intent(applicationContext, TelefonAramasi::class.java)
            startActivity(AramaYap)
        }
        if (view.id == R.id.button15) {
            val Yonlendir = Intent(applicationContext, Yonlendir::class.java)
            startActivity(Yonlendir)
        }
        if (view.id == R.id.button16) {
            val pay = Intent(applicationContext, Paylas::class.java)
            startActivity(pay)
        }
        if (view.id == R.id.button17) {
            val bar = Intent(applicationContext, ActionBar::class.java)
            startActivity(bar)
        }
        if (view.id == R.id.button18) {
            val context = Intent(applicationContext, Context_Menu::class.java)
            startActivity(context)
        }
        if (view.id == R.id.button19) {
            val context2 = Intent(applicationContext, Context_Menu2::class.java)
            startActivity(context2)
        }
        if (view.id == R.id.button20) {
            val context2 = Intent(applicationContext, AlertDiyalog::class.java)
            startActivity(context2)
        }
        if (view.id == R.id.button21) {
            val LoginValidation = Intent(applicationContext, LoginValidation::class.java)
            startActivity(LoginValidation)
        }

    }
}
