//Problem13:Currency conversion table
import java.io.*;
class Problem13
{	public static void main(String args[])throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double inr,rupee;
		for(;;)
		{	System.out.println("Enter '1' to convert Inr to British pound");
			System.out.println("Enter '2' to convert Inr to US dollars");
			System.out.println("Enter '3' to convert Inr to Canadian dollars");
			System.out.println("Enter '4' to convert any amount to Indian rupees");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{	case 1:	System.out.println("Enter amount in INR: ");
					inr=Double.parseDouble(br.readLine());
					System.out.println("Conversion rate is 0.0093 pounds for 1 rupee");
					double pound=inr*0.0093;
					System.out.println("Rupees "+inr+" = "+pound+" pounds");
					break;
				case 2:	System.out.println("Enter amount in INR: ");
					inr=Double.parseDouble(br.readLine()); 				                                					System.out.println("Conversion rate is 0.012 USD for 1 rupee");
					double usd=inr*0.012;
					System.out.println("Rupees "+inr+" = "+usd+" USD");
					break;
				case 3:	System.out.println("Enter amount in INR: ");
					inr=Double.parseDouble(br.readLine());
					System.out.println("Conversion rate is 0.017 CAD for 1 rupee");
					double cad=inr*0.017;
					System.out.println("Rupees "+inr+" = "+cad+" CAD");
					break;
				case 4: System.out.println("Enter 'a' to convert pound to inr");
					System.out.println("Enter 'b' to convert usd to inr");
					System.out.println("Enter 'c' to convert cad to inr");
					char k=br.readLine().charAt(0);
					switch(k)
					{	case 'a':	System.out.println("Enter amount in pound");
								double p=Double.parseDouble(br.readLine());								rupee=p*107.73;
							System.out.println(p+" pounds = "+rupee+" rupees");
								break;
						case 'b':	System.out.println("Enter amount in usd");
								double us=Double.parseDouble(br.readLine());								rupee=us*83.76;
							System.out.println(us+" usd = "+rupee+" rupees");
								break;
						case 'c':	System.out.println("Enter amount in cad");
								double cd=Double.parseDouble(br.readLine());								rupee=cd*60.47;
							System.out.println(cd+" cad = "+rupee+" rupees");
								break;
						default:	System.out.println("Invalid Input");
								break;
					}
					break;
				default:	System.out.println("Invalid Input");
						break;
			}
			System.out.println("Enter Y/N to continue or stop");
			char choice=br.readLine().charAt(0);
			if(choice!='Y' && choice!='y')
				break;
		}
	}
}