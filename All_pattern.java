import java.util.*;

public class All_pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number of Rows:");
        int n = inp.nextInt();
        
        System.out.println("First Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Second Pattern:");
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");

            }
            System.out.println();

        }
        
        System.out.println();
        System.out.println("Third Pattern:");
        
        int spaces = 1;
        spaces = n-1;
        for(int j=1; j<=n; j++) {
            for(int i=1; i<=spaces; i++) {
                System.out.print(" ");
            }
            spaces--;
            for(int i=1; i<=2*j-1; i++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        spaces = 1;
        for(int j=1; j<=n-1; j++) {
            for(int i=1; i<=spaces; i++) {
                System.out.print(" ");
            }
            spaces++;
            for(int i=1; i<=2*(n-j)-1; i++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        
        inp.close();

    }
}
