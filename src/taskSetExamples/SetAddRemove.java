package taskSetExamples;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class  SetAddRemove 
{
	void RemoveType()  // 1.To remove a separate element
	{

	Set <String> oSet = new HashSet<String>();	
	oSet.add("Dhoni");
	oSet.add("Raina");
	oSet.add("Mahi");
	oSet.add("Ruturaj");
	oSet.add("Rayudu");
	System.out.println("IPL players names :" +oSet);
	
	oSet.remove("Mahi");	 
	System.out.println("After using Remove method :" +oSet);
	}	 
	
	void CompareAndRemove() // 2.To compare and remove multiple elements which are required(//take collection and remove)
	{
		Set <String> oSet = new HashSet<String>();	
		oSet.add("CSK");
		oSet.add("RCB");
		oSet.add("MI");
		oSet.add("KKR");
		oSet.add("SRH");
		 
		ArrayList<String> oArray= new ArrayList<String>();	 
		oArray.add("KKR");
		oArray.add("SRH");
		System.out.println("\nElements entered to remove :" +oArray);
		oSet.removeAll(oArray);
		System.out.println("After comparing and removed :" +oSet);
	}
	
	void RemoveByIndex()  // 3.To remove the value by using Index Character
	{
		Set <String> oSet = new HashSet<String>();
		oSet.add("Dhoni");
		oSet.add("Chahar");
		oSet.add("Warner");
		oSet.add("Jadeja");
		oSet.add("Jason");
		
		System.out.println("\nThe index given for Remove is 'J'");
		oSet.removeIf(n -> (n.charAt(0) == 'J'));
		 for (String Name : oSet) {
	            System.out.println(Name);
		 }	
	}
	void RemoveAllElements()     // 4.To remove entire elements
	{
		Set <String> oSet = new HashSet<String>();	
		oSet.add("CSK");
		oSet.add("RCB");
		oSet.add("MI");
		oSet.add("KKR");
		oSet.add("SRH");	
		
		System.out.println("\nShowing elements which are added :" +oSet);		
		oSet.removeAll(oSet);
		System.out.println("After removing all elements :" +oSet);
	}

}
