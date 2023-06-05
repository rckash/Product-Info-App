package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityMunchkinImageBinding
import com.example.productinforapp.databinding.ActivityPersianImageBinding

class PersianImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersianImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersianImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToDescription.setOnClickListener {
            val myIntent = Intent(this, PersianActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}