package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_reality.*
import kotlinx.android.synthetic.main.expextation.*

class reality : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reality)

        bck2.setOnClickListener {
            finish()

        }
    }
}