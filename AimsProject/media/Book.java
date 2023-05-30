package media;

import java.util.*;
public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();
	public Book() {
	}
	
	
	public void addAuthors(String authorName){
		if(authors.contains(authorName) == true){
			System.out.println("Author already added.");
		}else{
			authors.add(authorName);
			System.out.println("Author added successfully.");
		}
	}
	
	public void removeAuthors(String authorName) {
		if(authors.contains(authorName) == true){
			authors.remove(authorName);
			System.out.println("Author remove successfully.");
		}
	}
}
