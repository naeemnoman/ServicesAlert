package com.example.services

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context

class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()


        val channel = NotificationChannel(

            "channel_id",
            "My foreground service notification",
            NotificationManager.IMPORTANCE_DEFAULT
        )
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.createNotificationChannel(channel)


    }
}