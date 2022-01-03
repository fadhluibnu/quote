package com.example.quote

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfilAdapter(private val context: Context, private val profil: List<Profil>, val listener: (Profil)->Unit)
    : RecyclerView.Adapter<ProfilAdapter.ProfilViewHolder>(){
    class ProfilViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val quote = view.findViewById<TextView>(R.id.text_quote)

        fun bindView(profil: Profil, listener: (Profil) -> Unit){
            quote.text = profil.quote

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilViewHolder {
        return ProfilViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_profil, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProfilViewHolder, position: Int) {
        holder.bindView(profil[position], listener)
    }

    override fun getItemCount(): Int = profil.size
}