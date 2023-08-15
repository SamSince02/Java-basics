import java.util.Scanner;

public class areacircle {
    public static final double pi = 3.14;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of r of the circle : ");
        int r = in.nextInt();
        double area = pi * r * r;
        System.out.println("area of circle is : " + area);
    }
}
