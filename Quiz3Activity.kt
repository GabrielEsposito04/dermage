package com.example.dermageibmec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity


class Quiz3Activity : AppCompatActivity() {
    fun main(): Unit {
        lateinit var marcados:MutableList<Int>

        val botao1: RadioButton = findViewById(R.id.radioButton)
        val botao2: RadioButton = findViewById(R.id.radioButton2)
        val botao3: RadioButton = findViewById(R.id.radioButton3)
        val botao4: RadioButton = findViewById(R.id.radioButton4)
        val botao5: RadioButton = findViewById(R.id.radioButton5)
        val botao6: RadioButton = findViewById(R.id.radioButton6)
        val botao7: RadioButton = findViewById(R.id.radioButton7)
        val botao8: RadioButton = findViewById(R.id.radioButton8)



        if(botao1.isChecked())
        {
            marcados.add(1)
        }
        if (botao2.isChecked()){
            marcados.add(2)
        }
        if(botao3.isChecked()){
            marcados.add(3)
        }
        if(botao4.isChecked()){
            marcados.add(4)
        }
        if(botao5.isChecked()){
            marcados.add(5)
        }
        if(botao6.isChecked()){
            marcados.add(6)
        }
        if(botao7.isChecked()){
            marcados.add(7)
        }
        if(botao8.isChecked()){
            marcados.add(8)
        }

        if(!botao1.isChecked())
        {
            marcados.remove(1)
        }
        if (!botao2.isChecked()){
            marcados.remove(2)
        }
        if(!botao3.isChecked()){
            marcados.remove(3)
        }
        if(!botao4.isChecked()){
            marcados.remove(4)
        }
        if(!botao5.isChecked()){
            marcados.remove(5)
        }
        if(!botao6.isChecked()){
            marcados.remove(6)
        }
        if(!botao7.isChecked()){
            marcados.remove(7)
        }
        if(!botao8.isChecked()){
            marcados.remove(8)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_3)

        val voltar: Button = findViewById(R.id.botaoVoltar)
        val avancar: Button = findViewById(R.id.botaoAvancar)
        voltar.setOnClickListener{
            val intent = Intent(this@Quiz3Activity, Quiz2Activity::class.java)
            startActivity(intent)
        }
        avancar.setOnClickListener{
            val intent = Intent(this@Quiz3Activity, Quiz4Activity::class.java)
            startActivity(intent)
        }

    }
}