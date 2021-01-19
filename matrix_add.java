import java.util.Scanner;
class mat
{
	int m;//rows
	int n;//columns
	int[][] a;
	mat()//defalut constructor
	{
		m=0;//initiallized as zero
		n=0;//initialized as zero
	}
	mat(int dm,int dn)//parameterized constructor
	{
		m=dm;
		n=dn;
		a=new int[m][n];
	}
	void input()//member function
	{
		Scanner s=new Scanner(System.in);	
		System.out.print("enter the number of rows: "); m = s.nextInt();
        	System.out.print("enter the number of columns: "); n = s.nextInt();
	        a = new int[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
	}
	void display() {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
        }}
	mat add(mat obj) {
        mat ans = new mat(m,n);
	try
	{
		if(m==obj.m && n==obj.n){   
		for(int i = 0; i < m; i++)
        	{
            	for(int j = 0; j < n; j++)
                	{
                    	ans.a[i][j] = a[i][j] + obj.a[i][j];
                	}
        	}
		}
		else throw new Exception(); 
	}
	catch(Exception e)
	{
		System.out.println(e+" Invalid dimension");
	}
	finally{
		return ans;
	}
    }	
}
class matrix_add
{
	public static void main(String s1[]){		
		mat m1 = new mat();
		m1.input();
        	m1.display();

	        mat m2 = new mat();
        	m2.input();
		m2.display();

	        mat ans = m1.add(m2);
		System.out.println("Addition of two matrices: ");
        	ans.display();

}}