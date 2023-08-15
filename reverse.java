import java.awt.*;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            int rem = n%10;
            if (ans == 0){
                ans = rem;
            }
            else{
                ans = ans *10+rem;
            }
            n = n/10;
        }
        System.out.println("Reverse of the given number is : "+ ans);
    }
}
