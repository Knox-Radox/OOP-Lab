import java.util.Scanner;

public class SimplePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter pyramid height: ");
        int height = scanner.nextInt();
        int i = 1;

        while (i <= height) {
            int j = 1;
            while (j <= i) {
                System.out.print("* "); 
                j++;
            }
            System.out.println(); 
            i++;
        }

        scanner.close();
    }
}
