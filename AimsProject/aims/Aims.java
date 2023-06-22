package aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import media.*;		
public class Aims {
		static Cart cart = new Cart();
		static Store store = new Store();
		public static void main(String[] args) {
		//DigitalVideoDisc dvd = new DigitalVideoDisc(0, "dvd", "dvd", 0, "dvd", 0);
		//CompactDisc cd = new CompactDisc(0, "cd", "cd", 0, "cd", 0, "cd", null);
		//Book book = new Book(0, "book", "book", 0, null);
//		ArrayList	<Media> mediae = new ArrayList<Media>();
		//mediae.add(cd);
		//mediae.add(book);		
		//mediae.add(dvd);
		//for (Media m : mediae) {
//			System.out.println(m.toString());
//		}	
			//Create a new cart
			//Create new dvd objects and add them to the cart
			//DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
			///"Animation", "Roger Allers", 87, 19.95f);
			//anOrder.addDigitalVideoDisc(dvdl);
			//DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
			//"Science Fiction", "George Lucas", 87, 24.95f);
			//anOrder.addDigitalVideoDisc(dvd2);
			//DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
			//"Animation", 18.99f);
			//anOrder.addMedia(dvd3);
			//print total cost of the items in the cart
		//	System.out.println("Total Cost is: ");
			//System.out.println(anOrder. totalCost());
			//print total cost of the items in the cart after remove dvd3
			//anOrder.removeMedia(dvd3);
			//System.out.println("Total Cost is: ");
			//System.out.println(anOrder. totalCost());

			//anOrder.addMedia(dvd1, dvd2);
			//DigitalVideoDisc dvdlist[] = new DigitalVideoDisc [2];
			//dvdlist[0] = dvdl;
			//dvdlist[1] = dvd2;
			//anOrder.addDigitalVideoDisc(dvdlist);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			showMenu();
			System.out.print("Select function: ");
			int cmd = Integer.parseInt(scanner.nextLine());
			switch (cmd) {
			case 1:
				viewStore();
				break;
			case 2:
				updateStore();
				break;
			case 3:
				seeCurrentCart();
				break;
			case 0:
				System.out.println("Exit program");
				return;
			}
		}

	}

	public static void updateStore() {
		System.out.println("Press 1 to add media to store");
		System.out.println("Press 2 to remove media from store");
		Scanner scanner = new Scanner(System.in);
		int cmd = Integer.parseInt(scanner.nextLine());
		if (cmd == 1) {
			System.out.println("Title: ");
			String title = scanner.nextLine();
			for (Media media : store.getItemInStore()) {
				if (media.getTitle().equals(title)) {
					System.out.println("The media already existed");
					return;
				}
			}
			System.out.println("Category: ");
			String cate = scanner.nextLine();
			System.out.println("Cost: ");
			Float cost = Float.parseFloat(scanner.nextLine());
			int id = store.getItemInStore().size();
			System.out.println("Press 1 to add dvd");
			System.out.println("Press 2 to add cd");
			System.out.println("Press 3 to add book");
			int cm = Integer.parseInt(scanner.nextLine());
			if (cm == 1) {
				System.out.println("Director: ");
				String director = scanner.nextLine();
				System.out.println("Length: ");
				int len = Integer.parseInt(scanner.nextLine());
				DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, cate, cost, director, len);
				store.addMedia(dvd);
				System.out.println("Add successfully");
			}
			if (cm == 2) {
				System.out.println("Artist: ");
				String artist = scanner.nextLine();
				ArrayList<Tracks> tracks = new ArrayList<>();
				System.out.println("Director: ");
				String director = scanner.nextLine();
				System.out.println("Length: ");
				int len = Integer.parseInt(scanner.nextLine());
				CompactDisc cd = new CompactDisc(id, title, cate, cost, director, len, artist, tracks);
				store.addMedia(cd);
				System.out.println("Add successfully");
			}
			if (cm == 3) {
				List<String> authors = new ArrayList<String>();
				Book book = new Book(id, title, cate, cost, authors);
				store.addMedia(book);
				System.out.println("Add successfully");
			}
		}
		if (cmd == 2) {
			System.out.println("Title: ");
			String title = scanner.nextLine();
			for (Media media : store.getItemInStore()) {
				if (media.getTitle().equals(title)) {
					store.removeMedia(media);
					System.out.println("Remoced sucessfully");
					return;
				}
			}
			System.out.println("No media with this title existed");
		}
	}

	public static void viewStore() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			for (Media media : store.getItemInStore()) {
				media.printItem();
			}
			storeMenu();
			System.out.print("Select function: ");
			int cmd = Integer.parseInt(scanner.nextLine());
			switch (cmd) {
			case 1:
				seeDetails();
				break;
			case 2:
				addMediaToCart();
				break;
			case 3:
				playMedia();
				break;
			case 4:
				seeCurrentCart();
				break;
			case 0:
				System.out.println("Back");
				return;
			}
		}
	}

	public static void seeCurrentCart() {
		Scanner scanner = new Scanner(System.in);
		cart.printCartUpdate();
		while (true) {
			cartMenu();
			System.out.print("Select function: ");
			int cmd = Integer.parseInt(scanner.nextLine());
			switch (cmd) {
			case 1:
				filterMedia();
				break;
			case 2:
				sortMedia();
				break;
			case 3:
				removeMediaFromCart();
				break;
			case 4:
				playMediaInCart();
				break;
			case 5:
				placeOrder();
				break;
			case 0:
				System.out.println("Back");
				return;
			}
		}
	}

	public static void placeOrder() {
		System.out.println("Order is created");
		while (cart.getItemsOrdered().size() != 0) {
			cart.getItemsOrdered().remove(0);
		}
//		for (Media m : cart.getItemsOrdered()) {
//			cart.removeMedia(m);
//		}
		System.out.println("Number of media in cart: " + cart.getItemsOrdered().size());
	}

	public static void playMediaInCart() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		for (Media media : cart.getItemsOrdered()) {
			if (media.getTitle().equals(title)) {
				if (media instanceof Book) {
					System.out.println("Can not play book");
					return;
				}
				if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					cd.play();
				}
				if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					dvd.play();
				}
				return;
			}
		}
		System.out.println("No item with this title in cart");
	}

	public static void sortMedia() {
		System.out.println("Press 1 to sort by title");
		System.out.println("Press 2 to sort by cost");
		Scanner scanner = new Scanner(System.in);
		int cmd = Integer.parseInt(scanner.nextLine());
		if (cmd == 1) {
			cart.sortbytitlecost();
		}
		if (cmd == 2) {
			cart.sortbycosttile();
		}
		cart.printCartUpdate();
	}

	public static void filterMedia() {
		System.out.println("Press 1 to filter by title");
		System.out.println("Press 2 to filter by id");
		Scanner scanner = new Scanner(System.in);
		int cmd = Integer.parseInt(scanner.nextLine());
		if (cmd == 1) {
			System.out.print("Enter title: ");
			String title = scanner.nextLine();
			cart.searchByTitle(title);
		}
		if (cmd == 2) {
			System.out.print("Enter id: ");
			int id = Integer.parseInt(scanner.nextLine());
			cart.searchByID(id);
		}

	}

	public static void removeMediaFromCart() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		for (Media m : cart.getItemsOrdered()) {
			if (m.getTitle().equals(title)) {
				cart.removeMedia(m);
				return;
			}
		}
		System.out.println("No media with this title in cart");
	}

	public static void seeDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		for (Media media : store.getItemInStore()) {
			if (title.equals(media.getTitle())) {
				media.printItem();
				mediaDetailsMenu(media);
				return;
			}
		}
		System.out.println("No media with this title in store");
	}

	public static void addMediaToCart() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		for (Media media : store.getItemInStore()) {
			if (media.getTitle().equals(title)) {
				cart.addMedia(media);
				if (media instanceof DigitalVideoDisc) {
					int count = 0;
					for (Media m : store.getItemInStore()) {
						if (m instanceof DigitalVideoDisc) {
							count++;
						}
					}
					System.out.println("Number of DVD: " + count);
				}
				return;
			}
		}
		System.out.println("No item with this title in store");

	}

	public static void mediaDetailsMenu(Object media) {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		if (media instanceof DigitalVideoDisc || media instanceof CompactDisc) {
			System.out.println("2. Play");
		}
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		if (media instanceof DigitalVideoDisc || media instanceof CompactDisc) {
			System.out.println("Please choose a number: 0-1-2");
			return;
		}
		System.out.println("Please choose a number: 0-1");
	}

	public static void playMedia() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		for (Media media : store.getItemInStore()) {
			if (media.getTitle().equals(title)) {
				if (media instanceof Book) {
					System.out.println("Can not play book");
					return;
				}
				if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					cd.play();
				}
				if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					dvd.play();
				}
				return;
			}
		}
		System.out.println("No item with this title in store");
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
}