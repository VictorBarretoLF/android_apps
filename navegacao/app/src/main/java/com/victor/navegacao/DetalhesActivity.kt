package com.victor.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetalhesActivity : AppCompatActivity() {
    lateinit var buttonVoltar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonVoltar = findViewById(R.id.button_voltar)
        buttonVoltar.setOnClickListener {
            finish()
        }
    }
}