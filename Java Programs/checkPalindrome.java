import java.util.Scanner;
public class checkPalindrome{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter String: ");
    String str = scanner.nextLine();
    boolean flag = true;

    str = str.toLowerCase();
    for (int i=0; i<str.length()/2; i++){
      if (str.charAt(i) != str.charAt(str.length()-i-1)){
        flag = false;
      }
    }
    if (flag){
        System.out.println("It is a Palindrome");

    }else{
        System.out.println("It is not a Palindrome");
     }
  }
}
