package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityPersianImageBinding
import com.example.productinforapp.databinding.ActivitySphynxImageBinding

class SphynxImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySphynxImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySphynxImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToDescription.setOnClickListener {
            val myIntent = Intent(this, SphynxActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}