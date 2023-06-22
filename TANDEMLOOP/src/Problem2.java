import java.util.Scanner;

public class Problem2 
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = scan.nextInt();
 
        for (int i = 1; i <= a; i++) {
            System.out.print((2 * i - 1));
            if (i < a) {
                System.out.print(",");
            }
        }
    }

}
