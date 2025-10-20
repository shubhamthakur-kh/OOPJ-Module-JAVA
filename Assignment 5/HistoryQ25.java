/*Problem 25: Command History Tracker 
Use Case: Store recent commands in a terminal with limited history. 
Requirements: 
● Maintain last 3 commands 
● Remove oldest when limit exceeded 
● Display recent commands 
Sample Input: 
Commands: "ls", "pwd", "cd ..", "mkdir" 
History limit: 3 
Expected Output: 
Recent Commands: pwd, cd .., mkdir
*/
import java.util.*;
class HistoryQ25{
	public static void main(String args[]){
		final int history_limit = 3;

		Queue<String> q1 = new LinkedList<>();
		
		String[] commands = {"ls", "pwd", "cd..", "mkdir"};
		
		for(String cmd : commands ){
			if(q1.size() == history_limit){
				q1.poll();
			}
		  q1.add(cmd);
		}
		
		
		System.out.print("Recent Commands: ");
		for(String cmd : q1){
			System.out.print(cmd + ", ");
		}
	}
}
/*
C:\Users\Admin\OneDrive\Documents\CDAC\CDAC Codes\OOP With java\Assignment 5>java HistoryQ25
Recent Commands: pwd, cd.., mkdir,
*/