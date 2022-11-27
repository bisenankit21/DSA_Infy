package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOccurance {
	public static Map<Character, Integer> findOccurrences(String input) {
        //Implement your logic here and change the return statement accordingly
		HashMap<Character,Integer> charCounter=new HashMap<Character,Integer>();
		//input=input.replaceAll("//s","");
		char[] ch=input.toCharArray();
		for(char c:ch) {
			if(charCounter.containsKey(c)) {
				charCounter.put(c, charCounter.get(c)+1);
			}
			else {
				charCounter.put(c, 1);
			}
		}
		
        return charCounter;
	}
	
	public static void main(String args[]) {
		
		String input ="I love java";
		Map<Character, Integer> occurrenceMap = findOccurrences(input);
		
		System.out.println("Occurrences of characters\n=======================");
		for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}


}
