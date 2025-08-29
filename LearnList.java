

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
         public static void main(String[] args) {
		
        
		List<String> learners =new ArrayList<String>();
		
		
		System.out.println("Empty list: "+learners);
		
		
		learners.add("Karthik");
		System.out.println("List with 1 element: "+learners);
		
		
		learners.add("Siva");
		learners.add("Arun");
		learners.add("Vinoth");
		
	    System.out.println("List with multiple elements:"+learners);
		
		
		
		
		
		learners.add(1, "Kathir");
		
		
		System.out.println("Current List: "+learners);
		
		
		
		int sizeOfList = learners.size();
		System.out.println("List Size: "+sizeOfList);
		
		//Add duplicate
		learners.add("Siva");
		System.out.println("List after adding duplicate: "+learners);
		
		//Removing an element
		learners.remove(2);
		
		System.out.println("List after removing Siva: "+learners);
		
		//Contains method
		boolean contains = learners.contains("kathir");
		System.out.println("Present or not: "+contains);
		
		//To retrieve a particular element
		String index2 = learners.get(2);
		System.out.println("secondElement :"+index2);
		
		//Clear all the data
		learners.clear();
		System.out.println("Current list: "+learners);
		
		//Adding elements from one list to another
		List<String> employees =new ArrayList<String>();
		System.out.println("Empty List: "+employees);
		employees.addAll(learners);
		System.out.println("Current employess List: "+employees);
		
	}
	
}
