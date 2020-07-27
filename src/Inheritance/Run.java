package Inheritance;
 class Father 
{
	void bike()
	{
		System.out.println("Honda Active");
	}
	void car()
	{
		System.out.println("BWM");
	}
}

class Son extends Father
{
	void myBike()
	{
		System.out.println("Ninja");
	}
	
	void myCar()
	{
		System.out.println("Audi");
	}
}

class Run extends Son
{
	public static void main(String args[])
	{
		Run f =  new Run();
		Son    s =  new Son();
		f.bike();
		f.car();
		s.myBike();
		s.myCar();
		s.bike();
		s.car();
	}
}