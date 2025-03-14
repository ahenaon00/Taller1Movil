package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tictactoe.databinding.ActivityInicioBinding
import com.example.tictactoe.databinding.ActivityMainBinding

class InicioActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.verTriqui.setOnClickListener {
            startActivity(Intent(baseContext, MainActivity::class.java))
        }
        binding.verPilotos.setOnClickListener {
            startActivity(Intent(baseContext, Formula1Activity::class.java))
        }
    }
}