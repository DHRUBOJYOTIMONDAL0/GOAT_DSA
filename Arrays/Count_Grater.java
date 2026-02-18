import java.util.Scanner;

public class Count_Grater {
    public static int CountGrater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + "array elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of X: ");
        int x = sc.nextInt();

        int count = CountGrater(arr, x);
        System.out.print("Count of elements grater then: " + x + ": " + count);
    }

}
