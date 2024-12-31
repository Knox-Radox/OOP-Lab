import java.util.Scanner;
public class factorial{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int message = Integer.valueOf(scanner.nextLine());
		int fact = 1;
		for (int i=message; i>1; i--){
			fact = fact*i;
		}
		System.out.println(fact);

	}
}