package org.example;

import org.example.storage.PokemonStorage;
import org.example.storage.PokemonStorageJson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        PokemonStorage characterStorage = new PokemonStorageJson();
        characterStorage.readFromAPI("https://rickandmortyapi.com/api/character");
        System.out.println();
    }
}
