import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int number[] = new int[n];
        int small = Integer.MAX_VALUE;
        System.out.print("Enter your numbers: ");
        for(int i = 0; i<n; i++){
            number[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(number[i] < small) small = number[i];
        }
        System.out.println(small);

    }
}
