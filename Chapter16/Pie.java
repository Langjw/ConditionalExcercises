import java.util.Scanner;

public class Pie {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input contestants weight: ");
        inData = scan.nextInt();
        int weight = inData;
        if (weight > 220 && weight < 280) {
            System.out.println("Contestant is allowed to participate");
        }
        else {
            System.out.println("Contestant is not allowed to participate");
        }
    }
}