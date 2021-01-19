import java.util.Scanner;
class matrix 
{
	int m;
	int n;
	int [][]a;
	matrix(int dm,int dn,Scanner scanner)
	{
		m=dm;
		n=dn;
		a=new int[m][n];
		System.out.println("enter the values of the matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
	}
	matrix(int dm,int dn)
	{
		m=dm;
		n=dn;
		a=new int[m][n];
		for (int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
					a[i][j]=0;
					
			}
		}
		
	}
	matrix add_matrices(matrix dm2)
	{
		matrix result=new matrix(dm2.m,dm2.n);		
		for(int i=0;i<dm2.m;i++)
		{
			for(int j=0;j<dm2.n;j++)
			{
				result.a[i][j]=this.a[i][j]+dm2.a[i][j];
			}
		}
		return result;
	}
	void display()
	{
		System.out.println("REsultant matrix is:");
		for (int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(a[i][j] + " ");	
			}
			System.out.println("\n");
		}
	}
}
class matrix_main
{
	public static void main(String [] s)
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("how many rows do you want !");
	int dm=scanner.nextInt();
	System.out.println("how many columns do you want !");
	int dn=scanner.nextInt();
	matrix m1=new matrix(dm,dn,scanner);
	matrix m2=new matrix(dm,dn,scanner);
	matrix result=m1.add_matrices(m2);
	result.display();
	matrix m3=new matrix(dm,dn,scanner);
	matrix result2=m1.add_matrices(m2.add_matrices(m3));
	result2.display();
	
	}
}
	
	
	