
public class Fibonacci
{
	public static void main(String args[])
	{
		int prev=0;
		int next=1;
		int sum=0;
		System.out.println(prev);
		System.out.println(next);
		
		for(int i=0; i<=6; i++)
		{
			sum=prev+next;
			System.out.println(sum);
			prev = next;
			next= sum;
		}
	}

}
