
public class ThisKeyword2 
{
	int a;
	int b;
	String name;
	
	ThisKeyword2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);		
	}
	
	ThisKeyword2 (String name)
	{
		this();
		this.name=name;
	}
	
	ThisKeyword2(int a, int b)
	{
		this("Ashray");
		this.a=a;
		this.b=b;
	}
	
	public static void main(String args[])
	{
		ThisKeyword2 a1 = new ThisKeyword2();
		System.out.println("----");
		ThisKeyword2 a2 = new ThisKeyword2(10,20);
		System.out.println("----");
		System.out.println(a2.name);//abcd
		System.out.println("----");
		System.out.println(a2.a);//10
		System.out.println("----");
		System.out.println(a2.b);//20
	}
}
