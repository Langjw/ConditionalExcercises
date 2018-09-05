import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total amount of purchase: ");
        inData = scan.nextInt();
        double total = inData;
        double thing = 0;
        if (total > 1000) {
            thing = total * 0.10;
            total = total - thing;
        }
        System.out.println("Discounted Price: " + total);
    }
}