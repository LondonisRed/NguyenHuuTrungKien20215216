package testing;

import aims.Store;
import aims.Srceen.StoreScreen;
import media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String [] args){
         Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(0,"The Lion King",
		"Animation", 19.95f, "Roger Allers", 87);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(1,"Star Wars",
		"Science Fiction", 87f, "George Lucas", 24);
		store.addMedia(dvd2);
		//DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		//"Animation", 18.99f);
		//cart.addMedia(dvd3);*/
		StoreScreen storeScreen = new StoreScreen(store);
    }
}
