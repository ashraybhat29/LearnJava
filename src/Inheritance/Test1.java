package Inheritance;


class Test
{
	int a = 100;
	int b = 200;
	
	void m2()
	{
		System.out.println("Super class method");
	}
}
class Test1 extends Test
{
	int a = 50;
	int b =250;
	void m2()
	{
		System.out.println("Sub class method");
	}
	
	void m1()
	{
		int a = 10;
		int b = 20;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(super.b);
		this.m2();
		super.m2();
	}
	
	public static void main(String args[])
	{
		Test1 t = new Test1();
		t.m1();
	}

}
