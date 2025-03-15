package com.example.tictactoe

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.tictactoe.databinding.ActivityDriverViewBinding
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import androidx.core.net.toUri

class DriverViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDriverViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDriverViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val driver : Driver? = intent.getParcelableExtra<Driver>("piloto")
        if (driver != null) {
            binding.fullNameText.text = driver.fullName
            binding.teamText.text = driver.teamName
            binding.acronymText.text = driver.nameAcronym
        }
        loadColor(driver)
        loadImages(driver)
    }

    fun loadColor(driver : Driver?) {
        if(driver != null) {
            binding.teamText.setTextColor(Color.parseColor("#" + driver.teamColor))
        }
    }

    fun loadImages(driver: Driver?) {
        var codigoPais : String
        var url: String
        if(driver != null) {
            codigoPais = driver.countryCode
            when (driver.countryCode) {
                "GER" -> codigoPais = "DEU"
                "MON" -> codigoPais = "MCO"
            }
            url = "https://countries.petethompson.net/data/flags/" + codigoPais + ".svg"
            GlideToVectorYou.justLoadImage(this, url.toUri(), binding.imageView2)
            if (driver.countryCode == "null") {
                 url = "https://picsum.photos/200"
                Glide.with(this).load(url).into(binding.imageView2)
            }
            Glide.with(baseContext).load(driver.headShotURL).into(binding.imageView)
        }
    }
}