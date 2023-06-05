package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinforapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPersian.setOnClickListener {
            val myIntent = Intent(this, PersianActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        binding.btnSphynx.setOnClickListener {
            val myIntent = Intent(this, SphynxActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        binding.btnSiamese.setOnClickListener {
            val myIntent = Intent(this, SiameseActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        binding.btnRagdoll.setOnClickListener {
            val myIntent = Intent(this, RagdollActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        binding.btnMunchkin.setOnClickListener {
            val myIntent = Intent(this, MunchkinActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}