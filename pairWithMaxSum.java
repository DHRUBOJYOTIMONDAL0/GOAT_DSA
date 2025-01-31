// Maximum Score from Subarray Minimums
// Difficulty: MediumAccuracy: 43.26%Submissions: 97K+Points: 4
// Given an array arr[], with 0-based indexing, select any two indexes, i and j such that i < j. From the subarray arr[i...j], select the smallest and second smallest numbers and add them, you will get the score for that subarray. Return the maximum possible score across all the subarrays of array arr[].

// Examples :

// Input : arr[] = [4, 3, 1, 5, 6]
// Output : 11
// Explanation : Subarrays with smallest and second smallest are:- [4, 3] smallest = 3,second smallest = 4
// [4, 3, 1] smallest = 1, second smallest = 3
// [4, 3, 1, 5] smallest = 1, second smallest = 3
// [4, 3, 1, 5, 6] smallest = 1, second smallest = 3
// [3, 1] smallest = 1, second smallest = 3
// [3, 1, 5] smallest = 1, second smallest = 3
// [3, 1, 5, 6] smallest = 1, second smallest = 3
// [1, 5] smallest = 1, second smallest = 5
// [1, 5, 6] smallest = 1, second smallest = 5
// [5, 6] smallest = 5, second smallest = 6
// Maximum sum among all above choices is, 5 + 6 = 11.
// Input : arr[] = [5, 4, 3, 1, 6] 
// Output : 9




class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        int n = arr.length;
        if(n<2) return 0;
        int maxSum = 0;
        // for(int i =0; i<n; i++){
        //     for(int j =i; j<n; j++){
        //         int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        //         for(int k =i; k<=j; k++){
        //             if(arr[k]<firstMin){
        //                 secondMin = firstMin;
        //                 firstMin = arr[k];
        //             }
        //             else if(arr[k]<secondMin){
        //                 secondMin = arr[k];
        //             }
        //         }
        //         if(secondMin != Integer.MAX_VALUE){
        //             maxSum = Math.max(maxSum, firstMin + secondMin);
        //         }
        //     }
        // }
        for(int i =0; i<n-1; i++){
            maxSum = Math.max(maxSum, arr[i] + arr[i+1]);
        }
        return maxSum;
        
    }
}