package p2;
import p1.A;
public class sub_A extends A
{
	public sub_A()
	{
		super();
		System.out.println("default constructor is working of sub_A");
	}
	public sub_A(int n)
	{
		super(n);
		
		System.out.println("paramater constructor  of sub_A");
		
	}
	public void display_sub_A()
	{
		display();
		System.out.println("displays the sub_A");
		System.out.println("displays protected "+v);
		//System.out.println("displays the sub_A"+p);
		
	}
	
}