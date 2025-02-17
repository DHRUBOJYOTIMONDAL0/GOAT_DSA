import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;
        while(number != 0){
            int digit = number%10;
            reverse = reverse*10 + digit;
            number = number/10;
        }
        if(original == reverse){
            System.out.println("The number is a palindrome number:" + original);
        }
        else{
            System.out.println("The number is not a palindrome number:" + original);
        }

    }
    
}
