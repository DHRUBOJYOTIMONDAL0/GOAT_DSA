// public class TwoSum {
//     public static String twoSum(int n, int[] arr, int target) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return "YES";
//                 }
//             }
//         }
//         return "NO";
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;

//         String ans = twoSum(n, arr, target);
//         System.out.println(ans);  // Expected output: YES
//     }
// }


public class TwoSum {
    
    public static int[] twoSum(int n, int[] arr, int target) {
        for (int i = 0; i < n; i++) {
           
            for (int j = i + 1; j < n; j++) {
                
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;

        int[] result = twoSum(n, arr, target);

        
        if (result[0] != -1) {
            System.out.println("Index Found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Index not found for target " + target);
        }
    }
}
