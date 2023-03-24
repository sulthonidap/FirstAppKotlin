package com.example.firstappstudykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstappstudykotlin.databinding.ActivitySignInBinding
import com.example.firstappstudykotlin.databinding.ActivityWelcomeBinding

class SignIn : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))

        binding.SignUpText.setOnClickListener {
            finish()
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        }

    }
}