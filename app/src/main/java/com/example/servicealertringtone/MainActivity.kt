package com.example.services

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.servicealertringtone.R



class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS),200)

        findViewById<Button>(R.id.button1).setOnClickListener {

            val intent = Intent(this, MyService::class.java)
            intent.action = Actions.START.toString()
            startService(intent)


        }


        findViewById<Button>(R.id.button2).setOnClickListener {

            val intent = Intent(this, MyService::class.java)
            intent.action = Actions.STOP.toString()
            startService(intent)


        }

    }
}