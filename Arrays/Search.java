import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.print("Enter marks of Students: ");
        
        for(int i = 0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print    ("Which number you want to find: ");
        int x = sc.nextInt();
        for(int i = 0; i<n; i++){
            if(numbers[i] == x){
                System.out.println("X found at index: " + i);
            }
        }


    }
}