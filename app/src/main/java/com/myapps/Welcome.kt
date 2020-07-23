package com.myapps

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            Log.d(TAG, "onCreate() Restoring previous state")
            /* restore state */
        } else {
            Log.d(TAG, "onCreate() No saved state available")
            /* initialize app */
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val permission = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)


        if (permission != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(applicationContext, "İzin Verilmemiş", Toast.LENGTH_LONG).show()
            makeRequest()
        } else
            Toast.makeText(applicationContext, "İzin Verilmiş", Toast.LENGTH_LONG).show()

    }

    protected fun makeRequest() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), RECORD_REQUEST_CODE)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            RECORD_REQUEST_CODE ->

                if (grantResults.size == 0 || grantResults[0] != PackageManager.PERMISSION_GRANTED) {

                    Log.i(TAG, "Permission has been denied by user")
                } else {
                    Log.i(TAG, "Permission has been granted by user")
                }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(applicationContext, "Dikkat Uygulama Kapanmadı!!", Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.Level1) {
            val level1 = Intent(applicationContext, Level1::class.java)
            startActivity(level1)
            return true
        }
        if (id == R.id.Level2) {

            val level2 = Intent(applicationContext, Level2::class.java)
            startActivity(level2)
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    companion object {

        private val RECORD_REQUEST_CODE = 101
        private val TAG = "PermissionDemo"
    }

}
