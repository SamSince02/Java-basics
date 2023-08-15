import com.sun.source.util.TreeScanner;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        int salary = 20000;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Work Experience : ");
        int workexp = in.nextInt();
        if (workexp==5){
            salary += 5000;
        }
        else if (workexp>5){
            salary += 10000;
        }
        else{
            System.out.println("Sorry!You need to earn more experience to earn a hike in your salary.");
        }
        System.out.println("Your Salary is " + salary);
    }
}
