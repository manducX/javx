class Cricketer{ 
	Cricketer(){
		System.out.println("Object is created");
	}
	protected void finalize()
	{
	    System.out.println("Object is Destroyed");
	   }
	
}
class CricketerDemo{
	public static void main(String[] args) {
		Cricketer c = new Cricketer();
		c = null;
		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer();
		c1=c2;

		new Cricketer();
		System.gc();
	}
}