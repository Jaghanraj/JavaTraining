package taskSetExamples;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class InsertionSet {
	public void HashSet()    // 1.HashSet will display according to the Hashcode values of elements
	{
		 Set<String> ohashSetEg = new HashSet<String>();
		 ohashSetEg.add("charlie");
		 ohashSetEg.add("Max");
		 ohashSetEg.add("Oscar");
		 ohashSetEg.add("Teddy");
		 ohashSetEg.add("Leo");
		  System.out.println("Hash Set insertion elements :"+ohashSetEg);
	}
	public void LinkedSet()   // 2.LinkedSet will display in the order which is given
	{
		 Set<String> olinkedSetEg = new LinkedHashSet<String>();
		 olinkedSetEg.add("charlie");
		 olinkedSetEg.add("Max");
		 olinkedSetEg.add("Oscar");
		 olinkedSetEg.add("Teddy");
		 olinkedSetEg.add("Leo");
		 System.out.println("Linked Hash Set insertion elements :"+olinkedSetEg);
	}
	public void TreeSetEg()   //3.TressSet will defaultly change the order to asscending and display.  
	{
		 Set<String> otreesetEg = new TreeSet<String>();
		 otreesetEg.add("charlie");
		 otreesetEg.add("Max");
		 otreesetEg.add("Oscar");
		 otreesetEg.add("Teddy");
		 otreesetEg.add("Leo");
		 System.out.println("Tree Set insertion elements :"+otreesetEg );
		 
	}

}
