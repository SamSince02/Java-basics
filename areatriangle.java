import java.util.Scanner;

public class areatriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of base and height of the triangle : ");
        int base = in.nextInt();
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is : " + area);
    }
}
