package arrayList_Using_Generic;
import java.util.ArrayList; // Importing the ArrayList class
import java.util.Collection;
import java.util.List;

public class Tryout1 {
	public static void main(String[] args) {
		List<String> food = new ArrayList<String>(); // Creating a list of String elements
		food.add("Pizza"); // Adding elements
		food.add("Burger");
		food.add("Pasta");
		food.add("Sandwich");
		System.out.println("Food items: " + food);
	}

}
