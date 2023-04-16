package Lab01;

import java.util.Scanner;
import java.lang.Math;
public class SloveEquation {

    static void firstDegreeEquation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        double x; 
        switch (a) {
            case 0:
                System.out.print("\n");
                System.out.print("The equation has no solution." + "\n");
                break;
            default:
                System.out.print("Enter b: ");
                double b = sc.nextDouble();
                x = (b*(-1))/a;
                System.out.print("\n");
                System.out.print("Equation has only solution: x = " + x + "\n");
                break;
        }
    }

    static void systemOfFirstDegree(){
        double sys[][] = new double[2][3];
        double x1, x2;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter a" + i + j + ": ");
                sys[i][j] = sc.nextDouble(); 
            }
        }
        if(sys[0][0] == sys[1][0] && sys[0][1] == sys[1][1] && sys[0][2] == sys[1][2]){
            System.out.print("\nThe Equation has infinte many solution." + "\n");
        }else if(sys[0][0] == sys[1][0] && sys[0][1] == sys[1][1] && sys[0][2] != sys[1][2]){
            System.out.print("\nThe Equation has no solution." + "\n");
        }else{
            x1 = (sys[0][2]*sys[1][1] - sys[1][2]*sys[0][1])/(sys[0][0]*sys[1][1]-sys[0][1]*sys[1][0]);
            x2 = (sys[0][2]*sys[1][0] - sys[1][2]*sys[0][0])/(sys[0][1]*sys[1][0]-sys[1][1]*sys[0][0]);
            System.out.print("\nThe System has only solution:\n");
            System.out.print("x1 = " + x1 + "\n" + "x2 = " + x2 + "\n");
        }
    }
    static void secondDegreeEquation(){
        int delta;
        double x0;
        double x1, x2;
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        switch(a){
            case 0:
                System.out.print("Enter b: ");
                int b = sc.nextInt();
                System.out.print("Enter c: ");
                double c = sc.nextDouble();
                x0 =  c*(-1)/b;
                System.out.print("\nThe equation has only solution: x = " + x0 + "\n");
                break;
            default:
                System.out.print("Enter b: ");
                int b1 = sc.nextInt();
                System.out.print("Enter c: ");
                int c1 = sc.nextInt();
                delta = b1 * b1 - 4 * a * c1;
                if(delta < 0){
                    System.out.print("\nThe Equation has no solution." + "\n");
                }else if(delta == 0){
                    x = b1*(-1)/a;
                    System.out.print("The equation has only solution: x = " + x + "\n");
                }else{
                    x1 = (b1*(-1) + Math.sqrt(delta))/(2*a);
                    x2 = (b1*(-1) - Math.sqrt(delta))/(2*a);
                    System.out.print("\nThe equation has two solutions:\n");
                    System.out.print("x1 = " + x1 + "\n" + "x2 = " + x2 + "\n");
                }
                break;
        }
        
    }
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
           
            System.out.print("\n1.Slove The first-degree equation (linear equation) with one variable. ");
            System.out.print("\n2.Slove The system of first-degree equations (linear system) with two variables. ");
            System.out.print("\n3.Slove The second-degree equation with one variable. ");
            System.out.print("\n4.Exit.");
            System.out.print("\n\nChoose an option to continue: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    firstDegreeEquation();
                    break;
                case 2:
                    systemOfFirstDegree();
                    break;
                case 3:
                    secondDegreeEquation();
                    break;
                case 4:
                    break;
            }
        }while(choice != 4);
    }
}
