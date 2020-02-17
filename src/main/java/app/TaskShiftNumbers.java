package app;

import java.util.Arrays;
import java.util.Scanner;

public class TaskShiftNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] randNumbers = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            randNumbers[i] = (int) (Math.random()*(200+1));
        }
        System.out.printf("1st Array: %s\n", Arrays.toString(randNumbers));

        for (int i = 1; i < sizeArray; i++) {
            int c = randNumbers[0];
            randNumbers[0]= randNumbers[i];
            randNumbers[i]=c;
        }

        System.out.printf("Reversing Array: %s", Arrays.toString(randNumbers));
        scanner.close();
    }
}
