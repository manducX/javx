import java.util.*;

public class positive_negative {
    public static void main(String[] args) {
        Scanner pack = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = pack.nextDouble();
        pack.close();

        if (input > 0) {
            if (input < 1) {
                System.out.println("Positive Small Number");
            } 
            else if (input > 100) {
                System.out.println("Positive Large number");
            } 
            else {
                System.out.println("Positive number");
            }
        } 
        else if (input < 0) {
            if (Math.abs(input) < 1) {
                System.out.println("Negative Small Number");
            } 
            else if (Math.abs(input) > 100) {
                System.out.println("Negative Large number");
            } 
            else {
                System.out.println("Negative number");
            }
        } 
        else {
            System.out.println("Zero");
        }
    }
}
