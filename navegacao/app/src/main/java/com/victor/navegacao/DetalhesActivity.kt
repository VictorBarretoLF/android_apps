package com.victor.navegacao

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {
    lateinit var buttonVoltar: Button
    lateinit var textFilme: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonVoltar = findViewById(R.id.button_voltar)
        textFilme = findViewById(R.id.textFilme)

        val bundle = intent.extras // todos os parametros passados
        if(bundle != null) {
//            val filme = bundle.getString("filme")
//            val classificacao = bundle.getInt("classificacao")
//            val avaliacoes = bundle.getDouble("avaliacoes")
//            val resultado = "filme: $filme - class. $classificacao aval. $avaliacoes"

//            val filme =
//                if(Build.VERSION.SDK_INT >= 33) bundle.getSerializable("filme", Filme::class.java)
//                else bundle.getSerializable("filme") as Filme
            val filme =
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) bundle.getParcelable("filme", Filme::class.java)
                else bundle.getParcelable("filme")

            textFilme.text = "${filme?.nome} - ${filme?.distribuidor}"
        }

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