package com.example.labado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.labado.databinding.ActivityRegistationBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.actionCodeSettings
import com.google.firebase.auth.auth
import com.google.firebase.database.database

class RegistationActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Firebase.database

        binding = ActivityRegistationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regBackToMain.setOnClickListener {
            finish()
            Log.d("debug", "asdo")
        }

        binding.btnCreateAccount.setOnClickListener {
            val f_name = binding.tiFName.text.toString()
            val s_name = binding.tiSName.text.toString()
            val email = binding.tiEmail.text.toString()
            val pwd = binding.tiPassword.text.toString()
            val r_pwd = binding.tiRepPassword.text.toString()

            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Toast.makeText(applicationContext, "Почта введена неверно", Toast.LENGTH_SHORT).show()
            }
            else {
                // authentication
            }

        }




    }
}