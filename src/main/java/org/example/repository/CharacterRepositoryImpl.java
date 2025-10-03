package org.example.repository;

import org.example.model.RickAndMortyCharacter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterRepositoryImpl implements CharacterRepository {
    private final Map<Integer, RickAndMortyCharacter> pokemons =  new HashMap<>();
    @Override
    public List<RickAndMortyCharacter> getAll() {
        return getPokemons().values().stream().toList();
    }

    @Override
    public RickAndMortyCharacter getById(Integer integer) {
        return null;
    }

    @Override
    public RickAndMortyCharacter save(RickAndMortyCharacter pokemon) {
        pokemons.putIfAbsent(pokemon.getId(), pokemon);
        return pokemon;
    }

    @Override
    public RickAndMortyCharacter update(Integer integer, RickAndMortyCharacter pokemon) {
        pokemons.replace(integer, pokemon);
        return pokemon;
    }

    @Override
    public RickAndMortyCharacter delete(Integer integer) {
        return pokemons.remove(integer);
    }

    private Map<Integer, RickAndMortyCharacter> getPokemons() {
        return pokemons;
    }
}
