package org.example.storage;

import org.example.model.Pokemon;

import java.util.List;

public interface PokemonStorage {
    List<Pokemon> readFromAPI(String api);
}
