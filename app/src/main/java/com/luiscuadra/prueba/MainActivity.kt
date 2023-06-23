package com.luiscuadra.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luiscuadra.prueba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            txtmenu.text="Mis Peliculas"
        }

    }

    fun cambiarPelicula(view:View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","Avatar 2")
            putExtra("IMAGEN","https://www.filmmusicsite.com/images/covers/large/96030.jpg")
            putExtra("DESCRIPCION","Jake Sully y Ney'tiri han formado una familia y hacen todo lo posible por permanecer juntos. Sin embargo, deben abandonar su hogar y explorar las regiones de Pandora cuando una antigua amenaza reaparece.\n" +
                    "Fecha de estreno: 16 de diciembre de 2022 (Estados Unidos)\n" +
                    "Director: James Cameron")
        }
        startActivity(intent)
    }

    fun cambiarPelicula2(view:View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","Jurassic World: Dominio")
            putExtra("IMAGEN","https://dx35vtwkllhj9.cloudfront.net/universalstudios/jurassic-world-dominion/images/regions/us/onesheet.jpg")
            putExtra("DESCRIPCION","La isla Nublar y su parque han sido destruidos, pero el problema no se terminó. Con los dinosaurios dispersos por todo el mundo, la convivencia entre el presente y el pasado alcanza un nuevo nivel de tensión.\n" +
                    "Fecha de estreno: 10 de junio de 2022 (Estados Unidos)\n" +
                    "Director: Colin Trevorrow")
        }
        startActivity(intent)
    }

    fun cambiarPelicula3(view:View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","Thor: Ragnarok")
            putExtra("IMAGEN","https://m.media-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_.jpg")
            putExtra("DESCRIPCION","Thor está preso en el otro extremo del universo. Necesita regresar a tiempo para evitar que la todopoderosa Hela destruya su mundo, pero para escapar de su confinamiento y evitar el apocalipsis tendrá que vencer antes al increíble Hulk en un torneo de gladiadores.")
        }
        startActivity(intent)
    }

    fun cambiarPelicula4(view:View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","Cars")
            putExtra("IMAGEN","https://es.web.img2.acsta.net/pictures/14/05/28/11/24/435900.jpg")
            putExtra("DESCRIPCION","De camino al prestigiado campeonato Copa Pistón, un automóvil de carreras que sólo se preocupa por ganar aprende sobre lo que realmente es importante en la vida de varios vehículos que viven en un pueblo a lo largo de la histórica Ruta 66.")
        }
        startActivity(intent)
    }
}