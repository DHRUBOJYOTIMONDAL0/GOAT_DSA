import java.util.Scanner;

public class Convert_bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int xor = num1 ^ num2;
        int count = 0;
        int position = 0;
        
        System.out.print("Positions of bits to flip: ");
        while (xor != 0) {
            if ((xor & 1) == 1) {
                System.out.print(position + " ");
                count++;
            }
            xor >>= 1;
            position++;
        }
        
        System.out.println("\nNumber of bits to flip to convert " + num1 + " to " + num2 + " is: " + count);
        
        scanner.close();
    }
}