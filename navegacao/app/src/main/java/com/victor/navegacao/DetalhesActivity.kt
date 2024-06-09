package com.victor.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onStart() {
        super.onStart()
        Log.i("ciclo vida", "onStart DetalhesActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo vida", "onResume DetalhesActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo vida", "onPause DetalhesActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo vida", "onStop DetalhesActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo vida", "onDestroy DetalhesActivity")
    }
}