public class Reverse {
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        print(arr);

        int i = 0, j = n-1;
        while(i<j){
            // int temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] = temp;
            swap(arr, i, j);
            i++;
            j--;
        }
        print(arr);

        //  for (int i = 0; i < n / 2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n - 1 - i];
        //     arr[n - 1 - i] = temp;
        // }
        // print(arr);


        // for(int i = 0, j = n-1; i<j; i++, j--){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        // print(arr);
    }
    
}
