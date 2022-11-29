import java.util.Scanner;
class reverse_for {
    public static void main(String[] args) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner st = new Scanner(System.in);
        int num = st.nextInt();
        int reversed = 0;
        st.close();

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
} 