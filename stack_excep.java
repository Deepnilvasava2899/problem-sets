//WAP to perforn stack operation using cmd args
//29/07/2020
import java.util.*;

class stack
{
	int n[];
	int top;
	stack(int size)
	{
		n = new int[size];
		top = -1;
	}
	void push(int element)
	{
		
		try
		{					
			if(top>n.length)
			{	
				throw new Exception("Stack Overflow");
			}
			else
			{
				n[++top] = element;
				System.out.println(element +" pushed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	int pop()
	{
		int val=0;
		try
		{					
			if(top==-1)
			{
				throw new Exception("Stack underflow");
			}
			else
			{
				val = n[top--];
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			return val;
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
class stack_excep
{
	public static void main(String args[])
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
					int n = Integer.parseInt(args[++i]);
					s1.push(n);		
				}
				else if(op.equals("pop"))
				{
					int pop = s1.pop();
					if(pop==0)
					{}
					else
					{
						System.out.println("poped element : "+pop);
					}
					
				}
				i++;
			}
			//s1.display();
		}	
	}
}