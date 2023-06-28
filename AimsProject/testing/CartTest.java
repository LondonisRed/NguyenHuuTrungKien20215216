package testing;
import aims.Cart;
import media.Media;
import media.CompactDisc;
import media.DigitalVideoDisc;
public class CartTest {
    public static void main(String [] args){
        Cart cart = new Cart();
		Media dvd2 = new DigitalVideoDisc(1,"Star Wars",
		"Science Fiction", 24.95f, "George Lucas", 87);
		//Media dvd3 = new CompactDisc();
		//cart.addMedia(dvd3);
       /// cart.searchByTitle("The Lion King");

       // cart.searchByID(1);
       // cart.searchByID(2);
    }
}
