/* Lab 14_B : arraylist demonstration */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class arraylist_example
{
	public static void main(String []s)
	{
		ArrayList<Integer> a_l_ref=new ArrayList<Integer>();
		
		a_l_ref.add(5);
		a_l_ref.add(20);
		a_l_ref.add(10);
		a_l_ref.add(10);
		a_l_ref.add(25);
		
		System.out.println("--- Array List (Using conventional method) ---");
		
		for(int i=0;i<a_l_ref.size();i++)
		{
			System.out.println(a_l_ref.get(i));
		}
		
		System.out.println("--- Array List (Using each-for loop) ---");
		
		for(Integer i:a_l_ref)
		{
			System.out.println(i);
		}
		
		a_l_ref.set(2,15);
		a_l_ref.remove(3);

		System.out.println("--- Array List (after set and remove) ---");
		
		for(Integer i:a_l_ref)
		{
			System.out.println(i);
		}
		
		Collections.sort(a_l_ref);

		System.out.println("--- Array List (after sorting) ---");
		
		for(Integer i:a_l_ref)
		{
			System.out.println(i);
		}
		
		Integer []i_ref=new Integer[a_l_ref.size()];
		a_l_ref.toArray(i_ref);

		System.out.println("--- After toArray ---");
		
		for(Integer i:i_ref)
		{
			System.out.println(i);
		}
		
		ArrayList<String> a_l_ref1=new ArrayList<String>();
		
		System.out.println("--- Array List of strings ---");
		
		a_l_ref1.add("a");
		a_l_ref1.add("b");
		a_l_ref1.add("c");
		a_l_ref1.add("d");
		a_l_ref1.add("e");
	
		for(String i: a_l_ref1)
		{
			System.out.println(i);
		}
		
		System.out.println("--- Iterator ---");
		Iterator<String> it_ref=a_l_ref1.iterator();
		
		while(it_ref.hasNext())
		{
			System.out.println(it_ref.next());
		}
	}
}