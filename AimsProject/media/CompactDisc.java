package media;

import java.util.ArrayList;
public class CompactDisc extends Disc{
    

    private String artist;
    private ArrayList<Tracks> tracks = new ArrayList<>();
    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist,
			ArrayList<Tracks> tracks) {
		super(id, title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTracks(Tracks track) {
        if (tracks.contains(track) == true) {
            System.out.println("Track already added.");
        } else {
            tracks.add(track);
            System.out.println("Author added successfully.");
        }
    }

    public void removeTracks(Tracks track) {
        if (tracks.contains(track) == true) {
            tracks.remove(track);
            System.out.println("Track removed successfully added.");
        }
    }

    public int getLength() {
        int sumlength = 0;
        for (int i = 0; i < tracks.size(); i++) {
            sumlength += tracks.get(i).getLengths();
        }
        return sumlength;
    }

    public void PlayTracks() {
        for (int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }

    @Override
    public void play() {
        for(int i = 0; i < tracks.size(); i++){
            System.out.println("Playing DVD: " + tracks.get(i).getTitle());
		    System.out.println("DVD length: " + tracks.get(i).getLengths());
        }
    }

    @Override
	public String toString() {
		return this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength()
				+ ": " + this.getCost() + "$\n";
	}
}
