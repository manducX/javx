import java.util.*;
interface services
{
	Scanner sc=new Scanner(System.in);
	int item=sc.nextInt();
}
interface products
{
	Scanner sc=new Scanner(System.in); 
	int item=sc.nextInt();
}
interface SP extends services,products
{
	Scanner sc=new Scanner(System.in);
	int item=sc.nextInt();
}
class customer
{
	Scanner sc=new Scanner(System.in);
	String customer_name,customer_type;
	Scanner sc1=new Scanner(System.in);
	customer()
	{
		System.out.print("Enter customer Name:");
		customer_name=sc1.nextLine();
        System.out.print("Enter customer Type:");
		customer_type=sc1.nextLine();
	}
}
class visit extends customer implements SP
{
	Scanner sc=new Scanner(System.in);
	int service_charge;
	visit()
	{
		super();
		System.out.println("Enter service charge:");
		service_charge=sc.nextInt();
	}
	public int services()
	{
		System.out.println("Enter number of items:");
		int item=sc.nextInt();
		service_charge=item*100;
		return service_charge;
	}
	public int products()
	{
		System.out.println("Enter number of items:");
		int item=sc.nextInt();
		service_charge=item*200;
		return service_charge;
	}
	public void display()
	{
		System.out.println("Customer name-"+customer_name);
		System.out.println("Customer type-"+customer_type);
		System.out.println("Service charge-"+service_charge);
	}
}
class Discount extends visit
{
	Scanner sc=new Scanner(System.in);
	int a;
	Discount()
	{
		super();
	}
	public int services()
	{
		System.out.println("Enter number of items:");
		int item=sc.nextInt();
		service_charge=item*100;
		if(customer_type.equals("premium"))
		{
			a=(int)(service_charge*0.3);
			service_charge=service_charge-a;
		}
		else if(customer_type.equals("gold"))
		{
			a=(int)(service_charge*0.2);
			service_charge=service_charge-a;
		}
		else if(customer_type.equals("silver"))
		{
			a=(int)(service_charge*0.1);
			service_charge=service_charge-a;
		}
		return service_charge;
	}
	public int products()
	{
		System.out.println("Enter number of items:");
		int item=sc.nextInt();
		service_charge=item*200;
		if(customer_type.equals("premium"))
		{
			a=(int)(service_charge*0.3);
			service_charge=service_charge-a;
		}
		else if(customer_type.equals("gold"))
		{
			a=(int)(service_charge*0.2);
			service_charge=service_charge-a;
		}
		else if(customer_type.equals("silver"))
		{
			a=(int)(service_charge*0.1);
			service_charge=service_charge-a;
		}
		return service_charge;
	}
	public void display()
	{
		System.out.println("Customer name-"+customer_name);
		System.out.println("Customer type-"+customer_type);
		System.out.println("Service charge-"+service_charge);
	}
}
public class nine
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Discount obj=new Discount();
		obj.services();
		obj.products();
		obj.display();
        sc.close();
	}
}