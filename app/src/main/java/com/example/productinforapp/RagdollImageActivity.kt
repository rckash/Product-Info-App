package com.example.productinforapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.e
import com.example.productinforapp.databinding.ActivityPersianImageBinding
import com.example.productinforapp.databinding.ActivityRagdollImageBinding

class RagdollImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRagdollImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRagdollImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackToDescription.setOnClickListener {
            val myIntent = Intent(this, RagdollActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }
}