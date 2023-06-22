package media;

public class Tracks  implements Playable{
	public void play(){
		System.out.println("Playing Track: " + this.getTitle());
	 	System.out.println("Track's length: " + this.getLengths());

	}
	public Tracks(){
	}
	public Tracks (int length, String title) {
		super();
		this.length = length;
		this.title = title;
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

	

	@Override
	public boolean equals (Object obj){
		Tracks o = (Tracks) obj;
		if(this.length == o.length && this.title == o.title){
			return true;
		}
		return false;   
	}
}
