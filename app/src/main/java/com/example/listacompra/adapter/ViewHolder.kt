package com.example.listacompra.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.listacompra.database.Listacompra
import com.example.listacompra.database.MiListaApp
import com.example.listacompra.databinding.ElementoBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ListaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ElementoBinding.bind(view)

    fun bind(elemento:) {
        binding.elementolista.text= elemento.nombre
        binding.pulsado.isChecked= elemento.activo


        }

}