package com.example.firstappstudykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstappstudykotlin.databinding.ActivitySignInBinding
import com.example.firstappstudykotlin.databinding.ActivitySignUpBinding
import com.example.firstappstudykotlin.databinding.ActivityWelcomeBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.register.setOnClickListener {
            finish()
            startActivity(Intent(this, SignIn::class.java))
        }



    }
}