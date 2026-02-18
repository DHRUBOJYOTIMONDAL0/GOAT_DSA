// PRINT SUB ARRAYS


// public class MaxSubarray_Sum {
//     public static void printSubarrays(int number[]){
//         int ts = 0;

//         for(int i =0; i<number.length; i++){
//             int start = i;
//             for(int j = 0; j<number.length; j++){
//                 int end = j;
//                 for(int k = start; k <= end; k++){ // print
//                     System.out.println(number[k]+ " "); // Subsrray
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }System.out.println("Total Subarray = " + ts);
//     }
//     public static void main(String[] args) {
//         int number[] = {2,4,6,8,10};
//         printSubarrays(number);
//     }
    
// }

// PRINT SUB ARRAYS SUM Brute froce approch

// public class MaxSubarray_Sum{
//     public static void printSubarraysSum(int number[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i = 0; i<number.length; i++){
//             int start = i;

//             for(int j = 0; j<number.length; j++){
//                 int end = j;
//                 currSum = 0;
//                 for(int k = start; k <= end; k++){
//                     currSum += number[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Max sum = " + maxSum);
//     }

//     public static void main(String[] args) {
//         // int number[] = {2,4,6,8,10};
//         int number[] = {1,-2,6,-1,3};
//         printSubarraysSum(number);
//     }
// }


// Time complexcity O(n^3)


// Prefix sum

// public class MaxSubarray_Sum {

//      public static void printSubarraysSum(int number[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[number.length];
//         prefix[0] = number[0];

//         for(int i = 1; i <prefix.length; i++){
//             prefix[i] = prefix[i-1] + number[i];
//         }

//         for(int i = 0; i<number.length; i++){
//             int start = i;

//             for(int j = 0; j<number.length; j++){
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//      }
//     public static void main(String[] args) {
//         // int number[] = {2,4,6,8,10}; 
//         int number[] = {1,-2,6,-1,3};
//         printSubarraysSum(number);
//     }
// }

// Time Complexcity O(n^2)




// Max Sub Array Sum Using Kadanes Algorithm


public class MaxSubarray_Sum{
    public static void printSubarraysSum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [number.length];
        prefix[0] = number[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] - number[i];
        }
        for(int i=0; i<number.length; i++){
            int start = i;

            for(int j=0; j<number.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum; 
                } 
            }
        }
        System.out.println("Max sum = " + maxSum);

    }
    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0; i<number.length; i++){
            cs = cs + number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Your max subarray sum is : " + ms);

    }

    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }
}