//program 2.1 
public class comline
{
	public static void main(String[] args)
	{
		System.out.println("the length is:"+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println("the arguement "+args[i]+"and their length"+args[i].length());
		}
	}
}