import java .util.Scanner;
class Bonus9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary :");
		int sal = sc.nextInt();
		System.out.print("Enter years of service :");
		int exp = sc.nextInt();
		
		if(exp > 5){
		double bonus =(sal*0.05);
		System.out.println("Bonus amount : " +bonus);
	}
	}
}