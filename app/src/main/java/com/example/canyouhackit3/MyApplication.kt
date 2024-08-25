package com.example.canyouhackit3

import android.app.Application
import com.google.firebase.FirebaseApp

class MyApplication:
Application(){
    override fun onCreate()
    {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}