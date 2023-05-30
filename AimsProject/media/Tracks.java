package media;

import java.util.Objects;

public class Tracks  implements Playable{
	public void play(){
		System.out.println("Playing Track: " + this.getTitle());
	 	System.out.println("Track's length: " + this.getLengths());

	}
   
    private String title;
    private int length;

    public int getLengths() {
		return length;
	}
	public void setLengths(int length) {
		this.length = length;
	}

    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public boolean equals (Object o1, Objects o2){
		if(o1 == o2){
			return true;
		}
		else{
			return false;
		}	
	}
}
