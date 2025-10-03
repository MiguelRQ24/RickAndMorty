package org.example.model;

import java.util.List;

public class Response{
	private List<CharacterRM> results;
    private Info info;

	public List<CharacterRM> getResults(){
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

    public void setResults(List<CharacterRM> results) {
        this.results = results;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}