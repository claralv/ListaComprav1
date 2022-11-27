package com.example.listacompra.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listacompra.R
import com.example.listacompra.database.Listacompra

class ListaAdapter(val elementos: List<>) : RecyclerView.Adapter<ListaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ListaViewHolder(layoutInflater.inflate(R.layout.elemento, parent, false))    }

    override fun onBindViewHolder(holder: ListaViewHolder, position: Int) {
        val item = elementos[position]

        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return elementos.size
    }


}