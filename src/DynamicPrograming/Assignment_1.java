package DynamicPrograming;
import java.util.ArrayList;
import java.util.List;
public class Assignment_1 {
	 static int count=0;
	// static int j=0;
	    
		public static void findWordSegments(List<String> wordsList, String inputString) {
	       //Implement your logic here
			int j=0;
			//System.out.println(inputString.length());
			for(int i=0;i<=inputString.length();i++) {
				String prefix=inputString.substring(j,i);
				
			    if(wordsList.contains(prefix)){
			    	//System.out.println(prefix);
			    	count++;
			    	j=i;
			    }
			    
		   }
		}
		public static void main(String[] args){
		    List<String> wordsList = new ArrayList<String>();
		    wordsList.add("i");
		    wordsList.add("like");
		    wordsList.add("pizza");
		    wordsList.add("li");
		    wordsList.add("ke");
		    wordsList.add("pi");
		    wordsList.add("zza");

			String inputString = "ilikepizza";
			findWordSegments(wordsList, inputString);
			System.out.println("Number of segments: "+count);
		}

}
