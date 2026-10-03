import java.util.Scanner;

public class keyboard_input {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the val of A : ");
        a = obj.nextInt();

        System.out.print("Enter the val of B : ");
        b = obj.nextInt();

        c = a + b;
        System.out.println("The sum of A and B is " + c);

        obj.close();    // Close the scanner
    }
}