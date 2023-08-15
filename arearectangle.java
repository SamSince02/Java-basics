import java.util.Scanner;

public class arearectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of length and breadth of the rectangle : ");
        int len = in.nextInt();
        int bre = in.nextInt();
        long area = (long) len * bre;
        System.out.println("Area of rectangle is : " + area);
    }
}
