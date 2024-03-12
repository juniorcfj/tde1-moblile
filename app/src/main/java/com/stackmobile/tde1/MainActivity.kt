package com.stackmobile.tde1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stackmobile.tde1.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            val euros: Double = binding.editEuro.text.toString().toDouble()
            //val dolar  = String.format("%.2f",euros * 0.8).toDouble()
             val dolar = (euros*0.8*100).roundToInt().toDouble()/100

            binding.textDolar.text = "${dolar}$"
        }
    }
}