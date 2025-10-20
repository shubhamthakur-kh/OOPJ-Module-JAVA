import java.util.Scanner;
class Grade11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter percentage marks :");
		int marks = sc.nextInt();
		
		if(marks >= 90){
			System.out.println("Grade: A+");
		}else if(marks >= 76){
			System.out.println("Grade: A");
		}else if(marks >= 66){
			System.out.print("Grade: B");
		}else if(marks >= 51){
			System.out.println("Grade: C");
		}else if(marks >= 36){
			System.out.println("Grade: D");
		}else{
			System.out.println("Grade: Fail");
		}
	}
}