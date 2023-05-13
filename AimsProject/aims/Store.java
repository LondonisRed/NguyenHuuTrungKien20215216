package AimsProject.aims;

public class Store {
    static final int MAX_NUMBERS_INSTORE = 100000000;
    int availDisc = 0;
    private DigitalVideoDisc itemInStore [] = new DigitalVideoDisc [MAX_NUMBERS_INSTORE];
    
    public void addDVD(DigitalVideoDisc disc){
        if(availDisc < MAX_NUMBERS_INSTORE){
            itemInStore[availDisc] = disc;
            availDisc++;
            System.out.println("DVD added successfully.");
        }
        else {
            System.out.println(
                "The Store is full.");
        }
    }
    public void removeDVD(DigitalVideoDisc disc){
        if (availDisc < MAX_NUMBERS_INSTORE && availDisc > 0) {

            itemInStore[availDisc] = null;
            availDisc--;
        }
        else if (availDisc < 0) {

            System.out.println(
                "There is no disc to remove.");
        }
        else{
            System.out.println(
                "The store is  already full.");
        }
    }
}
