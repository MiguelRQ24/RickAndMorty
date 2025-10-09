package org.example;

import org.example.model.RickAndMortyCharacter;
import org.example.repository.CharacterRepositoryImpl;
import org.example.service.CharacterService;
import org.example.service.CharacterServiceImpl;
import org.example.storage.CharacterStorage;
import org.example.storage.CharacterStorageJson;

import java.util.stream.Collectors;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        CharacterService service = new CharacterServiceImpl(new CharacterRepositoryImpl(), new CharacterStorageJson());
        service.importFromApi("https://rickandmortyapi.com/api/character");
        System.out.println(service.getAll().size());
        //System.out.println(service.getAll());

        service.searchByName("Wasp Rick").forEach(System.out::println);

        service.getAll().stream().collect(Collectors.groupingBy(RickAndMortyCharacter::getGender))
               .forEach((a, b ) ->
                   System.out.println("De genero "+ a + " hay " + b.size())
               );
        service.getAll().stream().collect(Collectors.groupingBy(character -> character.getOrigin().getName()))
                .forEach((a, b ) ->
                        System.out.println("De procedencia "+ a + " hay " + b.size())
                );
    }
}
