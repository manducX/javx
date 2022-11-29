import java.util.*;
class account{
    void b(){
        Scanner sc=new Scanner(System.in);
        float banl=50000;
        System.out.println("Your current Balance is ="+banl);
        System.out.println("Do you want to deposit some money(enter 1 for yes and 0 for no) ");
        float k=sc.nextFloat();
        if (k==1) {
            System.out.println("Enter the amount to be deposit: ");
            float q=sc.nextFloat();
            float w=banl+q;
            System.out.println("The new balance is = "+w);
            System.out.println("Do you want to withdraw some ammount(enter 1 for yes and 0 for no) ");
            float r=sc.nextFloat();
            if (r==1) {
                System.out.println("Enter the amount to be withdrawn: ");
                float t=sc.nextFloat();
                float o=w-t;
                System.out.println("The new balance is = "+o);
            } 
            else {
                System.out.println("You have no transactions");
            }
        } 
        else {
            System.out.println("You have no transactions");
            System.out.println("Do you want to withdraw some ammount(enter 1 for yes and 0 for no) ");
            float r=sc.nextFloat();
            if (r==1) {
                System.out.println("Enter the amount to be withdrawn: ");
                float p=sc.nextFloat();
                float n=banl-p;
                sc.close();
                System.out.println("The new balance is = "+n);
            } 
            else {
                System.out.println("You have no transactions");
            }
        }
    }
}
public class bank_acc {
    public static void main(String[] args) {
        account a1=new account();
        a1.b();
    }
}
