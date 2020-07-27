import java.rmi.server.SocketSecurityException;

public class Constructer2 
{
	int a;
	int b;
	int c;
	Constructer2()
	{
		
	}
	Constructer2(int a1)
	{
		a=a1;
	}
	
	Constructer2(int b1, int c1)
	{
		b=b1;
		c=c1;
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		Constructer2 a1 = new Constructer2();
		a1.disp();
		
		Constructer2 a2 = new Constructer2(10);
		a2.disp();
		
		Constructer2 a3 = new Constructer2(20,30);
		a3.disp();
	}

}
