//Problem10: Input any positive integer and print the powers of all prime factors of it
import java.io.*;
class Problem10
{	public static void main(String args[])throws IOException
	{	System.out.println("Enter any positive integer");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		prime_factor(n);
	}
	public static void prime_factor(int n)
	{	int count=0;
		for(int i=2;i<=n;i++)
		{	count=0;
			while(n%i==0)
			{	count++;
				n=n/i;
			}
			if(count>0)
				System.out.println("Power of"+i+"is"+count);
		}
	}
}