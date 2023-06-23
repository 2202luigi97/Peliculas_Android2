package com.luiscuadra.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luiscuadra.prueba.databinding.ActivityDetail4Binding

class DetailActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityDetail4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrarPantalla(view: View){
        finish()
    }
}