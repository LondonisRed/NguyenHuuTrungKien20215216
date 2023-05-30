package media;

public class DigitalVideoDisc extends Media implements Playable{
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.length);
	}
	
	static int nbDigitalVideoDiscs = 0;
	String director;
	int length;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.setTitle(getTitle());
		this.setCategory(category);
		this.director = director;
		this.length = length;
		this.setCost(cost);
		nbDigitalVideoDiscs = nbDigitalVideoDiscs + 1;
		this.setId(getId());
	}
	public DigitalVideoDisc(String title) {
		this.setTitle(getTitle());
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this.setTitle(getTitle());
		this.setCategory(category);
		this.setCost(cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.setTitle(getTitle());
		this.setCategory(category);
		this.director = director;
		this.setCost(cost);
	}
}
