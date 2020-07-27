
public class ThisKeyword 
{
	int a;
	int b;
	static int c;
	
	ThisKeyword()
	{
		
	}
	
	ThisKeyword(int c)
	{
		this.c=c;
	}

	ThisKeyword(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--------");
		
	}
	
	public static void main(String args [])
	{
		ThisKeyword d = new ThisKeyword();
				d.disp();
		ThisKeyword d1 = new ThisKeyword(10);
	        	d1.disp();
		ThisKeyword d2 = new ThisKeyword(10,30);
				d2.disp();
	}
}
