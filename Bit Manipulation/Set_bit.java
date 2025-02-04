import java.util.Scanner;

public class Set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the position of the bit you want to set");
        int position = sc.nextInt();
        int mask = 1<< position;
        int bit = n | mask;
        System.out.println("The number after setting the bit is: " + bit);
    }
    
}
