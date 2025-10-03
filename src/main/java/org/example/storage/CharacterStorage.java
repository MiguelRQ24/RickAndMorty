package org.example.storage;

import org.example.model.RickAndMortyCharacter;

import java.util.List;

public interface CharacterStorage {
    List<RickAndMortyCharacter> readFromAPI(String api);
}
