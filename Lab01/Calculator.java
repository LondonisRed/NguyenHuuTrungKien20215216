package Lab01;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        double sum, minus, product, quotient;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter fisrt number: ");
        double num1 = keyboard.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = keyboard.nextDouble();
        keyboard.close();
        sum = num1 + num2;
        minus = num1 - num2;
        product = num1 * num2;
        quotient = num1/num2;
        System.out.print("\n");
        System.out.print("Sum: " + sum);
        System.out.print("\n");
        System.out.print("Differnce: " + minus);
        System.out.print("\n");
        System.out.print("Product: " + product);
        System.out.print("\n");
        System.out.print("Quotient: " + quotient);
    }
}
