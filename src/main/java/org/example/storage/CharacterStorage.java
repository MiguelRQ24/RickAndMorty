package org.example.storage;

import org.example.model.CharacterRM;
import org.example.model.Response;

import java.io.File;
import java.net.URL;
import java.util.List;

public interface CharacterStorage {
    List<CharacterRM> readFromAPI(String api);
}
