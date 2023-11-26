
package com.example.labado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.labado.databinding.ActivityEnterBinding

class EnterActivity : AppCompatActivity() {
    lateinit var binding: ActivityEnterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityEnterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // open next activity: registration/login
        binding.btnEnter.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity::class.java)) }
        binding.btnReg.setOnClickListener {
          startActivity(Intent(applicationContext, RegistationActivity::class.java))
        }
    }
}