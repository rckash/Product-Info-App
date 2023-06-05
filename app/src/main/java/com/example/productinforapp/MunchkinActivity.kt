package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityMunchkinBinding

class MunchkinActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMunchkinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMunchkinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToMain.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        binding.imageView.setOnClickListener {
            val myIntent = Intent(this, MunchkinImageActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}