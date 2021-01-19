class nested_try
{
	public static void main(String [] args)
	{
		int n=5;
		System.out.println("OUTSIDE OF TRY");
		try
		{
			System.out.println("OUTER TRY");
			try
			{
				System.out.println("INNER TRY");
				int no=Integer.parseInt("123");
				System.out.println("after parse int");
			}
			finally
			{
				System.out.println("finally of inner TRY");
				
			}
			if(n > 0) throw new Exception();
			System.out.println("after throw");
	
			
		}
			catch(Exception e)
		{
			System.out.println("E"+e);
			throw e;
		}	
		catch(NumberFormatException nfe)
		{
			System.out.println("NFE"+nfe);
			throw nfe;
		}		
		finally
		{
			System.out.println("OUTSIDE finally ");
		}
		
		System.out.println("after try catch finally bloack");
	}
}