
public class Constructer1 
{
	Constructer1()
	{
		System.out.println("Default");
	}

	Constructer1(int a)
	{
		System.out.println("1 param");
	}
	
	Constructer1(int a,int b)
	{
		System.out.println("2 param");
	}
	
	public static void main( String args[])
	{
		Constructer1 c1 = new Constructer1();
		Constructer1 c2 = new Constructer1(10);
		Constructer1 c3 = new Constructer1(20,30);
	}
}
