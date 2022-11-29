import java.util.*;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner api = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = api.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year");
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                }
            }
        }
        else {
            System.out.println(year + " is NOT a Leap Year");
        }
        api.close();
    }
}