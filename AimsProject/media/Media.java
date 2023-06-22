package media;

import java.util.*;

public abstract class Media implements Playable{
	public static final Comparator<Media> comparebyTitleCost = new MediaComparatorByTitleCost();
	public static final Comparator<Media> comparebyCostTitle = new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(int id2, String title2, String category2, float cost2, String director, int length) {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public void printItem() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Category: " + this.getCategory());
		System.out.println("Id: " + this.getId());
		System.out.println("Cost: " + this.getCost());
	}

	@Override
	public boolean equals(Object obj){
		Media item = (Media) obj;
		return this.getTitle() == item.getTitle();
	}
}
