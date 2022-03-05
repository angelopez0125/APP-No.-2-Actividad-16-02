package com.example.appno2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Primer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer)

        var texto:String = findViewById<EditText>(R.id.texto).toString()
        var btnPrimer = findViewById<Button>(R.id.btnPrimer)

        btnPrimer.setOnClickListener {

           val inicial = texto.substring(0,1)
            val final  = texto.substring(texto.length-1,texto.length)


            Toast.makeText(this, "El primer caracter es :  $inicial", Toast.LENGTH_LONG).show()

            Toast.makeText(this, "El último caracter es :  $final", Toast.LENGTH_LONG).show()
        }




    }
}