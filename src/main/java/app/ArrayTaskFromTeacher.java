package app;

import java.util.Arrays;

public class ArrayTaskFromTeacher {
    public static void main(String[] args) {
        final int LEN = 30;
        // 1. creation / filling
        int[] even = new int[LEN];
        int[] odd = new int[LEN];
        for (int i = 0; i < odd.length; i++) {
            odd[i]=(int) (Math.random()*30-15)*2+1;
        }
        for (int i = 0; i < even.length; i++) {
            even[i]=(int) (Math.random()*30-15)*2;
        }
        // 2. calculating
        int sumEven = 0;
        int sumOdd = 0;
        for (int el: even) {
            sumEven += el;
        }
        for (int i = 0; i < odd.length; i++) {
            sumOdd += odd[i];
        }
        int sumTotal = sumEven + sumOdd;
        // 3. printing
        System.out.printf("Even: %s\n", Arrays.toString(even));
        System.out.printf("Odd: %s\n", Arrays.toString(odd));
        System.out.printf("The sum of even is:%d\n", sumEven);
        System.out.printf("The sum of odd is:%d\n", sumOdd);
        System.out.printf("The total sum is:%d\n", sumTotal);
    }

}