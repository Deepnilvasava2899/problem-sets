import java.util.Scanner;
class number1 implements I1
{
	int []a;
	int n;
	number1()
	{
		n=new int[10];
			int n=0;
		 System.out.println("enter the no of values u need to enter");
		 Scanner s=new Scanner(System.in);
		 n = s.nextInt();
		
	}
	public void m1(int[] a) {  
        int n = a.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }
		 }
	}
}

class number2 implements I1

{
	int []a;
	int n;
	number2()
	{
		n=new int[10];
			int n=0;
		 System.out.println("enter the no of values u need to enter");
		 Scanner s=new Scanner(System.in);
		 n = s.nextInt();
		
	}
	public void m2(int a[])
	{
		
        for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }
	}
}
class number_main
{
	public static void main(String [] args)
	{
		number1 ne = new number1();//first for bubble sort
		I1 ir= new number1();
		ne.m1();
		
		number2 n2 = new number2();//second for selection sort
		I1 i2=new number2();
		n2.m2();
		
	}
	
}
