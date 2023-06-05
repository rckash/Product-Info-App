package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityKatsekpoBinding

class KatsekpoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKatsekpoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKatsekpoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToMain2.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}