//Problem14: Input a number, extract all its digits and display them
import java.io.*;
class Problem14
{	public static void main(String args[])throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a positive number: ");
		int n=Integer.parseInt(br.readLine());
		int c=n,count=0,i=1;
		System.out.println("The digits of the number are: ");
		while(c>0)
		{	count++;
			c=c/10;
		}
		while(count>0)
		{	if(i==1){
			System.out.println("1st digit is "+(n/(int)Math.pow(10,--count)));}
			else if(i==2){
			System.out.println("2nd digit is "+(n/(int)Math.pow(10,--count)));}
			else if(i==3){
			System.out.println("3rd digit is "+(n/(int)Math.pow(10,--count)));}
			else
			System.out.println(i+"th digit is "+(n/(int)Math.pow(10,--count)));
			n=n%(int)Math.pow(10,count);
			i++;
		}
	}
}