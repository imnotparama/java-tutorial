import java.util.Scanner;

public class keyboard_input {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the val of A : ");
        a = console.nextInt();
        System.out.print("Enter the val of B : ");
        b = console.nextInt();
        c = a + b;
        System.out.println("The sum of A and B is " + c);
    }

}
