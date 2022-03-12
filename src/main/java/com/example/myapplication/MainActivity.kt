package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArrayMap
import android.widget.EditText
import android.widget.TextView
import model.JogodaForca
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var palavra: TextView
    private lateinit var dica: TextView

    private lateinit var banco_palavras: List<String>
    private lateinit var banco_dicas: List<String>




    override fun onCreate(savedInstanceState: Bundle?) {

        this.banco_palavras = arrayListOf<String>("Abelha","Urso","Professor")
        this.banco_dicas = arrayListOf<String>("Inseto","Animal Mamifero", "Profissão")

        val randomIndex = Random.nextInt(banco_palavras.size)

        val randomPalavra = banco_palavras[randomIndex]
        val randomDica = banco_dicas[randomIndex]
        var new_JogoDaForca = JogodaForca(randomPalavra,randomDica)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //campo1 = findViewById(R.id.nome)
        this.palavra = findViewById(R.id.palavra)
        this.dica = findViewById(R.id.dica)
        this.palavra.text = new_JogoDaForca.letrasDescobertas()
        this.dica.text = "Dica: " + new_JogoDaForca.dica
    }
}