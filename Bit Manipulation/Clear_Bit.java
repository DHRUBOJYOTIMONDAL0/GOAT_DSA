import java.util.Scanner;

public class Clear_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the position of the bit you want to clear");
        int position = sc.nextInt();
        int mask  = 1<< position;
        int bit = n & ~ mask;
        System.out.println("The number after clearing the bit is: " + bit);
    }
    
}
