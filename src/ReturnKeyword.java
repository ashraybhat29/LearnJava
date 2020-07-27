
public class ReturnKeyword 
{
	int add (int a,int b)
	{
		int c=a+b;
		return c;
	}

	static int sub(int a, int b)
	{
		int c =a-b;
		return c;
	}
	
	void div(int a, int b)
	{
		int c=a%b;
		System.out.println("Div="+c);
	}
	
	public static void main(String [] args)
	{
		ReturnKeyword s = new ReturnKeyword();
		int x = s.add(5, 5);
		int y= s.sub(20, 11);
		System.out.println("x and y"+x  + y);
		s.div(x, y);
	}
}
