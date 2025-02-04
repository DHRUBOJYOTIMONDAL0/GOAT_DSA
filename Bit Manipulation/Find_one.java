import java.util.Scanner;

public class Find_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            count += num & 1;
            num = num >> 1;
        }
        System.out.println("Number of 1's in the binary representation of the number is: " + count);
    }
}
