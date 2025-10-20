import java.util.Scanner;
class Greatest{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter score for Test 1 : ");
	int test1 = sc.nextInt();
	System.out.print("Enter score for Test 2 : ");
	int test2 = sc.nextInt();
	
	String result = (test1 > test2) ? "Test 1 Has Higher Score" : "Test 2 Has Higher Score";
	System.out.print(result);
	}
}