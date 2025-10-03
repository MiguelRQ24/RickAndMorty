package org.example.storage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Pokemon;
import org.example.model.Response;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PokemonStorageJson implements PokemonStorage {
    @Override
    public List<Pokemon> readFromAPI(String api) {
        List<Pokemon> characters = new ArrayList<>();
        try {

            System.out.println("Reading file " + api);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            Response response = objectMapper.readValue( new URL(api) , Response.class);

            while (response.getInfo().getNext() != null) {
                System.out.println("Añadiendo los resultados.");
                characters.addAll(response.getResults());
                System.out.println("Siguiente busqueda: " + response.getInfo().getNext());
                response = objectMapper.readValue( new URL(response.getInfo().getNext()) , Response.class);
            }
            System.out.println("Resultados añadidos correctamente");
            return characters;
        } catch (IOException e){
            System.out.println("Error en readFromFile-->:   " + e.getMessage());
        }
        return characters;

    }

}
