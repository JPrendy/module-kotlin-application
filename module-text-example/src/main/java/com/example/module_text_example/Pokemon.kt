package com.example.module_text_example

class Pokemon {
    var name = ""
    var region = ""

    constructor(pokemonName: String, pokemonRegion: String){
        name = pokemonName
        region = pokemonRegion
    }

    fun description(): String {
        return "The Pokémon $name is from the $region region."
    }
}