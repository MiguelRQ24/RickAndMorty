package org.example.service;

import org.example.model.RickAndMortyCharacter;
import org.example.repository.CharacterRepository;
import org.example.storage.CharacterStorage;

import java.util.List;

public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository repository;
    private final CharacterStorage storage;

    public CharacterServiceImpl(CharacterRepository characterRepository, CharacterStorage characterStorage) {
        this.repository = characterRepository;
        this.storage = characterStorage;
    }

    @Override
    public List<RickAndMortyCharacter> readFromAPI(String api) {
        return storage.readFromAPI(api);
    }
    @Override
    public void importFromApi(String api) {
        storage.readFromAPI(api).forEach(repository::save);
    }
    @Override
    public List<RickAndMortyCharacter> getAll() {
        return repository.getAll();
    }
    @Override
    public RickAndMortyCharacter getById(int id) {
        return repository.getById(id);
    }
    @Override
    public RickAndMortyCharacter save(RickAndMortyCharacter Character) {
        return repository.save(Character);
    }
    @Override
    public RickAndMortyCharacter update(int id, RickAndMortyCharacter Character) {
        return repository.update(id, Character);
    }
    @Override
    public RickAndMortyCharacter delete(int id) {
        return repository.delete(id);
    }

    public List<RickAndMortyCharacter> searchByName(String name) {
        return repository.getAll().stream()
                .filter(character -> character.getName().contains(name))
                .toList();
    }
}
