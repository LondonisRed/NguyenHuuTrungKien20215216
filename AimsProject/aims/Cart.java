package aims;
import media.*;

import java.util.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemordered = new ArrayList<Media>();
		public void sortbycosttile(){
			Collections.sort(itemordered, new MediaComparatorByCostTitle());
		}
		public void sortbytitlecost(){
			Collections.sort(itemordered, new MediaComparatorByTitleCost());

		}

		public ArrayList<Media> getItemsOrdered() {
		return itemordered;
		}

		public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
			this.itemordered = itemsOrdered;
		}
		public void addMedia(Media item){
			if (itemordered.size() < MAX_NUMBERS_ORDERED) {
				itemordered.add(item);
				System.out.println("Item added successfully.");
			}
			else {

				System.out.println(
					"No Space left to Add More.");
			}
		}
		public void removeMedia(Media item){
			if ( itemordered.size()< 20 && itemordered.size() > 0) {
				itemordered.remove(item);
			}
			else if (itemordered.size() < 0) {

				System.out.println(
					"There is no disc to remove.");
			}
			else{
				System.out.println(
					"Too many discs. Please remove immediately.");
			}
		}
		public float totalCost() {
			float sumcost = 0f; 
			for(int i = 0; i < itemordered.size(); i++) {
				sumcost = sumcost + itemordered.get(i).getCost();
			}
			return sumcost;
		}

		//public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist){
			//for(int i = itemordered.size(); i < dvdlist.length; i++){
				//itemordered.get(i) = dvdlist.get(i);
				//itemordered.size()++;
				//System.out.println("DVD added successfully.");
			//}
		//}

		//public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
			//if(itemordered.size() == 0){
				//itemordered[0] = dvd1;
				//itemordered[1] = dvd2;
				//itemordered.size()= itemordered.size()+2;
				//System.out.println("All DVDs Added successffuly.");

			//}else{
				//itemordered[itemordered.size()+1] = dvd1;
				//itemordered[itemordered.size()+2] = dvd2;
				//itemordered.size()=itemordered.size()+2; 
				//System.out.println("All DVDs Added successffuly.");
			//}
		//}

		//public void printCart(){
		//	if(itemordered.size() > 0){
			//	System.out.println("Your Cart: ");
			//	for(int i = 0; i < itemordered.size(); i++){
				//	System.out.println((i+1) + ". Title: " + itemordered.get(i).getTitle() + " - Category : " 
						//+ itemordered.get(i).getCategory() + " - Cost: " + itemordered.get(i).getCost());
				//}
			//}
		//}

		public void searchByTitle(String title){
			int stt = 1;
			System.out.println("Search found:");
			for(int i = 0; i < itemordered.size(); i++){
				if(itemordered.get(i).getTitle() == title){
					System.out.println(stt + ". Title: " + itemordered.get(i).getTitle() + " - Category : " 
					+ itemordered.get(i).getCategory() + " - Cost: " + itemordered.get(i).getCost());
			}
				if(i == itemordered.size() && itemordered.get(i).getTitle() != title){
				System.out.println("DVD not found.");
			}
				stt++;
			}
		}

		public void searchByID(int id){
			int stt = 1;
			System.out.println("Search found:");
			for(int i = 0; i < itemordered.size(); i++){
				if(itemordered.get(i).getId() == id){
					System.out.println(stt + ". Title: " + itemordered.get(i).getTitle() + " - Category : " 
						+ itemordered.get(i).getCategory() + " - Cost: " + itemordered.get(i).getCost());
				}
				if(i == itemordered.size() && itemordered.get(i).getId() != id){
					System.out.println("DVD not found.");
				}
				stt++;
			}
		}
		public void printCartUpdate(){
			for(Media m: itemordered){
				System.out.println(m.toString());
			}
		}
}