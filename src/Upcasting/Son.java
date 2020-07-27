package Upcasting;

public class Son extends Father
{
	void mrg()
	{
		System.out.println("Awe Girl");
	}
	
	void property()
	{
		System.out.println("No Property");
	}
	
	public static void main(String args[])
	{
		Father f = new Son();
		f.mrg();
		f.dowry();
		
		Son s = new Son();
		s.property();
		s.mrg();
	}

}
