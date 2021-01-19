package p1;
public class A
{
	int buff;
	private int p = 1;
	protected int v = 2;
	public A()
	{
		buff = 0;
	}
	public A(int d_code)
	{
		buff = d_code;
		
	}
	public void display()
	{
		System.out.println("display of A" + buff);
	}
}