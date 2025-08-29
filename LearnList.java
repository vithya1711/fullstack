import java.util.ArrayList;
import java.util.List;
public class LearnList{
public static void main(String[]args){
List<String> learners =new
ArrayList<String>();
System.out.println("Empty list:"+learners);
learners.add("Karthik");
System.out.println("List with 1 element: "+learners);
		learners.add("Siva");
		learners.add("Arun");
		learners.add("Vinoth");
		
	    System.out.println("List with multiple elements:"+learners);
		
		//Index from 0
		// 0 - karthik
		// 1 - Siva
		// 2 - Arun
		// 3 - Vinoth
		
		//adding an element using index
		
		learners.add(1, "Kathir");
		// 0 - karthik
		// 1 - Kathir
		// 2 - Siva
		// 3 - Arun
		// 4 - Vinoth
		//Current List: [Karthik, Kathir, Siva, Arun, Vinoth]
		System.out.println("Current List: "+learners);
		int sizeOfList = learners.size();
		System.out.println("List Size: "+sizeOfList);
		learners.add("Siva");
		System.out.println("List after adding duplicate: "+learners);
		learners.remove(2);
		
		System.out.println("List after removing Siva: "+learners);
		boolean contains = learners.contains("kathir");
		System.out.println("Present or not: "+contains);
		String index2 = learners.get(2);
		System.out.println("secondElement :"+index2);
		
		learners.clear();
		System.out.println("Current list: "+learners); L     
		List<String> employees =new ArrayList<String>();
		System.out.println("Empty List: "+employees);
		employees.addAll(learners);
		System.out.println("Current employess List: "+employees);
		
	}
	
}

