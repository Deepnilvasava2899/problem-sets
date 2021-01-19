import java.util.Scanner;

class Student
{
	String name;
	int idno;
}

class performance extends Student
{
	float cpi;
	performance()
	{
		get_data();
	}
	void get_data()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name,idno and cpi of student:");
		this.name=input.nextLine();
		this.idno=input.nextInt();
		this.cpi=input.nextFloat();
	}
	void display()
	{
		System.out.println("Name: "+name+"  idno: "+idno+"  cpi: "+cpi);
	}
}

class performance_main
{
	public static void main(String [] args)
	{
		System.out.println("Enter no of students:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		performance []p=new performance[n];
		int max=0;
	
		for(int i=0;i<n;i++)
		{
			p[i]=new performance();
		}
	
		for(int i=0;i<n;i++)
		{
			if(p[i].cpi>p[max].cpi)
			{
				max=i;
			}
		}
	
		System.out.println("Student(s) with maximum CPI:");
		p[max].display();
		for(int i=0;i<n;i++)
		{
			if((i!=max)&&(p[i].cpi==p[max].cpi))
			{
				p[i].display();
			}
		}
	}
}