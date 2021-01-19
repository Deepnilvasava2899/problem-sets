abstract class shape
{
	int d1;
	int d2;
	shape()
	{
		d1=0;
		d2=0;
	
	}
	shape(int dd1,int dd2)
	{
		d1=dd1;
		d2=dd2;
	}
	abstract double calculate_area();
}
class tri extends shape
{
	double area;
	tri(int m1,int m2)
	{
		super();
		super.d1=m1;
		super.d2=m2;
		area=0;
		
	}
	double calculate_area()
	{
		return((0.5) * d1 * d2);
	}
}

	class rect extends shape
{
	double area;
	rect(int n1,int n2)
	{
		super();
		super.d1=n1;
		super.d2=n2;
		area=0;
		
	}
	double calculate_area()
	{
		return(d1*d2);
	}
}

class shapin
{
	public static void main(String [] args)
	{
		shape s_ref=new tri(4,5);
		double ans=s_ref.calculate_area();
		System.out.println(ans);
		s_ref = new rect(4,5);
		ans=s_ref.calculate_area();
		System.out.println(ans);
		
	}
}

