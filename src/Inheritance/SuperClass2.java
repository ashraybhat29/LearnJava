package Inheritance;

class SuperClass
{
	SuperClass()
	{
		System.out.println("Super most class const");
	}

	SuperClass(int a)
	{
		System.out.println(a);
	}
}

class SuperClass1 extends SuperClass
{
	SuperClass1()
	{
		super(10);
		System.out.println("Super class const");
	}
}

class SuperClass2 extends SuperClass1
{
	SuperClass2()
	{
		super();
		System.out.println("sub class conts");
	}
	
	public static void main(String args[])
	{
		SuperClass2 S2 = new SuperClass2();
	}
}
