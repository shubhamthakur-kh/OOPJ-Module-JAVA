/*
Problem 28: Department Employee Mapping 
Use Case: Organize employees by department for HR management. 
Requirements: 
● Map departments to employee lists 
● Group employees by department 
● Display departmental structure 
Sample Input: 
Department mapping: "IT" → ["Amit", "Rohan"], "HR" → ["Priya"] 
Expected Output: 
Department Structure: IT: Amit, Rohan; HR: Priya
*/
import java.util.*;
class EmployeeQ28{
	public static void main(String args[]){
		Map<String, List<String>> m1 = new HashMap<>();
		
		m1.put("IT", new ArrayList<>(Arrays.asList("Amit", "Rohan")));
		m1.put("HR", new ArrayList<>(Collections.singletonList("Priya")));
		
		System.out.print("Department Structure: ");
		for(Map.Entry<String, List<String>> e : m1.entrySet()){
			System.out.print(e.getKey() + ": ");
			System.out.print(String.join(", ", e.getValue()) + "; ");
		}
	}
}

/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java EmployeeQ28
Department Structure: HR: Priya; IT: Amit, Rohan;
*/