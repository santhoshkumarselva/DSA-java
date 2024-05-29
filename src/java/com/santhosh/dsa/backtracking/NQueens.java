package com.santhosh.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solution = new ArrayList<>();
        char[][] board = new char[n][n];
        initializeBoard(board);
        solveNQueensHelper(0, n, board, solution);
        return solution;
    }

    private static void solveNQueensHelper(int row, int n, char[][] board, List<List<String>> solution) {
        if(row == n) {
            solution.add(constructSolution(board));
        }
        else {
            for(int col=0; col<n; col++) {
                if(isSafe(row, col, board, n)) {
                    board[row][col] = 'Q';
                    solveNQueensHelper(row+1, n, board, solution);
                    board[row][col] = '.';
                }
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board, int n) {
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') return false;
        }
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }
        for(int i = row, j = col; i >= 0 && j < n; j++, i--) {
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for(char[] row: board) {
            solution.add(new String(row));
        }
        return solution;
    }

    private static void initializeBoard(char[][] board) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++)
                board[i][j] = '.';
        }
    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
