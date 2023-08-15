import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = input.nextInt();
        System.out.print("Enter the value of b :");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("Sum of two numbers is : " + c);
    }
}
