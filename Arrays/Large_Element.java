import java.util.Scanner;

public class Large_Element {
    // public static void main(String[] args) {
    //     int[] arr = {2,3,4,100,80,900}; // find largest element
    //     int max = -1;
    //     for(int i =0; i<arr.length; i++){
    //         if(arr[i]>max) max = arr[i];
    //     }
    //     System.out.println(max);
    // }


// find second largest element
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,900,56,78,90};
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        int second_max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>second_max && arr[i]!= max){
                second_max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(second_max);
       
    }
    
}
