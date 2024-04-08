package com.example.hamburgueseria.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.hamburgueseria.data.DataSource
import com.example.hamburgueseria.data.HamburgueseriaUIState
import com.example.hamburgueseria.data.Ingredientes
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HamburgueseriaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HamburgueseriaUIState())
    val uiState: StateFlow<HamburgueseriaUIState> = _uiState.asStateFlow()
    private val productos = DataSource.productos
    private var ingredientes = ArrayList<Ingredientes>()

    var aniadirProducto by mutableStateOf("")
        private set;

    fun setAniadirProducto(aniadirProductoPasado: String){
        aniadirProducto = aniadirProductoPasado
    }
}