package Lab02;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemordered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	static int qtyOrdered = 0;
		public void addDigitalVideoDisc(DigitalVideoDisc disc){
			if (qtyOrdered < 20) {

				itemordered[qtyOrdered] = disc;
				qtyOrdered++;
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
	}