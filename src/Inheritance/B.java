package Inheritance;

class A
{
	int a;
	int b;
	int c;
	
	A()
	{
		
	}
	
	A (int a, int b)
	{
		this();
		this.a = a;
		this.b = b;	
	}
}


class B extends A
{
	int a = 10;
	int b = 20;
	
	B()
	{
		this(1000,2000);
	}
	
	B(int a, int b)
	{
		super(100,200);
		this.a = a;
		this.b = b;
	}
	
	void disp()
	{
		int a = 5;
		int b = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
	public static void main(String args[])
	{
		B b = new B();
		b.disp();
		
		B b1 = new B(150,250);
		b1.disp();
	}
}
