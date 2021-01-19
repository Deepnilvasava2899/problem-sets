import java.util.*;

class MyException extends Exception
{
	String exception;
	
	MyException(String exc)
	{
		exception = exc;
	}
	String get_message()
	{ 
		return ("MyException Occurred: "+exception) ;
    }
}
class buffer
{
	int array[];
	buffer()
	{
		array = new int[5];
	}
	void get_data()
	{
		Scanner sc = new Scanner(System.in);
		int v,l,index[];
		boolean zero_index=false,flag=false;
		index = new int[5];
		int demo_v = -1,counter = 0;
		for(int i = 0;i<array.length;i++)
		{
			
			try
			{
				System.out.println("Enter V(value) & L(location valid 0 to 9) :");
				
				demo_v = sc.nextInt();
				l = sc.nextInt();
				
				if(demo_v==0 && l ==0)
				{
					break;
				}					
				
				if(demo_v==-1)
				{
					throw new NullPointerException();
				}
				else
				{
					v = demo_v;
				}
				if(l<0 || l>9)
				{
					throw new ArrayIndexOutOfBoundsException();
				}
				if(v<0)
				{
					throw new MyException("Enter pos value ");
				}
				for(int j = 0;j<=counter;j++)
				{
					if(l==0 && zero_index==false)
					{
						zero_index = true;
						flag = true;
						break;
					}
					else if(l==0 || l==index[j])
					{
						throw new Exception("duplicate Location ");
					}
					else{
						flag = true;
						break;
					}
				}
				if(flag)
				{
					index[counter] = l;
					counter++;
				}
				array[l] = v;
			}
			catch(MyException ex)
			{
				System.out.println(ex.get_message());
			}
			catch(NumberFormatException nme)
			{
				System.out.println("Enter Integer Number");
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println("Enter valid position/Location");
			}
			catch(NullPointerException np)
			{
				System.out.println("empty position is not valid");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
	}
	void display()
		{
			System.out.println("Array : ");
			for(int i = 0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
		}
}

class user
{
	public static void main(String a[])
	{
		buffer b1 = new buffer();
		b1.get_data();
		b1.display();
	}
}