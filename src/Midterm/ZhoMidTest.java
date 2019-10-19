package Midterm;
import java.util.Scanner;

public class ZhoMidTest {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees work in your business?");
        int numemp = scanner.nextInt();
        System.out.println("How much do you earn from your grocery business?");
        double earning = scanner.nextDouble();
        System.out.println("The Data You Just Entered for Your Grocery Business:");
        GroceryBusiness groBus = new GroceryBusiness(numemp,earning);
        System.out.println(groBus);
        System.out.println("In which year you established your grocery business?");
        groBus.yearEstablished(scanner.nextInt());
        System.out.println("What is the price for onion per kilo?");
        groBus.onionPrice(scanner.nextDouble());
        System.out.println("What is the price for coke per bottle?");
        groBus.cokePrice(scanner.nextDouble());
    }
}
