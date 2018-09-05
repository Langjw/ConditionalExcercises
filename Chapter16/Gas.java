import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Tank capacity, in gallons: ");
        inData = scan.nextInt();
        int capacity = inData;
        System.out.println("Gage Reading: ");
        inData = scan.nextInt();
        int gage = inData;
        System.out.println("Miles per gallon: ");
        inData = scan.nextInt();
        int mpg = inData;
        double milesLeft = capacity * (gage * 0.01) * mpg;
        if (milesLeft < 200) {
            System.out.println("Get gas!");
        }
        else {
            System.out.println("You don't need gas.");
        }
    }
}