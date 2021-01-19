class buffer{
	int info;
	volatile int flag=0;//0 no info...1 info
    synchronized void put(int x) throws InterruptedException
    {
    	if(flag==1)
    	{
    		wait();
    	}
    	info=x;
    	System.out.println("produced:"+info);
    	flag=1;
    	notify();
    }

    synchronized void get() throws InterruptedException
    {
    	if(flag==0)
    	{
    		wait();
    	}
    	System.out.println("consumed:"+info);
    	flag=0;
    	notify();
    }
}
class producer implements Runnable{
	buffer b_ref;
	Thread tp_ref;
	producer(buffer db_ref){
        b_ref=db_ref;
        tp_ref = new Thread(this);
        tp_ref.start();
	}
	public void run(){
		for(int i=3;i<9;++i)
		{
			try{
				b_ref.put(i);
			}
			catch(InterruptedException ie)
			{

			}
		}
	}
}
class consumer extends Thread{
	buffer b_ref;
	Thread tc_ref;
	consumer(buffer db_ref){
        b_ref=db_ref;
        tc_ref = new Thread(this);
        tc_ref.start();
	}
	public void run(){
		for(int i=0;i<6;++i)
		{
			try{
				b_ref.get();
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
}
class pc_runnable{
	public static void main(String[] args) {
		buffer bref= new buffer();
		producer p1 = new producer(bref);
		consumer c1 = new consumer(bref);
	}
}



