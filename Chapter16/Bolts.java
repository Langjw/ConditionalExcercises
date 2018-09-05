import java.util.Scanner;

public class Bolts {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of bolts: ");
        inData = scan.nextInt();
        int boltCost = inData * 5;
        System.out.println("Number of nuts: ");
        inData = scan.nextInt();
        int nutCost = inData * 3;
        System.out.println("Number of washers: ");
        inData = scan.nextInt();
        int washerCost = inData;
        int total = boltCost + nutCost + washerCost;
        System.out.println("Total cost: " + total);
    }
}