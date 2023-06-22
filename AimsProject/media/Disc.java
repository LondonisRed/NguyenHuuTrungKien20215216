package media;

public class Disc extends Media{
    public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}

    private int length;
    private String director;

    public int getLength(){
        return length;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director) {
		this.director = director;
	}

    public void setLength(int length) {
		this.length = length;
	}
    
    @Override
    public void play(){
    }
}
