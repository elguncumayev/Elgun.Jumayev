package app;

import java.util.Scanner;

public class TaskCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int counter=0;
        for (int i = 0; i <radius*2 ; i++) {
            for (int j = 0; j < radius*2; j++) {
                if(j==radius-counter-1 || j==radius+counter){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            counter++;

        }
    }
}
