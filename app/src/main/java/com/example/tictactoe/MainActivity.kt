package com.example.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var haGanado = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        escucharTriqui(binding)

    }

    fun escucharTriqui(binding: ActivityMainBinding){
        var listaVictoria: List<Int>?
        var turno: Boolean = true
        val casillas = charArrayOf('n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n',)
        var contador = 0;
        binding.button0.setOnClickListener {
            if (turno && casillas[0] == 'n' && contador < 9) {
                binding.button0.text = "X"
                turno = false
                casillas[0] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }

            } else if (casillas[0] == 'n' && contador < 9) {
                binding.button0.text = "O"
                turno = true
                casillas[0] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button1.setOnClickListener {
            if (turno && casillas[1] == 'n' && contador < 9) {
                binding.button1.text = "X"
                turno = false
                casillas[1] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[1] == 'n' && contador < 9) {
                binding.button1.text = "O"
                turno = true
                casillas[1] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button2.setOnClickListener {
            if (turno && casillas[2] == 'n' && contador < 9) {
                binding.button2.text = "X"
                turno = false
                casillas[2] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[2] == 'n' && contador < 9) {
                binding.button2.text = "O"
                turno = true
                casillas[2] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button3.setOnClickListener {
            if (turno && casillas[3] == 'n' && contador < 9) {
                binding.button3.text = "X"
                turno = false
                casillas[3] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[3] == 'n' && contador < 9) {
                binding.button3.text = "O"
                turno = true
                casillas[3] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button4.setOnClickListener {
            if (turno && casillas[4] == 'n' && contador < 9) {
                binding.button4.text = "X"
                turno = false
                casillas[4] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[4] == 'n' && contador < 9) {
                binding.button4.text = "O"
                turno = true
                casillas[4] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button5.setOnClickListener {
            if (turno && casillas[5] == 'n' && contador < 9) {
                binding.button5.text = "X"
                turno = false
                casillas[5] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[5] == 'n' && contador < 9) {
                binding.button5.text = "O"
                turno = true
                casillas[5] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button6.setOnClickListener {
            if (turno && casillas[6] == 'n' && contador < 9) {
                binding.button6.text = "X"
                turno = false
                casillas[6] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[6] == 'n' && contador < 9) {
                binding.button6.text = "O"
                turno = true
                casillas[6] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button7.setOnClickListener {
            if (turno && casillas[7] == 'n' && contador < 9) {
                binding.button7.text = "X"
                turno = false
                casillas[7] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[7] == 'n' && contador < 9) {
                binding.button7.text = "O"
                turno = true
                casillas[7] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button8.setOnClickListener {
            if (turno && casillas[8] == 'n' && contador < 9) {
                binding.button8.text = "X"
                turno = false
                casillas[8] = 'X';
                contador++
                listaVictoria = revisarVictoria(contador, 'X', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            } else if (casillas[8] == 'n' && contador < 9) {
                binding.button8.text = "O"
                turno = true
                casillas[8] = 'O';
                contador++
                listaVictoria = revisarVictoria(contador, 'O', casillas)
                if(listaVictoria != null ) {
                    contador = 9
                    mostrarVictoria(binding, listaVictoria)
                }
            }
        }
        binding.button10.setOnClickListener {
            val botones = listOf(
                binding.button0, binding.button1, binding.button2,
                binding.button3, binding.button4, binding.button5,
                binding.button6, binding.button7, binding.button8
            )
            for (boton in botones) {
                boton.backgroundTintList = binding.button10.backgroundTintList // El boton 10 mantiene su estilo por defecto
                boton.text = ""
            }
            for (i in casillas.indices) {
                casillas[i] = 'n'
            }
            contador = 0
            turno = true
        }
    }

    fun revisarVictoria(contador: Int, caracter: Char, casillas: CharArray): List<Int>? {
        // filas

        for (i in 0..2) {
            if (casillas[i * 3] == caracter && casillas[i * 3 + 1] == caracter && casillas[i * 3 + 2] == caracter) {
                Toast.makeText(this, "Victoria de $caracter", Toast.LENGTH_SHORT).show()
                return listOf(i * 3, i * 3 + 1, i * 3 + 2)
            }
        }
        // columnas
        for (i in 0..2) {
            if (casillas[i] == caracter && casillas[i + 3] == caracter && casillas[i + 6] == caracter) {
                Toast.makeText(this, "Victoria de $caracter", Toast.LENGTH_SHORT).show()
                return listOf(i, i + 3, i + 6)
            }
        }
        // diagonales
        if (casillas[0] == caracter && casillas[4] == caracter && casillas[8] == caracter) {
            Toast.makeText(this, "Victoria de $caracter", Toast.LENGTH_SHORT).show()
            return listOf(0, 4, 8)
        }

        if (casillas[2] == caracter && casillas[4] == caracter && casillas[6] == caracter) {
            Toast.makeText(this, "Victoria de $caracter", Toast.LENGTH_SHORT).show()
            return listOf(2, 4, 6)
        }
        if (contador > 8) {
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show()
            return listOf(0,0,0)
        }
        return null
    }

    fun mostrarVictoria(binding : ActivityMainBinding, listaVictoria : List<Int>?) {

        val botones = listOf(
            binding.button0, binding.button1, binding.button2,
            binding.button3, binding.button4, binding.button5,
            binding.button6, binding.button7, binding.button8
        )

        if (listaVictoria != null) {
            for (indice in listaVictoria) {
                botones[indice].backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
            }
        }
    }

}
