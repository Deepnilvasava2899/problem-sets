/* Lab 14_C : processing 2D array with each-for loop */

import java.util.Scanner;

class twoD_array_each_for
{
	public static void main(String []s)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many rows? : ");
		int r=scanner.nextInt();
		System.out.println("How many columns? : ");
		int c=scanner.nextInt();
		System.out.println("Enter elements: ");
		Integer [][]a=new Integer[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		
		for(Integer[] i:a)
		{
			for(Integer j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}