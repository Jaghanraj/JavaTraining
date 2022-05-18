package collectionsEgTry;

import java.util.LinkedList;

public class LinkedListTry {
	void LinkedListEg()
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(1);
		linkedList.add(4);
		System.out.println(linkedList); //Insertion order is maintained
		
		 linkedList.addFirst(0);  //To add a new element in first
		 System.out.println(linkedList);
		
		 linkedList.removeFirst();
		 System.out.println(linkedList); //to remove first , o remove last .removeLst();
		 
		 //We can also use poll to delete first element
		 
		 linkedList.poll();
		 System.out.println(linkedList); //Also to delete last we use pollLast();
		 
		 //We can also remove by value
		 
		 linkedList.removeLastOccurrence(4);
		 System.out.println(linkedList);
	}

	public static void main(String[] args) {
		LinkedListTry oLinkedListTry = new LinkedListTry();
		oLinkedListTry.LinkedListEg();
		 

	}

}
