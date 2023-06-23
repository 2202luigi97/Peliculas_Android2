package com.luiscuadra.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luiscuadra.prueba.databinding.ActivityDetail3Binding

class DetailActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityDetail3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrarPantalla(view: View){
        finish()
    }
}