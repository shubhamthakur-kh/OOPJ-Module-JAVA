import java.util.Scanner;
class BankTRansac3{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter transaction amount :");
		int amt = sc.nextInt();
		
		String result = (amt > 0) ? "Deposit transaction" : "Withdrawal transaction";
		System.out.println(result);
	}
}