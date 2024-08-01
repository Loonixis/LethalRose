//Problem15:Pascal's Triangle
import java.io.*;
class Problem15
{	public static void main(String args[])throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter how many rows you want: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Pascal's Triangle ;)");
		for(int i=0;i<n;i++)
		{	for(int j=0;j<=i;j++)
			{	System.out.print(nCr(i,j)+" ");
			}
			System.out.println();
		}
	}
	public static int nCr(int n, int r)
	{	int n1=factorial(n);
		int r1=factorial(r);
		int n1r1=factorial(n-r);
		return (n1/(n1r1*r1));
	}
	public static int factorial(int num)
	{	if(num==0)
			return 1;
		int f=1;
		for(int i=1;i<=num;i++)
			f=f*i;
		return f;
	}
}
			