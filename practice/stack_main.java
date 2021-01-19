class stack
{
	int [] a;
	int top;
	stack(int size)
	{
		a=new int[size];
		top=-1;
	}
	void push(int e)
	{
		try
		{
			if(top>=a.length) throw new Exception();
			a[++top]=e;
		}	
		catch(Exception ex)
		{
			System.out.println("Stack overflow");	
		}
	}
	int pop()
	{
		try
		{
			if(top==-1) throw new Exception();
			return (a[top--]);
		}
		catch(Exception e)
		{
			System.out.println("Stack underflow");
			return 0;
		}
	}
	void display()
	{
		System.out.println("Top of Stack:");
		System.out.println(a[top]);
	}
}
class stack_main
{
	public static void main(String [] args)
	{
		int len = args.length;
		if(len==0)
		{
			System.out.println("Give Command arguments");
		}
		else
		{
			stack s1 = new stack(5);
			
			int i = 0;
			while(i<len)
			{
				String op = args[i];
				if(op.equals("push"))
				{
					int n = Integer.parseInt(args[i+1]);
					s1.push(n);
					i++;
					System.out.println(n +" pushed");
				}
				else if(op.equals("pop"))
				{
					System.out.println("poped element : "+s1.pop());
				}
				i++;
			}
			s1.display();
		}
	}
}