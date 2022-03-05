package com.example.appno2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Longitud : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_longitud)

    var texto = findViewById<EditText>(R.id.texto)
    var btnLongitud = findViewById<Button>(R.id.btnLongitud)

        btnLongitud.setOnClickListener {

            val respuesta = texto.length()
            Toast.makeText(this, "La longitud es :  $respuesta", Toast.LENGTH_LONG).show()


        }



    }
}