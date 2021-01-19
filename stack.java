//WAP to perforn stack operation using cmd args
//29/07/2020
//program 3.2
class stack
{
	int n[];//array defined
	int top;
	stack(int size)
	{
		n = new int[size];
		top = -1;
	}
	void push(int element)
	{
		try{
			
		if(top>=n.length)
		{
			throw new ArithmeticException("stack over flow");
		}
		else
		{
			n[++top] = element;
		}
		}
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			return n[top--];
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("Stack");
			for(int i=0;i<=top;i++)
			{
				System.out.println(n[i]);
			}
		}
		
	}
}
class stack_op
{
	public static void main(String [] args)
	{
		int len = args.length;
		if(len==0)
		{
			System.out.println("Give Cmd args");
		}
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