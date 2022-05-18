package taskSetExamples;

public class AddRemoveRunner {

	public static void main(String[] args) {
		  SetAddRemove oSetAddRemove = new SetAddRemove();
		  oSetAddRemove.RemoveType();
		  oSetAddRemove.CompareAndRemove();
		  oSetAddRemove.RemoveByIndex();
		  oSetAddRemove.RemoveAllElements();
		  
		  
		  //InsertionSetEg
		  System.out.println("\nProgram to show the different insertion methods");
		  InsertionSet oInsertionSet = new InsertionSet();
		  oInsertionSet.HashSet();
		  oInsertionSet.LinkedSet();
		  oInsertionSet.TreeSetEg();
		  
		 
	}

}
