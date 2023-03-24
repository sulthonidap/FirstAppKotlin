package com.example.firstappstudykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstappstudykotlin.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getstarted.setOnClickListener {
            finish()
            startActivity(Intent(this, SignIn::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }



    }
}