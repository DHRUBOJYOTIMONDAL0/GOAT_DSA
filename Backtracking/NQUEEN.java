package Backtracking;

import java.util.Scanner;

public class NQUEEN {
    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);
        System.out.println("Enter Your Alphabet");
        String str = sc.nextLine();
        sc.close();
    }
    public static boolean nqueen(int board[][], int row){
        if(row == n){
            return true;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col)){
                board [row] [col] = 1;
                if(nqueen( board, row+1)){
                    return true;
                    board[row] [col] = 0;
                }
            }
        }
        return false;
    }
    
}
