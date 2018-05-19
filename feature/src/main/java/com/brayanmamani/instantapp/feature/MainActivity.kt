package com.brayanmamani.instantapp.feature

import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val START_LEVEL=1
    private var mLevel: Int = 0
    private var fabNext: FloatingActionButton? = null
    private var mInterstitialAd: InterstitialAd? = null
    private var app_title: TextView? = null
    private var app_contenido: TextView? = null
    private var ivFoto: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO 1.Ocultar NavBar
        //TODO 2.Creando Objetos
        //TODO 3.Iniciando acciones de botones
        // TODO 4.Iniciando switch
        // TODO 5. Creando una InterstitialAd y asignando la adUnitId (definido en values/strings.xml).

    }

    //TODO 6.Metodo de inicializacion

    //TODO 8.Metodo de mustra

    //TODO 7.metodo de Carga


    //TODO 9.Metodo de control

}
