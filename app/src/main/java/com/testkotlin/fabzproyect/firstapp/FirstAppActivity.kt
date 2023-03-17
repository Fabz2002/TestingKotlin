package com.testkotlin.fabzproyect.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testkotlin.fabzproyect.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_first_app)
    }
}