import java.util.Scanner;

public class CountOcc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of number : ");
        int num = in.nextInt();
        System.out.print("Enter the value to which occurrence needs to found out : ");
        int n = in.nextInt();
        int count=0;  //count of the occurrence
        while(num>0){
            int rem = num%10;
            if(rem == n){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
