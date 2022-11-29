class A
{
    private void display()
	{
		System.out.println("It will display because it's present in same class.");
	}
    public static void main(String args[])
	{ 
		A obj = new A();
		//B obi = new B();
		// Trying to access private method
		// of another class
		obj.display();
		//obi.display();
	}
}
class B
{
	//private void display()
	{
		System.out.println("It will not print because it's on private method of different class");
	}

}

