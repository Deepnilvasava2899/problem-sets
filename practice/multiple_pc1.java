class Buffer
{
	int no;
	volatile int flag=0;
	synchronized void get()
	{
		try
		{
			if(flag==0)
				wait();
			System.out.println(no);
			flag=0;
			notifyAll();
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
			notifyAll();
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
		for(int i=0;i<3;i++)
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
		for(int i=0;i<3;i++)
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
class multiple_pc1
{
	public static void main(String[] s)
	{
		Buffer b_ref=new Buffer();
			producer p1=new producer(0,b_ref);
			consumer c1=new consumer(0,b_ref);
			producer p2=new producer(1,b_ref);
			consumer c2=new consumer(1,b_ref);
			producer p3=new producer(2,b_ref);
			consumer c3=new consumer(2,b_ref);
		try{
			//p1.start();
			p1.join();
			//c1.start();
			c1.join();
			//p2.start();
			p2.join();
			//c2.start();
			c2.join();
			//p3.start();
			p3.join();
			//c3.start();
			c3.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}