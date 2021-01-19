//program for lab 3.1

class parse_int_main
{
public static void main(String [] s)
{
int no;
int pos_count=0;
int neg_count=0;
for(int i=0;i<s.length;++i)
{
try 	
	{
	no=Integer.parseInt(s[i]);
	System.out.println("no exception");
	if(no > 0)
	{
	pos_count++;
	}
	if(no < 0)
	{
	neg_count++;
	}
	}
	catch (NumberFormatException nfe)
	{
	System.out.println("exception...."+nfe);
	}
	}
	System.out.println("pos count ="+pos_count+"neg count"+neg_count);
	}
}