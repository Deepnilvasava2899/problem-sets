class prime extends Thread {
	int lower;
	int upper;
	
	prime(int x, int y){
		lower = x;
		upper = y;
		start();
	}
	
	public void run(){
		for(int i=lower;i<=upper;++i){
			if(!prime.check(i)){
				System.out.print(i + " ");
			}
		//System.out.println("");
			
		}
	}
	synchronized public static void check(int x,int y){
		
		boolean flag = false;
		for(int j=x;j<=y;++j){
			flag = false;
        	for(int i = 2; i <= j/2; ++i)
        	{
            		// condition for nonprime number
           		if(j % i == 0)
           		{
              	  	flag = true;
               		break;
           	 	}
			
        	}
			if(!flag){
				System.out.print(j + " ");	
			}
			
		}
	}
}

class prime_main2{
	public static void main(String args[]){
		prime p1 = new prime(1,100);
		prime p2 = new prime (101,200);
		

		try{
			p1.join();
			p2.join();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}

	
	}

}