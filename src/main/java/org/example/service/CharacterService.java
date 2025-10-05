package org.example.service;

import org.example.model.RickAndMortyCharacter;

import java.util.List;

public interface CharacterService {
    
    List<RickAndMortyCharacter> readFromAPI(String api);

    void importFromApi(String api);

    List<RickAndMortyCharacter> getAll();

    RickAndMortyCharacter getById(int id);

    RickAndMortyCharacter save(RickAndMortyCharacter character);

    RickAndMortyCharacter update(int id, RickAndMortyCharacter character);

    RickAndMortyCharacter delete(int id);
}
