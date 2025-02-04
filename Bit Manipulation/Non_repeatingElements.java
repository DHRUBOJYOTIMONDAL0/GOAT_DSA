import java.util.Scanner;

public class Non_repeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the arrat: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int res = 0; 
        for (int i =0; i<n; i++){
            res = res ^ arr[i];
            
        }
        System.out.println("The non-repeating element is: " + res);
    }
}
