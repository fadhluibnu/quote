package com.example.quote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil_main)

        val profilList = listOf<Profil>(
            Profil(
                "Quote Pertama Dari User Pertama"
            ),
            Profil(
                "Quote Kedua Dari User Kedua"
            ),
            Profil(
                "Quote Ketiga Dari User Ketiga"
            ),
            Profil(
                "Quote Keempat Dari User Keempat"
            ),
            Profil(
                "Quote Kelima Dari User Kelima"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            ),
            Profil(
                "Quote Keenam Dari User Keenam"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProfilAdapter(this, profilList){

        }

    }
}