package app;

import java.util.Scanner;

public class Task2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();
        int[][] Array2D = new int[row][column];
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < column; x++) {
                Array2D[y][x]= Math.min(Math.min(x, y)+1,Math.min(column-x,row-y));
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Array2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}