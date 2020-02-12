package app;

import java.util.Arrays;

public class PositiveNegativeTask {
    public static void main(String[] args) {
        int[] mainArr = new int[35];
        int[] positive = new int[35];
        int[] negative = new int[35];
        int indexForPos = 0;
        int indexForNeg = 0;
        int zeroCounter = 0;
        int posCounter = 0;
        int negCounter = 0;
        for (int i = 0; i < 35; i++) {
            mainArr[i] = (int) (Math.random()*(200+1)-100);
        }
        for (int i = 0; i < 35; i++){
            if(mainArr[i]>0){
                positive[indexForPos]=mainArr[i];
                indexForPos++;
                posCounter++;
            }
            else if(mainArr[i]<0){
                negative[indexForNeg]=mainArr[i];
                indexForNeg++;
                negCounter++;
            }
            else{
                zeroCounter++;
            }
        }
        System.out.printf("Positive: %s\n" +
                        "Negative: %s\n" +
                        "Number of Zeros: %d\n" +
                        "Number of Pos-s: %d\n" +
                        "Number of Neg-s: %d",
                Arrays.toString(Arrays.copyOf(positive, indexForPos)),
                Arrays.toString(Arrays.copyOf(negative,indexForNeg)),
                zeroCounter,
                posCounter,
                negCounter);

    }
}