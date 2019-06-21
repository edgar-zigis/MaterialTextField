package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            password.isLight = false
            password.error = "Wrong password!"
            password.errorColor = ContextCompat.getColor(this, R.color.colorAccent)
        }
    }
}
