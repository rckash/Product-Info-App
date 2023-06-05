package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityPersianImageBinding
import com.example.productinforapp.databinding.ActivitySiameseImageBinding

class SiameseImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySiameseImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySiameseImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToDescription.setOnClickListener {
            val myIntent = Intent(this, SiameseActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}