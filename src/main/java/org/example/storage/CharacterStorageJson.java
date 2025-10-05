package org.example.storage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.RickAndMortyCharacter;
import org.example.model.Response;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CharacterStorageJson implements CharacterStorage {
    @Override
    public List<RickAndMortyCharacter> readFromAPI(String apiInicial) {
        List<RickAndMortyCharacter> characters = new ArrayList<>();
        try {
            URL api = new URL(apiInicial);
            System.out.println("Reading API: " + api);
            // Creo el maper
            ObjectMapper objectMapper = new ObjectMapper();
            // Repuesta de la consulta a la api dada
            Response response = objectMapper.readValue( api , Response.class);

            // Mientras haya siguiente pagina seguiente pagina añadir los vlaores
            while (response.getInfo().getNext() != null) {
                System.out.println("Leyendo api: " + api);
                response = objectMapper.readValue(api, Response.class);

                System.out.println("Añadiendo los resultados.");
                characters.addAll(response.getResults());

                // Cambio el valor de la api a la siguiente
                if (response.getInfo().getNext() != null) {
                    api = new URL(response.getInfo().getNext());
                }
            }
            System.out.println("Resultados añadidos correctamente");
            return characters;
        } catch (IOException e){
            System.out.println("Error en readFromFile-->:   " + e.getMessage());
        }
        return characters;

    }

}
