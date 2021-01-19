// Array list - for each loop
// Lab Program - 2
// Date - 04/11/2020

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

class array_list_main{
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("Using For Each: ");
		
		for(Integer i: al){
			System.out.println(i);
		}
		
		System.out.println("Using simple for: ");
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		al.set(2, 301);
		
		al.remove(4);
		
		System.out.println("After set and remove: ");
		
		for(Integer i: al){
			System.out.println(i);
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting: ");
		
		for(Integer i: al){
			System.out.println(i);
		}
		
		Integer []arr = new Integer[al.size()];
		
		al.toArray(arr);
		
		System.out.println("After toArray(): ");
		
		for(Integer i: arr){
			System.out.println(i);
		}
		
		ArrayList<String> al_str = new ArrayList<String>();
		
		al_str.add("Deepnil");
		al_str.add("Rohan");
		al_str.add("harsh");
		al_str.add("ketul");
		al_str.add("ankur");
		
		System.out.println("Using For Each: ");
		
		for(String s: al_str){
			System.out.println(s);
		}
		
		System.out.println("Using For Iterator: ");
		
		Iterator<String> it = al_str.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}