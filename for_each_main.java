// for each loop to process 2d array of int
// Lab Program - 2
// Date - 04/11/2020
import java.util.*;

class mat_mul{
	int [][]matrix;
	int r,c;
	mat_mul(){}	
	
	mat_mul(int s){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows of matrix: ");
		r = sc.nextInt();
		
		System.out.print("Enter number of columns of matrix: ");
		c = sc.nextInt();
		
		matrix = new int[r][c];
		
		System.out.println("Enter " +r*c+" Elements of matrix: ");
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}		
	}
	
	void multiply_matrix(mat_mul m1){
		if (this.r!=m1.r || this.c!=m1.c){
			System.out.println("Can't multiply matrix");
			//break;
		}
		else{
			mat_mul ans = new mat_mul();
			ans.r = m1.r;
			ans.c = m1.c;
			ans.matrix = new int[ans.r][ans.c];
			
			for (int i = 0; i < r; i++) { 
				for (int j = 0; j < c; j++) { 
					for (int k = 0; k < r; k++) 
						ans.matrix[i][j] += this.matrix[i][k] * m1.matrix[k][j]; 
				} 
			} 
			
			System.out.print("Multiplication of ");
			ans.matrix_display();
		}
	}
	
	void matrix_display()
	{
		System.out.println("Matrix is: ");
		
		for(int i[]: matrix)
		{
			for(int j: i)
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}

class for_each_main{
	public static void main(String args[]){
		System.out.println("Enter Matrix1: ");
		mat_mul m1 = new mat_mul(0);
		m1.matrix_display();

		System.out.println("Enter Matrix2: ");
		mat_mul m2 = new mat_mul(0);					
		m2.matrix_display();
							
		m1.multiply_matrix(m2);
	}
}