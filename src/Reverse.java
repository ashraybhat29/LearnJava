
public class Reverse
{
	public static void main(String args[])
	{
		int num=1257;
		int temp=num;
		int rem=0;
		int rev=0;
		while(num!=0)
		{
			rem= num%10;
			rev= rev*10+rem;
			num= num/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("No is palindrome");
		}
		else
		{
			System.out.println("No is not palindrome");
		}
	}

}
