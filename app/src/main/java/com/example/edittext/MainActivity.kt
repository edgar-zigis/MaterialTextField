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

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.password.isLight = false
            binding.password.error = resources.getString(R.string.floating_error_incorrect_password)
            binding.password.errorColor = ContextCompat.getColor(this, R.color.colorAccent)
        }
    }

    override fun attachBaseContext(newBase: Context) {
        val context = ContextWrapper.wrap(newBase, Locale("en"))    //  for RTL testing use "ar"
        super.attachBaseContext(context)
    }
}
