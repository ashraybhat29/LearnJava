
public class VariableClassMethod 
{
	//non static variables
	int a;
	float f;
	long l;
	boolean flag;
	//static variables
	static int b;
	
	public static void main(String args[])
	{
		VariableClassMethod vcm = new VariableClassMethod();
		System.out.println("NON Static variables are below");
		System.out.println("Int =" +vcm.a);
		System.out.println("Float =" +vcm.f);
		System.out.println("Long =" +vcm.l);
		System.out.println("Boolean =" +vcm.flag);
		System.out.println("Static variables are below");
		System.out.println("Int =" +b);
		System.out.println("Int="+VariableClassMethod.b);
		System.out.println("Int="+vcm.b);
		
		
	}
	
	

}
