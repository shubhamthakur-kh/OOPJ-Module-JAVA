import java.util.*;

/*
Problem 9: Event Attendance Counter 
Use Case: Count unique attendees at an event, handling duplicate check-ins. 
Requirements: 
● Record attendee names 
● Count only unique attendees 
● Handle duplicate entries 
Sample Input: 
Attendees: "Amit", "Rohan", "Amit", "Priya" 
Expected Output: 
Total unique attendees: 3 
*/
class EventQ9{
	public static void main(String args[]){	
			Set<String> s1 = new HashSet<>();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many records: ");
			int count = sc.nextInt();
			sc.nextLine();
			
			for(int i=1;i<=count;i++){
				System.out.print("Enter name " + i + " : " );
				String name = sc.nextLine().trim();
				if(!name.isEmpty()){
					s1.add(name);
				}else{
					System.out.println("Invalid Name.");
				}
			}
			System.out.println("Total unique attendees: " + s1.size());
		}
	}
/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java EventQ9
Enter how many records:
4
Enter name 1 : Amit
Enter name 2 : Rohan
Enter name 3 : Amit
Enter name 4 : Priya
Total unique attendees: 3
*/