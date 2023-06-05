package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityMunchkinImageBinding

class MunchkinImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMunchkinImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMunchkinImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToDescription.setOnClickListener {
            val myIntent = Intent(this, MunchkinActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}