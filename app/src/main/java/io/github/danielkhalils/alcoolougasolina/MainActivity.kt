package io.github.danielkhalils.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun btCalcular(view: View){
            var precoAlcool = findViewById(R.id.edit_preco_alcool) as EditText
            val textoRecuperado = precoAlcool.text.toString()

            Log.i("Resultado", "texto recuperado: $textoRecuperado")
        }
    }
}