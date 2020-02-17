package app;

import java.util.Arrays;
import java.util.Scanner;

public class Task3Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int[] arrayMul2 = new int[N];
        int[] arrayMul7 = new int[N];
        int[] arrayMul11 = new int[N];
        for (int i = 0; i < N; i++) {
            arrayMul2[i] = (int) (Math.random()*(100+1))*2;
            arrayMul7[i] = (int) (Math.random()*(100+1))*7;
            arrayMul11[i] = (int) (Math.random()*(100+1))*11;
        }
        //int indexForFirstArrays=0;
        int[] arrayAll = new int[3 * N];
        for (int i = 0; i < N; i++) {
            arrayAll[i*3] = arrayMul2[i];
            arrayAll[i*3+1] = arrayMul7[i];
            arrayAll[i*3+2] = arrayMul11[i];
        }
        System.out.printf("arrayMul2: %s\narrayMul7: %s\narrayMul11: %s\nFinal Array: %s\n",
                Arrays.toString(arrayMul2),
                Arrays.toString(arrayMul7),
                Arrays.toString(arrayMul11),
                Arrays.toString(arrayAll));
        scanner.close();
    }
}
