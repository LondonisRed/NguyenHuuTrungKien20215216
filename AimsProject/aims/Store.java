package aims;
import media.*;
import java.util.*;
public class Store {
    static final int MAX_NUMBERS_INSTORE = 100000000;
    int availItem = 0;
    private ArrayList<Media> itemInStore = new ArrayList<Media>();
    
    public void addItems(Media item){
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
    public void removeItems(Media item){
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

    public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
        System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}
