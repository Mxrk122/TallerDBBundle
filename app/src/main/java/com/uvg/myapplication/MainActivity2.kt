package com.uvg.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.Exception

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        var Resultado:Int = 0
        var texto:String = ""

        if(bundle != null){
            texto = bundle.getString("valor").toString()

            val valueTwo = bundle.getString("valor2")
            Toast.makeText(this, valueTwo, Toast.LENGTH_SHORT).show()

        }

        fun operate(){
            var numberOne:Int = 0
            var numberTwo:Int = 0

            val strOne:String = entryOne.text.toString()
            val strTwo:String = entryTwo.text.toString()

            if(strOne==null){
                numberOne = 0
            } else{
                numberOne = strOne.toInt()
            }

            if(strTwo==null){
                numberTwo = 0
            } else{
                numberTwo = strTwo.toInt()
            }


            if(texto == "suma"){
                Resultado = numberOne + numberTwo
            } else if(texto == "resta"){
                Resultado = numberOne - numberTwo
            } else if(texto == "mult"){
                Resultado = numberOne * numberTwo
            } else{
                Resultado = numberOne/numberTwo
            }
        }



        btnBack.setOnClickListener(){
            try {
                operate()
            } catch (e: Exception){
                Resultado = 0
            }
            val intent: Intent = Intent()
            intent.putExtra("resultado1", Resultado.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }
}

