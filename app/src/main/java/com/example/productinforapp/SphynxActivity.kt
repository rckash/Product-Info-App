package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivitySphynxBinding

class SphynxActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySphynxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySphynxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToMain.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        binding.imageView.setOnClickListener {
            val myIntent = Intent(this, SphynxImageActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}