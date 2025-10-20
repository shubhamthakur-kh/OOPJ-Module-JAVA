import java.util.Scanner;
class Square5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int length = sc.nextInt();
		System.out.print("Enter breadth : ");
		int breadth = sc.nextInt();
		
		String result =(length == breadth)? "Square Garden" : "Rectangle Garden";
		System.out.println(result);
		
	}
}