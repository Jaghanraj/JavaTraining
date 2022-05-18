package collectionsEgTry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTry {
	
	void ArrayElements()
	{
		List<String> arrayList = new ArrayList<String>();
		arrayList.add( "Jaghan");
		arrayList.add("Raj");
		arrayList.add("Jaga");
		arrayList.add("hello");
		arrayList.add("Jaga");
		arrayList.add(null);
		arrayList.add(null);
		System.out.println(arrayList);  //To print the elements
		
		System.out.println(arrayList.get(0)); //To get the element from index
		
		System.out.println(arrayList.indexOf("Jaga")); //To search the index value
		
		System.out.println(arrayList.lastIndexOf("Jaga"));
		
		System.out.println(arrayList.indexOf("Thor")); //If enter the unpresent values
		
		List<String> newList = new ArrayList<String>();
		newList.addAll(arrayList);
		System.out.println(newList);
		
		 newList.clear(); //To Delete the elements present in arrray
		 System.out.println(newList);
		 
		 arrayList.remove(0);  //To delete a selected element
		 System.out.println(arrayList);
		 
		 arrayList.set(0, "Tony");  //To add a element to the index we want
		 System.out.println(arrayList);
		 
		 System.out.println(arrayList.isEmpty()); //To check the array is empty or not
		
		 //1.Itterate method 
		 for(String string :arrayList)
		 {
			 System.out.println(string);
		 }
		
		 System.out.println();
		 //2.Using List itterator (Both forward and Reverse)
		 ListIterator<String> iterator = arrayList.listIterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
		 
		 System.out.println();
		 //3.for Reversing
		 while(iterator.hasPrevious()) {
			 System.out.println(iterator.previous());
		 }
		 
		 System.out.println();
		 //4.Normal itterator
		 Iterator<String> iterator1 =  arrayList.iterator();
		 while(iterator1.hasNext()) {
			 System.out.println(iterator1.next());
		 }
		
	}

	public static void main(String[] args) {
		ArrayListTry oArrayListTry = new ArrayListTry();
		oArrayListTry.ArrayElements();
		 

	}

}
