package com.devtides.recyclerviewproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_animal.view.*

class AnimalRVAdapter(var animals: List<Animal>): RecyclerView.Adapter<AnimalRVAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
        = AnimalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false))

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animals[position])
    }

    override fun getItemCount() = animals.size

    class AnimalViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val img = view.animalImage

        fun bind(animal: Animal) {
            img.setImageResource(animal.img)
        }
    }
}