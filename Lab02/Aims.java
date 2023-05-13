package Lab02;

public class Aims {
		public static void main(String[] args) {
			//Create a new cart
			Cart anOrder = new Cart();
			//Create new dvd objects and add them to the cart
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
			"Animation", "Roger Allers", 87, 19.95f);
			//anOrder.addDigitalVideoDisc(dvdl);
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
			"Science Fiction", "George Lucas", 87, 24.95f);
			//anOrder.addDigitalVideoDisc(dvd2);
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
			"Animation", 18.99f);
			anOrder.addDigitalVideoDisc(dvd3);
			//print total cost of the items in the cart
			System.out.println("Total Cost is: ");
			System.out.println(anOrder. totalCost());
			//print total cost of the items in the cart after remove dvd3
			anOrder.removeDigitalVideoDisc(dvd3);
			System.out.println("Total Cost is: ");
			System.out.println(anOrder. totalCost());

			anOrder.addDigitalVideoDisc(dvd1, dvd2);
			//DigitalVideoDisc dvdlist[] = new DigitalVideoDisc [2];
			//dvdlist[0] = dvdl;
			//dvdlist[1] = dvd2;
			//anOrder.addDigitalVideoDisc(dvdlist);
		}
	}