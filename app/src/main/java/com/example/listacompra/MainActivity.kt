package com.example.listacompra

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listacompra.adapter.ListaAdapter
import com.example.listacompra.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var elementos: MutableList<  >
    lateinit var adapter : ListaAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        elementos = ArrayList()

        getElementos()

    }

    //Al pulsar sobre el cuadro de texto, se limpia
    fun clearFocus(){
        binding.texto.setText("")
    }

    //Oculta el teclado cuando terminamos de escribir en el cuadro de texto
    fun Context.hideKeyboard() {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(binding.texto.windowToken, 0)
    }

    //Obtenemos todas las filas de la tabla y se las pasamos al adapter del recyclerView, para que las muestre
    fun getElementos() {
        CoroutineScope(Dispatchers.IO).launch  {

            runOnUiThread  {
                adapter = ListaAdapter(elementos)
                recyclerView= binding.recycler
                recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                recyclerView.adapter = adapter

            }
        }
    }


}