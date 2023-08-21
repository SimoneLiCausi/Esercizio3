package com.example.testesame1.ui.character

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testesame1.R
import com.example.testesame1.ui.Races

// La classe VHRaces contiene tutit i riferimenti alla View (che sarebbe il file xml)


class RacesAdapter(val racesList: List<Races>) : RecyclerView.Adapter<RacesAdapter.VHRaces>() {

    // Qui creo le val a cui farò riferimento successivamente nell'onBindViewHolder.
    class VHRaces(view: View) : RecyclerView.ViewHolder(view){
        val name = view.findViewById<TextView>(R.id.textView2)
        val manual = view.findViewById<TextView>(R.id.textView)
    }


    // Con questa funzione vai ad istanziare il VH (ViewHolder)
    // Il LayoutInflater serve a caricare l'xml in memoria
    // TRADUZIONE = Carichiamo il layout inflater a partire dal context dato, una volta ottenuto gli chiediamo di caricare
    // (inflate) il layout che ci serve (R.layout.recycler_view_layout), gli indichiamo il parent e di utilizzarlo solo per le misure
    // tramite il paramentro false.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHRaces {
        return VHRaces(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_layout, parent, false)
        )

    }
// Chiediamo di ritornarci la dimensione della nostra lista. (quantità di elementi da caricare)
    override fun getItemCount(): Int {
        return racesList.size
    }


    //Assegniamo i vari testi, colori, dimensioni, imageview.
    override fun onBindViewHolder(holder: VHRaces, position: Int) {

        val model = racesList[position]
        holder.name.text = model.name
        holder.manual.text = model.manual

    }


}