package com.example.appno2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCreditos = findViewById<Button>(R.id.btnCreditos)
        val btnLongitud = findViewById<Button>(R.id.btnLongitud)
        val btnPrimer = findViewById<Button>(R.id.btnPrimer)
        val btnPar = findViewById<Button>(R.id.btnPar)
        val btnVocales = findViewById<Button>(R.id.btnVocales)
        val btnRepetidas = findViewById<Button>(R.id.btnRepetidas)


        btnCreditos.setOnClickListener{

            Toast.makeText(this, "Aplicación elaborada por Angel López - 201705336", Toast.LENGTH_LONG).show()

        }

        btnLongitud.setOnClickListener{
            val ActivityLongitud = Intent(this, Longitud::class.java)
            startActivity(ActivityLongitud)

        }

        btnPrimer.setOnClickListener{
            val ActivityPrimer = Intent(this, Primer::class.java)
            startActivity(ActivityPrimer)

        }

        btnPar.setOnClickListener{
            val ActivityPar = Intent(this, Par::class.java)
            startActivity(ActivityPar)

        }

        btnVocales.setOnClickListener{
            val ActivityVocales = Intent(this, Vocales::class.java)
            startActivity(ActivityVocales)

        }


        btnRepetidas.setOnClickListener{
        val ActivityRepetidas = Intent(this, Repetidas::class.java)
        startActivity(ActivityRepetidas)

    }
















    }
}