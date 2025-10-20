import java.util.Scanner;
class HighestOf3{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary for company 1 :");
		int sal1 = sc.nextInt();
		System.out.print("Enter salary for company 2 :");
		int sal2= sc.nextInt();
		System.out.print("Enter salary for company 3 :");
		int sal3 = sc.nextInt();
		
		if(sal1 > sal2 && sal1 > sal3){
			System.out.println("Company 1 offers the highest salary");
		}else if(sal2 > sal1 && sal2 > sal3){
			System.out.println("Company 2 offers highest salary");
		}else{
			System.out.println("Company 3 offer highest salary");
		}
	}
}