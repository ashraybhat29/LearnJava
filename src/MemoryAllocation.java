
public class MemoryAllocation 
{
	static int a;
	int b;
	void m1()
	{
		System.out.println("Non static method");
	}
	
	static void m2()
	{
		System.out.println("Static Method");
	}

	public static void main(String args[])
	{
		m2();
		System.out.println(a);
		MemoryAllocation a1 =  new MemoryAllocation();
		a1.m1();
		a1.b=100;
		System.out.println(a1.b);
		MemoryAllocation a2 = new MemoryAllocation();
		System.out.println(a2.b);
		a1.a=100;
		System.out.println(a1.a);
	}
}
