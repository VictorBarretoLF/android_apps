package com.victor.navegacao

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.widget.Button
import androidx.activity.ComponentActivity
import java.util.UUID

class MainActivity : ComponentActivity() {
    lateinit var buttonNavegacao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNavegacao = findViewById(R.id.button_navegacao)

        buttonNavegacao.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            // Passar parametros para nova tela
            intent.putExtra("filme", "Filme Teste")
            intent.putExtra("classificacao", 5)
            intent.putExtra("avaliacoes", 9.2)

            // iniciar nova tela
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo vida", "onDestroy")
    }
}
