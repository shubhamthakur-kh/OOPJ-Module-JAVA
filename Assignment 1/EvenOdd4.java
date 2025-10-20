import java.util.Scanner;
class EvenOdd4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter locker room :");
		int lno = sc.nextInt();
		
		String result =(lno % 2 ==0) ? "Even Locker number" : "Odd Locker Number";
		System.out.println(result);
	}
	
}