
public class MethodOver
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	void add (int a)
	{
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	void add (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	void add(int a, float b)
	{
		float c=a+b;
		System.out.println(c);
	}
	
	void add(float a, int b)
	{
		float c =a+b;
		System.out.println(c);
	}
	
	public static void main(String argd[])
	{
		MethodOver A = new MethodOver();
		A.add();
		A.add(40);
		A.add(40, 20);
		A.add(50, 45.50f);
		A.add(10.50f,26);
	}

}
