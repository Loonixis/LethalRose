//Problem11: Input 4 integer a,b,c,d. Print them. Move data of a to b, b to c, c to d, d to a. Print modified values of a,b,c,d
import java.io.*;
class Problem11
{	public static void main(String args[])throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of a");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of b");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of c");
		int c=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of d");
		int d=Integer.parseInt(br.readLine());
		System.out.println("Enter how many times you want to swap the values:");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{	//c,d swap
			c=c+d;
			d=c-d;
			c=c-d;
			//b,c swap
			b=b+c;
			c=b-c;
			b=b-c;
			//a,b swap
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println("The integers after swapping===>");
		System.out.println("a="+a+", b="+b+", c="+c+", d="+d);
	}
}
