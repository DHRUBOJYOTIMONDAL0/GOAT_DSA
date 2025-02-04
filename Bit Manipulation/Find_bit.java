import java.util.Scanner;

public class Find_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the position of the bit you want to find");
        int position = sc.nextInt();
        int mask = 1 << position;
        int bit  = n & mask;
        if(bit == 0){
            System.out.println("The bit is 0");

        }
        else{
            System.out.println("The bit is 1");
        }

    }
    
}
