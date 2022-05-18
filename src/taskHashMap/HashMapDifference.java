package taskHashMap;
 import java.util.*; 

public class HashMapDifference {
	void HashMap()
	{
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		 map.put(2030,"Ironman");
		 map.put(2028,"Spiderman");
		 map.put(2029,"doctorStrnge");
		 map.put(1000,"Thanos");
		 map.put(1001,"Thor");
		 System.out.println("HashMap Values :" +map);
		 
		 HashMap<Integer, String> duplicateMap = new HashMap<Integer, String>();
		 duplicateMap.putAll(map);
		 System.out.println("Duplicate values are :" +duplicateMap);
		 
		 duplicateMap.clear();
		 System.out.println("Duplicate values are :" +duplicateMap);
		 
		 System.out.println("To see key is present or not :" +map.containsKey(2030));
		 
		 System.out.println("To see value is present or not :" +map.containsValue("Thanos"));
		 
		 System.out.println("Check map is empty or not :" +map.isEmpty());
	}
	
	 
	void LinkedHashMap()
	{
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		 map.put(2030,"Ironman");
		 map.put(2028,"Spiderman");
		 map.put(2029,"doctorStrange");
		 map.put(1000,"Thanos");
		 map.put(1001,"Thor");
		 System.out.println("LinkedHashMap Values :" +map);
		 
	}
	void TreeMap()
	{		 
		 TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		 try {
		 map.put(2030,"Ironman");
		 map.put(2028,"Spiderman");
		 map.put(2029,"doctorStrange");
		 map.put(1000,"Thanos");
		 map.put(1001,"Thor"); 
		 map.put(null, "Tony");		
		 }catch(NullPointerException npe) {
			 System.out.println("\nNull values are not allowed");
		 }
		 
		 System.out.println("\nTreeMap before Descending :");
		 Set<Integer> set = map.keySet();
		 Iterator<Integer> itr = set.iterator();
	        while (itr.hasNext()) {
	            Integer key = itr.next();
	            System.out.println(key + " "+ map.get(key));
	        }
		 System.out.println();
		 System.out.println("TreeMap after Descending :");
		 NavigableMap<Integer, String> reverseMap  =  map.descendingMap();
		 for(@SuppressWarnings("rawtypes") Map.Entry m:reverseMap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		} 
		 
		 

}
}

