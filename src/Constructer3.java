public class Constructer3
{
	int a;
	int b;
	static int c;
	Constructer3()
	{
		
	}
	Constructer3(int c1)
	{
		c=c1;
	}
	
	Constructer3(int a1, int b1)
	{
		b=b1;
		a=a1;
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------");
	}
	
	public static void main(String args[])
	{
		Constructer3 a1 = new Constructer3();
		a1.disp();
		
		Constructer3 a2 = new Constructer3(10);
		a2.disp();
		
		Constructer3 a3 = new Constructer3(10,30);
		a3.disp();
	}

}
