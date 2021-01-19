class stack
{
int [] a;  //new int
int tos;   //top of stack=0
stack(int n)
{
	//this will create  the garbage values  as it is already defined above 	int [] a;  //if added ? local 
		a=new int[n];//the refernce is used here
		tos=0;
}
	void push(int no)
	{
		a[tos++]=no;
	}
	int pop()
	{
	return(a[--tos]);
	}
}
class stack_main
{
	public static void main(String [] s)
	{
		stack s_ref=new stack(10);
		/*s_ref.push(5);
		s_ref.push(6);
		s_ref.push(34);
		s_ref.push(3);
		s_ref.push(53);
		s_ref.push(62);
		s_ref.push(32);
		int b=s_ref.pop();*/
		try
		{
			if(s_ref <= 0)
			{
				throw new ArithmeticException("Stack underflow");
			}
			else if(s_ref > 10)
			{
				throw new ArithmeticException("stack overflow");
			}
		}
		finally
		{
			System.out.println("stack implementation perfectly!");
		}
	}
	
	
}