import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,5};
        // System.out.println(arr[0]);
        // int n = arr.length;

        // for( int i = 0; i<n; i++){
        //     System.out.println(arr[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of array: ");
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        //  System.out.print("Enter array elements: ");
        // for(int i = 0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i =0; i<n; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] marks = new int[n];
        System.out.print("Enter marks of student: ");
        for(int i = 0; i<n; i++){
            marks[i] = sc.nextInt();

        }
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += marks[i];
            if(marks[i] < 35){
                System.out.println(i+ " ");
            }
        }
        System.out.print("Total marks: "+sum);








        

        // int[] marks = {100, 34, 6,  80, 90, 55, 35, 7, 10,};
        // for(int i = 0; i<marks.length; i++){
        //     if(marks[i] < 35){
        //         System.out.print(i +" ");
        //     }
        // }

    }
}