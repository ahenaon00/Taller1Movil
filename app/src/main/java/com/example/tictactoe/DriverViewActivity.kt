package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tictactoe.databinding.ActivityDriverViewBinding
import com.example.tictactoe.databinding.ActivityInicioBinding

class DriverViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityDriverViewBinding
        super.onCreate(savedInstanceState)
        binding = ActivityDriverViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val driver : Driver? = intent.getParcelableExtra<Driver>("piloto")
        if (driver != null) {
            binding.fullNameText.text = driver.fullName
            binding.teamText.text = driver.teamName
            binding.acronymText.text = driver.nameAcronym
        }

    }
}