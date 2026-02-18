// public class TwoD_Array {
//     public static void main(String[] args) {
//         int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
//         int rows = 4;
//         int columns = 3;
//         //matrix[2][1] = 18; 

//         for(int i = 0; i<rows; i++){
//             for(int j = 0; j<columns; j++){
//                 System.out.print(matrix[i][j]+ " ");
//             }
//             System.out.println();
//         }
//         //System.out.println(matrix[2][1]); 
//         System.out.println();
//     }
// }

// import java.util.Scanner;

// class TwoD_Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter the number of columns: ");
//         int columns = sc.nextInt();
//         int[][] matrix = new int[rows][columns];
//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print("Element at [" + i + "][" + j + "]: ");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("\nMatrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println(); 
//         }

//         sc.close();
//     }
// }

// 2D Array and Matrix using Linear Search

public class TwoD_Array {
    boolean linearSearch(int mat[][], int rows, int columns, int key) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mat[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
            { 10, 11, 12 }
        };
        int rows = 4;
        int columns = 3;
        int key = 8;
        
        TwoD_Array obj = new TwoD_Array();
        boolean found = obj.linearSearch(matrix, rows, columns, key);        
        if (found) {
            System.out.println("Key " + key + " found in the matrix.");
        } else {
            System.out.println("Key " + key + " not found in the matrix.");
        }
    }
}


