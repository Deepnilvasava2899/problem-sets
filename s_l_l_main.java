class s_l_l
{
int info;
s_l_l next;

s_l_l ()
{
	info = 0;
	next=null;
}
s_l_l(int n)
{
	info=n;
	next=null;
}
void append(s_l_l new_node_ref)
{
	s_l_l trav_ref=this;
	while(trav_ref.next!=null)
	{
		//s1
		trav_ref=trav_ref.next;
		
	}
	trav_ref.next=new_node_ref;
}	


void traverse()
{
	s_l_l trav_ref=this;
	while(trav_ref!=null)
	{
		System.out.println(trav_ref.info);
		trav_ref=trav_ref.next;
		
	}
}
void search(int value)//that searches the list for node of epcific value
	{
		s_l_l trav_ref=this;
			while(trav_ref!=null)//one becoming null and other the value 
			{
				if(trav_ref.info==value)
				{
					System.out.println("the given value is therein the linked list"+value);
					break;
					
					
				}
				trav_ref=trav_ref.next;
			}
			if (trav_ref!=null)
			{
				System.out.println("the value not found");
			}//all nodes are to be traversed
	}
	
	//write a member containing a delete node function
	
}
class s_l_l_main
{
	public static void main(String [] s)
	{
		s_l_l first_ref= new s_l_l(5);
		s_l_l node_to_add_ref = new s_l_l(7);
		first_ref.append(node_to_add_ref);
		node_to_add_ref=new s_l_l(9);
		first_ref.traverse();
		
	}//end of main

}