class thread_main
{
public static void main(String [] s)
{
	Thread th_ref;
	th_ref = Thread.currentThread();
	System.out.println("  " + th_ref);
	th_ref.setName("first");
	System.out.println("  " + th_ref);
	th_ref.setName("second");
	System.out.println("  " + th_ref);	
	String s1=th_ref.getName();
	System.out.println("  " + s1);
	th_ref.setPriority(8);
	int n=th_ref.getPriority();
	System.out.println("  " + n);
}
}