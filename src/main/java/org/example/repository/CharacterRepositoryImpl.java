package org.example.repository;

import org.example.model.RickAndMortyCharacter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterRepositoryImpl implements CharacterRepository {
    private final Map<Integer, RickAndMortyCharacter> characters =  new HashMap<>();
    @Override
    public List<RickAndMortyCharacter> getAll() {
        return getCharacters().values().stream().toList();
    }

    @Override
    public RickAndMortyCharacter getById(Integer id) {
        return characters.get(id);
    }

    @Override
    public RickAndMortyCharacter save(RickAndMortyCharacter pokemon) {
        characters.putIfAbsent(pokemon.getId(), pokemon);
        return pokemon;
    }

    @Override
    public RickAndMortyCharacter update(Integer integer, RickAndMortyCharacter pokemon) {
        characters.replace(integer, pokemon);
        return pokemon;
    }

    @Override
    public RickAndMortyCharacter delete(Integer integer) {
        return characters.remove(integer);
    }

    private Map<Integer, RickAndMortyCharacter> getCharacters() {
        return characters;
    }
}
