import java.util.Scanner;
public class teco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in C:");
        float a = input.nextFloat();
        float c = a * (float)(1.8) + (float)(32);
        System.out.println("Temperature in F is: " + c );
    }
}
