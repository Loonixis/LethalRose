//Problem12:Input marks in 3 papers and print them alongside their position
import java.io.*;
class Problem12
{	public static void main(String args[])throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter marks in paper 1:");
		int p1=Integer.parseInt(br.readLine());
		System.out.println("Enter marks in paper 2:");
		int p2=Integer.parseInt(br.readLine());
		System.out.println("Enter marks in paper 3:");
		int p3=Integer.parseInt(br.readLine());
		int max=p1>p2?(p1>p3?p1:p3):(p2>p3?p2:p3);
		int min=p1<p2?(p1<p3?p1:p3):(p2<p3?p2:p3);
		int mid=(p1+p2+p3)-(max+min);
		int mp1=max==p1?1:(p1==mid?2:3-(mid-min==0?1:0));
		int mp2=max==p2?1:(p2==mid?2:3-(mid-min==0?1:0));
		int mp3=p3==max?1:(p3==mid?2:3-(mid-min==0?1:0));
		System.out.println("Position of P1 = "+mp1);
		System.out.println("Position of P2 = "+mp2);
		System.out.println("Position of P3 = "+mp3);
	}
}
		