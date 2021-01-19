class simple1
{
	int i=0;
	static int k=30;
	private int j=0;
	simple1()//member default constructor
	{
		j=1;
	}
	simple1(int d_i,int d_j)//member parameterixed constructor
	{
		i=d_i;
		j=d_j;
	}
	simple1(int d_j)
	{
		i=100;
		j=d_j;
	}
	public void set(int d_i,int d_j)
	{
		i=d_i;
		j=d_j;
		//return;
	}
	public void display()
	{
		System.out.println("i= "+i+" j= "+j+" k= "+k);
	}
}
public class simple2
{
	public static void main(String s11[]){
		simple1 s;
		s=new simple1();
		s.display();
		s=new simple1(3,5);
		s.i=10;
		//s.j=20;
		s.display();
		s.set(3,4);
		s.display();
		simple1 s1=new simple1(5,7);
		simple1.k=300;
		s.display();
	}
}		