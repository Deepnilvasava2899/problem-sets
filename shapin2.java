abstract class shape{
   
	double area;
	abstract void area(int n1, int n2);
	void disp(){
		System.out.println("Area : "+area);
   }
}

class triangle extends shape
{
	void area(int b,int h)
	{
		area =  0.5*b*h;
	}
}

class rectangle extends shape{
	void area(int l,int w)
	{
		area =  l*w;
	}
}
class shapin2
{
	
   public static void main(String args[]){

		triangle c1 = new triangle();
		c1.area(2,3);
		c1.disp();
		
		rectangle r1 = new rectangle();
		r1.area(2,3);
		r1.disp();
   }
}
