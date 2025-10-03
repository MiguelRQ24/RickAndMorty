package org.example.model;

public class Info{
	private String next;
	private int pages;
	private Object prev;
	private int count;

	public String getNext(){
		return next;
	}

	public int getPages(){
		return pages;
	}

	public Object getPrev(){
		return prev;
	}

	public int getCount(){
		return count;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"next = '" + next + '\'' + 
			",pages = '" + pages + '\'' + 
			",prev = '" + prev + '\'' + 
			",count = '" + count + '\'' + 
			"}";
		}
}
