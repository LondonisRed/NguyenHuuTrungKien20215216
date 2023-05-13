package OtherProject.Lab01;

import java.util.*;

public class DaysInAMonth {
    static void display(int n, int year){
        switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("\nNumber of Days in a month is: 31" );
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("\nNumber of Days in a month is: 30" );
                break;
            case 2:
                if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
                    System.out.print("\nNumber of Days in a month is: 29");
                    break;
                }else{
                    System.out.print("\nNumber of Days in a month is: 28");
                    break;
                }
        }
    }

    public static void main(String[] args){
        int year;
        int month;
        Scanner sc = new Scanner(System.in); 
        do{
        System.out.print("Enter month: ");  
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
        }while(year < 0 && month < 1 && month > 12);
        sc.close();
        display(month,year);
    }
}

