package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAssignment_1 {
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		ArrayList<String> names=new ArrayList<String>();
		for(String str:sales.keySet()) {
			if(names.size()==0) {
				names.add(str);
			}
			else {
				int i=names.size();
				int sale=sales.get(str);
				for(int j=names.size()-1;j>=0;j--) {
					if(sale<=sales.get(names.get(j))) {
						break;
					}
					else {
						i--;
					}
				}
				names.add(i, str);
			}
			
		}
		
		return names;
	} 

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}
