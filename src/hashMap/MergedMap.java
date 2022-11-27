package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MergedMap {
	 public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
	        //Implement your logic here and change the return statement accordingly
		 // Map<String, Integer> merged=new HashMap<String, Integer>();
		  //merged.putAll(mapOne);
		  for(Entry<String, Integer> entry:mapTwo.entrySet()) {
			  if(mapOne.get(entry.getKey())==null) {
				  mapOne.put(entry.getKey(), entry.getValue());
			  }
			  else if(mapOne.get(entry.getKey())!=entry.getValue()) {
				  mapOne.put(entry.getKey()+"New", entry.getValue());
			  }
			  else {
				  mapOne.put(entry.getKey(), entry.getValue());
			  }
		  }
			  
		  
			return mapOne;
		}

		public static void main(String args[]) {
			Map<String, Integer> mapOne = new HashMap<String, Integer>();
			mapOne.put("Kelly", 10);
			mapOne.put("Micheal", 20);
			mapOne.put("Ryan", 30);
			
			Map<String, Integer> mapTwo = new HashMap<String, Integer>();
			mapTwo.put("Jim", 15);
			mapTwo.put("Andy", 45);

			Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

			System.out.println("Merged Map\n===========");
			for (Entry<String, Integer> entry : mergedMap.entrySet()) {
				System.out.println(entry.getKey()+" -- "+entry.getValue());
			}
		}

}
