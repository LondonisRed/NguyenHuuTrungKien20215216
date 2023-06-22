package aims;
import media.*;
import java.util.*;
public class Store {
    static final int MAX_NUMBERS_INSTORE = 100000000;
    int availItem = 0;
    private ArrayList<Media> itemInStore = new ArrayList<Media>();

    public ArrayList<Media> getItemInStore() {
		return itemInStore;
	}
    
    public void addMedia(Media item){
        if(itemInStore.size() <= MAX_NUMBERS_INSTORE){
            itemInStore.add(item);
            System.out.println("DVD added successfully.");
            availItem++;
        }
        else {
            System.out.println(
                "The Store is full.");
        }
    }
    public void removeMedia(Media item){
        if (itemInStore.size() < MAX_NUMBERS_INSTORE && itemInStore.size() > 0) {
            itemInStore.remove(item);
            availItem--;
        }
        else if (availItem < 0) {
            System.out.println(
                "There is no disc to remove.");
        }
        else{
            System.out.println(
                "The store is  already full.");
        }
    }
}
