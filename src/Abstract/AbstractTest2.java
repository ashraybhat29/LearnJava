package Abstract;

abstract class Test1
{
	static void m1()
	{
		System.out.println("Complete Method");
	}
	
	abstract void m2();  
}

 class AbstractTest2 extends Test1
 {
	 void m3()
	 {
		 System.out.println("Normal class method");
	 }
	 
	 void m2()
	 {
		 System.out.println("Abstract class method");
	 }
	 
	 public static void main(String args [])
	 {
		 AbstractTest2 at = new AbstractTest2();
		 at.m1();
		 at.m3();
		 at.m2();
	 }
	 
	 

}
