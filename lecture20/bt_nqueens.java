package lecture20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lecture13.stringbuild;

public class bt_nqueens {

    public static boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int j=0; j<board.length; j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //  vertical
        for(int j=0; j<board.length; j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }
        // upper left
        for(int j=0; j<board.length; j++){
            if(board[])
        }
    }

    public static void helper(char[][] board, List<List<String>> allboards, int col){
       if(col== board.length){
        saveboard(board, allboards);
       }
       for(int row=0; row<board.length; row++){
        if(isSafe(row, col, board)){
            board[row][col]='Q';
            helper(board, allboards, col+1);
            board[row][col]='.';// to place '.' on the left places in the rows 
        }
       }
    }

    public List<List<String>> solveNqueens(int n){
        List<List<String>> allboards= new ArrayList<>();
        char[][] board= new char[n][n];
        helper(board, allboards, n);
        return allboards;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }
}
