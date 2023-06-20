package media;

import java.util.*;

public abstract class Media {

	public static final Comparator<Media> comparebyTitleCost = new MediaComparatorByTitleCost();
	public static final Comparator<Media> comparebyCostTitle = new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;
	public Media() {
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

	public boolean equals(Object o){
		Media item = (Media) o;
		return this.getTitle() == item.getTitle();
	}

}
