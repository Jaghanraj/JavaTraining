package packageRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayEg {

	 void enterColors() {
		 
		 List<String> list = new ArrayList <String>();
		 list.add("blue");
		 list.add("green");
		 list.add("yellow");
		 list.add("red");
		 list.add("brown");
		 System.out.println(list);
		  
		 //to add a new element
		 list.add(0,"Violet");
		 
		/* //to remove by index value
		 list.removeIf(n -> (n.charAt(0) == 'y'));
		 System.out.println(list);
		 
		 //to show by index
		 System.out.println(list.subList(0, 2));
		 
		 //to remove by element
		 System.out.println(list.remove("blue"));
		 System.out.println(list);
		 
		 //remove by index
		 list.remove(2);  
		 System.out.println(list); */
		 
		 //to find element present or not
		//System.out.println(list.contains("jaghan"));
		 
		 //to print in assending order
		 //  Collections.sort(list);
		   //System.out.println(list);
		 
		 //create new list and copy to that
	/*	 List<String> list1 = new ArrayList <String>();
		 list1.addAll(list);
		 System.out.println(list1); */
		 
		 //ITTERATOR TECNIQUES = 4 types
		 // 1.using foreach
       /*	  for (String string : list) {
	      System.out.println(string); */
		 
		   // 2.using for loop
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); */
		 
		 
		 // 3.using  iterator
/*		 Iterator <String> iterator = list.iterator();			
		  while(iterator.hasNext()) {
				String array = iterator.next();
				System.out.println(array);
				} */
	
			
			// 4.using list iterator
	/*		ListIterator<String> oiterator = list.listIterator();
			while(oiterator.hasNext()) {
				System.out.println(oiterator.next()); */
			}
		}
		


			
		
		
			
		
	


