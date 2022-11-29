import java.util.Scanner;
import java.lang.Math;
class a
{
    void add()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,sum;
        System.out.println("Enter any two numbers:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        sc.close();
        sum=a+b;
        System.out.println("Result of Addition is"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Square Root");
        System.out.println("Press 6 for Percentage");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        sc.close();
        switch(ch)
        {
            case 1:
                a ob1=new a();
                ob1.add();
                break;
            case 2:
                b ob2=new b();
                ob2.substract();
                break;
            case 3:
                c ob3=new c();
                ob3.mul();
                break;
            case 4:
                d ob4=new d(); 
                ob4.div();
                break;
            case 5:
                e ob5=new e();
                ob5.square();
                break;
            case 6:
                f ob6=new f();
                ob6.per();
                break;
            default:
                System.out.println("Wrong Choice..!!!");
        }
    }
}
class b
{
    void substract()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,subs;
        System.out.println("Enter any two numbers:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        sc.close();
        subs=a-b;
        System.out.println("Result of Substraction is"+subs);        
    }
}
class c
{
    void mul()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,mul;
        System.out.println("Enter any two numbers:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        sc.close();
        mul=a*b;
        System.out.println("Result of Multiplication is"+mul);
    }
}
class d
{
    void div()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,div;
        System.out.println("Enter any two numbers:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        sc.close();
        div=a/b;
        System.out.println("Result of Division is"+div);
    }
}
class e
{
    void square()
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter any number:");
        a=sc.nextInt();
        sc.close();
        double square=Math.sqrt(a);
        System.out.println("Result of Square Root is"+square);
    }
}
class f
{
    void per()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,per;
        System.out.println("Enter Total number:");
        a=sc.nextFloat();
        System.out.println("Enter Obtained number:");
        b=sc.nextFloat();
        sc.close();
        per=(b/a)*100;
        System.out.println("Result of Percentage is"+per);
    }
    
}