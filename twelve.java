// public class twelve {  
    
//     public static void main(String[] args) {  
//         try{  
//         int a=args.length;  
//         System.out.println("a="+a);  
//         int b=42/a;  
//         int c[]={1};  
//         c[42]=99;  
//         }  
//         catch(ArithmeticException e)
//         {
//             System.out.println("Divide by 0: "+e);
//         }  
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Array index oob: "+e);
//         } 
//         System.out.println("After try/catch blocks.");  
//     }  
// }

public class twelve
{
    public static void main(String[] args)
    {
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero.");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid number.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Two numbers required.");
        }
    }
}