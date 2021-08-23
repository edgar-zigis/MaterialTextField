package com.example.edittext

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.example.edittext.custom.ContextWrapper
import com.example.edittext.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(LayoutInflater.from(this)).apply {
            setContentView(root)
            button.setOnClickListener {
                password.isLight = false
                password.error = resources.getString(R.string.floating_error_incorrect_password)
                password.errorColor = ContextCompat.getColor(this@MainActivity, R.color.colorAccent)
            }
        }
    }

    override fun attachBaseContext(newBase: Context) {
        val context = ContextWrapper.wrap(newBase, Locale("en"))    //  for RTL testing use "ar"
        super.attachBaseContext(context)
    }
}
