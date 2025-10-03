package org.example;

import org.example.storage.CharacterStorage;
import org.example.storage.CharacterStorageJson;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        CharacterStorage characterStorage = new CharacterStorageJson();
        characterStorage.readFromAPI("https://rickandmortyapi.com/api/character");
        System.out.println();
    }
}
