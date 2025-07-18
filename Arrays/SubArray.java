// public class SubArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

// Maximum Subarray Sum 

// public class SubArray {
//     public static void main(String[] args) {
//         int[] arr = { 3, -4, 5, 4, -1, 7, -8 };
//         int n = arr.length;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             int CurrSum = 0;
//             for (int j = i; j < n; j++) {
//                 CurrSum += arr[j];
//                 maxSum = Math.max(CurrSum, maxSum);
//             }
//         }
//         System.out.println("Maximum Subarray Sum is: " + maxSum);
//     }
// }



//. Kadane's Algorithm

public class SubArray{
    public static void main(String[] args) {
        int[] nums = { 3, -4, 5, 4, -1, 7, -8 };
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            CurrSum = CurrSum + nums[i];
            if(CurrSum > maxSum){
                maxSum = CurrSum;
            }
            if(CurrSum < 0){
                CurrSum = 0;
            }
        }
         System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
}