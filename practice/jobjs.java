//program to use private and public access specifier and to test that theyb work or not
class calc//this is the blue print 
{
int no1;//variables
int no2;
int result;

public void	perform()//method
		{
		result=no1+no2;
		}
}
public class jobjs
{
	public static void main(String[] args)
	{
		//oobjects knows something and does something(using methods)
		calc obj; //reference
		
		obj = new calc();//this forms the object
		
		//to accessthe number we need to use the obj to acces the member in the class calc
		
		obj.no1=35;
		
		obj.no2=23;
		
		//here we need to call the member function perform to acces those thing
		
		obj.perform();
		System.out.println(obj.result);
	}
	
}	