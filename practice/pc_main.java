class Buffer
{
	int no;
	volatile int flag=0;// 0 - no fresh info
	synchronized void get()
	{
		try
		{
			if(flag==0)
				wait();
			System.out.println(no);
			flag=0;
			notify();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	synchronized void put(int n)
	{
		try
		{
			if(flag==1)
				wait();
			no=n;
			flag=1;
			notify();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
class producer extends Thread
{
	int p_id;
	Buffer b;
	producer(int id,Buffer db)
	{
		p_id=id;
		b=db;
		start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{		
			try
			{
				System.out.println("producer "+i);
				b.put(i);
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}	
class consumer extends Thread
{
	int c_id;
	Buffer b;
	consumer(int id,Buffer db)
	{
		c_id=id;
		b=db;
		start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{		
			try
			{
				System.out.println("consumer "+i);
				b.get();
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}	
class pc_main
{
	public static void main(String[] s)
	{
		Buffer b_ref=new Buffer();
		producer p=new producer(0,b_ref);
		consumer c=new consumer(0,b_ref);
	}
}