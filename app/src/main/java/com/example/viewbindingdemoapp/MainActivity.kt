package com.example.viewbindingdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingdemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.Button.setOnClickListener {
            binding.TextView.text = "Tapped!!"
        }
    }
}