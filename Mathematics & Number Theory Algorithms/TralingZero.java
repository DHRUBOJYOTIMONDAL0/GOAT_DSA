import java.util.Scanner;

public class TralingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int res= 0;
        for(int i=5; i<=n; i= i*5){
            res = res + n/i;

        }
        System.out.println("The number of trailing zeros in the factorial of the number is: " + res);
    }
}
