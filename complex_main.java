class complex
{
int r;
int i;
complex()//default constructor
	{
		r=i=0;
	}
complex(int d_r,int d_i)//it will return the reference of class complex(calling by value)
	{
		i=d_i;
		r=d_r;
		
	}
	complex add_complex(complex d_c2)//this is dummy reference to class)//it will return reference of class complex
	//how many arguements -> one arguement because of member method (calling the object)
	{
		//first we need to create one object
		complex result_ref =new complex();//we are making in java so this way we are making object
		result_ref.r=r+d_c2.r;//this for r
		result_ref.i=i+d_c2.i;//this for i
		d_c2.r=0;
		d_c2.i=0;
		return(result_ref);
	}
	/* public String display()
	{
		return d_r+"i"+d_i;
	}*/
}
class complex_main
{
	public static void main(String [] s)
	{
		complex c1_ref = new complex(5,4);//object 1
		complex c2_ref = new complex(2,5);//object 2
		complex result;
		result=c1_ref.add_complex(c2_ref);
		System.out.println("ANS :- "+result.r+" +i"+result.i);//display the result
		System.out.println();//00will be displayed
	}//end main
}
