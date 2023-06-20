package media;

import java.util.ArrayList;

public class CompactDisc {

    private String artist;
    private ArrayList<Tracks> tracks = new ArrayList<Tracks>();

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
}
