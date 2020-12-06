package com.example.pokedex2020.data

import com.example.pokedex2020.R
import com.example.pokedex2020.model.Pokemon

class Datasource {

    fun loadPokemons(): List<Pokemon>{
        return listOf<Pokemon>(
                Pokemon(R.string.pokemon1),
                Pokemon(R.string.pokemon2),
                Pokemon(R.string.pokemon3),
                Pokemon(R.string.pokemon4),
                Pokemon(R.string.pokemon5),
                Pokemon(R.string.pokemon6),
                Pokemon(R.string.pokemon7),
                Pokemon(R.string.pokemon8),
                Pokemon(R.string.pokemon9),
                Pokemon(R.string.pokemon10)
        )
    }
}