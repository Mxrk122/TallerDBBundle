package com.uvg.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen.setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "suma")
            intent.putExtra("valor2", "Ingresa dos numeros")
            //startActivity(intent)
            startActivityForResult(intent, 1)
        }

        btnMinus.setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "resta")
            intent.putExtra("valor2", "Ingresa dos numeros")
            //startActivity(intent)
            startActivityForResult(intent, 1)
        }

        btnMult.setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "mult")
            intent.putExtra("valor2", "Ingresa dos numeros")
            //startActivity(intent)
            startActivityForResult(intent, 1)
        }

        btnDiv.setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "divi")
            intent.putExtra("valor2", "Ingresa dos numeros")
            //startActivity(intent)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK){
            if(requestCode == 1){
                val bundle = data?.extras

                if(bundle!=null){
                    val resultado = bundle.getString("resultado1")
                    Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}