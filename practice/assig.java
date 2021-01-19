//program definition
/*Declare a class called buffer
having an integer array of n to store only positive numbers
define required members and main to call to meet the following
*/
import java.util.Scanner;
class buffer
{
	int []a;
	int n;
		buffer()
		{
			a=new int[n];
			int n=0;
		 System.out.println("enter the no of values u need to enter");
		 Scanner s=new Scanner(System.in);
		 n = s.nextInt();
		 
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the value");
				a[i]=s.nextInt();			
			}
		}
		buffer(int dn)
		{
			n=dn;
			a=new int[n];
		}
/*	void add_values()
		{	
		}*/
		void display()
		{
			for(int i=0;i<n;i++)
			{
				System.out.println("index = " + i + " -> value " + a[i]);
			}
		}
}	

class assig
{
	public static void main(String [] args)
{
	buffer b_ref=new buffer();
	//b_ref.add_values();
    b_ref.display();	
}
}