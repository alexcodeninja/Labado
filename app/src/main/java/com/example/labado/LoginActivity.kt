package com.example.labado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labado.databinding.ActivityLoginBinding
import com.example.labado.databinding.ActivityEnterBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)


        binding.btnNext.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
        binding.loginBackToEnter.setOnClickListener {
            finish()
        }

        setContentView(binding.root)
    }
}