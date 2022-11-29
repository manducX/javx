import java.util.Scanner;

class small_large {

    public static void main(String[] strings) {

        double num;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number : ");
        num = input.nextDouble();
        input.close();

        if (num == 0.0) {

            System.out.println("input number " + num);
            System.out.println("the number is zero ");

        }

        else if ((Math.abs(num) < 1.0)) {
            System.out.println("input number " + num);
            System.out.println("the number is small ");

        } else if (Math.abs(num) > 1000000.0) {

            System.out.println("input number " + num);
            System.out.println("the number is large ");
        } else if (num > 0.0 && num <= 1000000.0) {
            System.out.println("input number " + num);
            System.out.println("the number is positive ");
        }

        else if (num < 0.0 && num >= -1000000.0) {

            System.out.println("input number " + num);
            System.out.println("the number is negative ");
        }

    }

}