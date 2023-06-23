package com.luiscuadra.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luiscuadra.prueba.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater).apply {
            setContentView(root)

            val titulostr =intent.getStringExtra("TITULO")
            val descripcionstr =intent.getStringExtra("DESCRIPCION")
            val imagenstr =intent.getStringExtra("IMAGEN")

            titulo.text=titulostr
            descripcion.text=descripcionstr
            Picasso.get().load(imagenstr).into(imagen);
        }
    }

    fun cerrarPantalla(view: View){
        finish()
    }
}