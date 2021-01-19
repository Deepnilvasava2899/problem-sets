class findprime extends Thread{
	int l;
	int h;
	findprime(int d_low,int d_high){
		l=d_low;
		h=d_high;
		//start(); if we start this now wew  will get threads interuupted and merged
	}
	public void run(){
		for(int i=l;i<=h;++i)
		{
             if(isPrime(i)==true)
             {
             	System.out.println(i+" ");
             }
		}
	}
	boolean isPrime(int x)
	{
		for(int i=2;i<x;++i)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
class prime_main{
	public static void main(String[] args) {
		findprime f1= new findprime(1,50);
		
		findprime f2= new findprime(50,100);
		
		findprime f3= new findprime(100,150);
		try
		{
			f1.start();//starting from here so no thread will get interupt
			f1.join();
			System.out.println("===========================");
			f2.start();
			f2.join();
			System.out.println("===========================");
			f3.start();
			f3.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}