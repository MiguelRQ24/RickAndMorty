package org.example.model;

import java.util.List;

public class Response{
	private List<RickAndMortyCharacter> results;
    private Info info;

	public List<RickAndMortyCharacter> getResults(){
		return results;
	}

	public Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"results = '" + results + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}

    public void setResults(List<RickAndMortyCharacter> results) {
        this.results = results;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}