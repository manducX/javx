interface Vehicle
{
	void start();
	void stop();
	void speed();
}
class Bicycle implements Vehicle
{
	public void start()
	{
		System.out.println("Bicycle starts by pedaling");
	}
	public void stop()
	{
		System.out.println("Bicycle stops by braking");
	}
	public void speed()
	{
		System.out.println("Bicycle's maximum speed is 30kmph");
	}
}
class Bike implements Vehicle
{
	public void start()
	{
		System.out.println("Bike starts by kick");
	}
	public void stop()
	{
		System.out.println("Bike stops by applying brakes");
	}
	public void speed()
	{
		System.out.println("Bike's maximum speed is 60kmph");
	}
}
class Car implements Vehicle
{
	public void start() 
	{
		System.out.println("Car starts by inserting key in the ignition");
	}

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void speed() {
        // TODO Auto-generated method stub
        
    }
}

class fifth{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();
        b.speed();
        b.stop();
        Bicycle d = new Bicycle();
        d.start();
        d.speed();
        d.stop();
    }
}