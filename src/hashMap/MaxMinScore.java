package hashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
    	Map<String, Double> maxMinMark = new HashMap<String, Double>();
    	double maxMark=0;
    	double minMark=100;
    	String maxi="";
    	String mini="";
    	for(String key:studentMarks.keySet()) {
		      if(maxMark<studentMarks.get(key)) {
				// maxMinMark.put(key,studentMarks.get(key));
		    	  maxMark=studentMarks.get(key);
		    	  maxi=key;
				  } 
			  else if(minMark>studentMarks.get(key)) {
           // maxMinMark.put(key,studentMarks.get(key));
				  minMark=studentMarks.get(key);
				  mini=key;
			  }
			 }
    	
    	//System.out.println(maxMark+" "+minMark);
    	//System.out.println(maxi+" "+mini);
    	maxMinMark.put(maxi, maxMark);
    	maxMinMark.put(mini, minMark);
		return maxMinMark;
	}

}
public class MaxMinScore {
	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}

}
