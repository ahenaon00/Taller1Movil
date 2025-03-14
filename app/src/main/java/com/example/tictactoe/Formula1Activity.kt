package com.example.tictactoe

import android.R
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.tictactoe.databinding.ActivityFormula1Binding
import org.json.JSONArray

class Formula1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityFormula1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormula1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFromURL()

    }

    fun loadFromURL() {
        val queue = Volley.newRequestQueue(this)
        var url = "https://api.openf1.org/v1/"
        val path = "drivers"
        val query = "?session_key=9684" //Testing 2025
        val req = StringRequest(url + path + query, Response.Listener() {
            var drivers = mutableListOf<Driver>()
            val data = it
            Log.i("RESTF1", data)
            var json = JSONArray(data)
            for (i in 0..json.length() - 1) {
                val jsonObject = json.getJSONObject(i)
                val name = jsonObject.getString("full_name")
                val country = jsonObject.getString("country_code")
                val acronym = jsonObject.getString("name_acronym")
                val tName = jsonObject.getString("team_name")
                val color = jsonObject.getString("team_colour")

                val driver = Driver(name, country,acronym,tName,color)
                drivers.add(driver)
            }
            val adapter = ArrayAdapter<Driver>(this, R.layout.simple_list_item_1, drivers)
            binding.listaDrivers.adapter = adapter
        }, {
            Log.e("RESTF1", "Error in F1 API Request ${it.cause}")
        })

        queue.add(req)
    }
}