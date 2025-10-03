package org.example.model;

import java.util.List;

public class Response{
	private List<Pokemon> results;
    private Info info;

	public List<Pokemon> getResults(){
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

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}