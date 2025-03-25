import java.util.Scanner;
public class reverseNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int message = Integer.valueOf(scanner.nextLine());
		int rev = 0;
		
		while (message != 0){
			int rem = message%10;
			rev = rev*10+rem;
			message=message/10;
		}
		
		System.out.println(rev);

	}
}