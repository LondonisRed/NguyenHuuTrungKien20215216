package media;

import java.util.*;
public class Book extends Media{
	
	
	private List<String> authors = new ArrayList<String>();

	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
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

	@Override
	public String toString() {
		return this.getTitle() + " - " + this.getCategory() + " - " + ": " + this.getCost() + "$\n";
	}

	@Override
	public void play(){
		System.out.println("Cannot Play Item.");
	}	
}
