package AimsProject.aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemordered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	static int qtyOrdered = 0;
		public void addDigitalVideoDisc(DigitalVideoDisc disc){
			if (qtyOrdered < 20) {

				itemordered[qtyOrdered] = disc;
				qtyOrdered++;
				System.out.println("DVD added successfully.");
			}
			else {

				System.out.println(
					"No Space left to Add More.");
			}
		}
		public void removeDigitalVideoDisc(DigitalVideoDisc disc){
			if (qtyOrdered < 20 && qtyOrdered > 0) {

				itemordered[qtyOrdered] = null;
				qtyOrdered--;
			}
			else if (qtyOrdered < 0) {

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
			for(int i = 0; i < qtyOrdered; i++) {
				sumcost = sumcost + itemordered[i].cost;
			}
			return sumcost;
		}

		public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist){
			for(int i = qtyOrdered; i < dvdlist.length; i++){
				itemordered[i] = dvdlist[i];
				qtyOrdered++;
				System.out.println("DVD added successfully.");
			}
		}

		public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
			if(qtyOrdered == 0){
				itemordered[0] = dvd1;
				itemordered[1] = dvd2;
				qtyOrdered= qtyOrdered+2;
				System.out.println("All DVDs Added successffuly.");

			}else{
				itemordered[qtyOrdered+1] = dvd1;
				itemordered[qtyOrdered+2] = dvd2;
				qtyOrdered=qtyOrdered+2; 
				System.out.println("All DVDs Added successffuly.");
			}
		}

		public void printCart(){
			if(qtyOrdered > 0){
				System.out.println("Your Cart: ");
				for(int i = 0; i < qtyOrdered; i++){
					System.out.println((i+1) + ". Title: " + itemordered[i].getTitle() + " - Category : " 
						+ itemordered[i].getCategory() + " - Cost: " + itemordered[i].getCost());
				}
			}
		}

		public void searchByTitle(String title){
			int stt = 1;
			System.out.println("Search found:");
			for(int i = 0; i < qtyOrdered; i++){
				if(itemordered[i].title == title){
					System.out.println(stt + ". Title: " + itemordered[i].getTitle() + " - Category : " 
						+ itemordered[i].getCategory() + " - Cost: " + itemordered[i].getCost());
				}
				if(i == qtyOrdered && itemordered[i].title != title){
					System.out.println("DVD not found.");
				}
				stt++;
			}
		}

		public void searchByID(int id){
			int stt = 1;
			System.out.println("Search found:");
			for(int i = 0; i < qtyOrdered; i++){
				if(itemordered[i].id == id){
					System.out.println(stt + ". Title: " + itemordered[i].getTitle() + " - Category : " 
						+ itemordered[i].getCategory() + " - Cost: " + itemordered[i].getCost());
				}
				if(i == qtyOrdered && itemordered[i].id != id){
					System.out.println("DVD not found.");
				}
				stt++;
			}
		}
	}