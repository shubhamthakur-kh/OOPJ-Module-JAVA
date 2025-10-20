import java.util.Scanner;
class Shop8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase amount :");
		int amt = sc.nextInt();
		
		double finalamt= (amt > 1000)? amt * 0.90 : amt;
        System.out.println("Final cost after discount : " +finalamt);
	}
}