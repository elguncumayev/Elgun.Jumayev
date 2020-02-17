package app;

import java.util.Arrays;
import java.util.Scanner;

public class TaskShiftPosNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] randNumbers = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            randNumbers[i] = (int) (Math.random()*(20+1)-10);
        }
        System.out.printf("1st Array: %s\n", Arrays.toString(randNumbers));
        int firstPosIndex = 0;
        for (int i = 0; i < sizeArray; i++) {
            if(randNumbers[i]>0){
                firstPosIndex = i;
                break;
            }
        }
        for (int i = 1; i < sizeArray; i++) {
            if(randNumbers[i]>0) {
                int c = randNumbers[firstPosIndex];
                randNumbers[firstPosIndex] = randNumbers[i];
                randNumbers[i] = c;
            }
        }

        System.out.printf("Shifting Array: %s", Arrays.toString(randNumbers));
        scanner.close();
    }
}
