package com.example.tictactoe

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class DriverAdapter(var contexto : Context, var recurso : Int, var drivers : List<Driver>) : ArrayAdapter<Driver>(contexto, recurso, drivers) {
    override fun getView(position : Int, convertView : View?, parent: ViewGroup) : View {
        val layoutInflater : LayoutInflater = LayoutInflater.from(contexto)
        val view = layoutInflater.inflate(recurso, parent, false)
        val posDriver : TextView = view.findViewById<TextView>(R.id.posDriver)
        val fullNameDriver : TextView = view.findViewById<TextView>(R.id.fullName)

        posDriver.text = position.toString()
        fullNameDriver.text = drivers[position].fullName
        return view
    }
}