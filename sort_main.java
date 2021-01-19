import java.util.Scanner;
class bubble_sort implements number
{
	int[] a;
	int n;
	bubble_sort()
	{
		n=0;
	}
	bubble_sort(int d_n)
	{
		n=d_n;
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
	}
	public void sort()
	{
		for(int k=0;k<n;k++)
		{
			for(int i=k;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
		}
	}
	void display()
	{
		System.out.print("bubble sort: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
class selection_sort implements number
{
	int[] a;
	int n;
	selection_sort()
	{
		n=0;
	}
	selection_sort(int d_n)
	{
		n=d_n;
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
	}
	public void sort()
	{
		int pos;
		for(int i=0;i<n;i++)
		{
			int min=a[i];
			pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					pos=j;
				}
			}
			int t=a[i];
			a[i]=a[pos];
			a[pos]=t;
		}
	}
	void display()
	{
		System.out.print("slection sort: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
class sort_main
{
	public static void main(String[] s)
	{
		System.out.print("How many numbers?: ");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		bubble_sort b=new bubble_sort(x);
		b.sort();
		b.display();
		System.out.println();
		
		System.out.print("How many numbers?: ");
		int y=scan.nextInt();
		selection_sort s1=new selection_sort(y);
		s1.sort();
		s1.display();
	}
}