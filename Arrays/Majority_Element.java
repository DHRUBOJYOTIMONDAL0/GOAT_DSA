// Use BruteFroce Approch

// public class Majority_Element{
//     public static int findMajority(int nums []){
//         int n = nums.length;
//         for(int i = 0; i<n; i++){
//             int count = 0;

//             for(int j = 0; j<n; j++){
//                 if(nums[j] == nums [i]){
//                     count++;
//                 }
//             }
//             if(count > n/2){
//                 return nums[i];
//             }
//         }
//         return -1; // for no Majority Elements

//     }
//     public static void main (String[] args){
//         int[    ] nums = {2,2,1,2,3,2,2};
//         System.out.println("Majority Element: " + findMajority(nums));

//     }
// }

// Use Sorting



 import java.util.Arrays;

// class Majority_Element {

//     public static int findMajority(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         int count = 1, ans = nums[0];

//         for(int i = 1; i < n; i++){
//             if(nums[i] == nums[i-1]){
//                 count++;
//             }
//             else{
//                 count = 1;
//                 ans = nums[i];
//             }
//             if (count > n/2){
//                 return ans;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 2, 1, 2, 3, 2, 2 };
//         System.out.println("Majority Element: " + findMajority(nums));

//     }
// }


// Using Bubble Sort

//package Arrays;

public class Majority_Element {
    public static void bubblesort(int[] nums){
        int n = nums.length;

        for(int i = 0; i< n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    
    public static int findMajority(int [] nums){
        int n = nums.length;
        bubblesort(nums);

        int count = 1, ans = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
                ans = nums[i];
            }
            if(count > n/2){
                return ans;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 2, 3, 2, 2 };
        System.out.println("Majority Element: " + findMajority(nums));
    }
}