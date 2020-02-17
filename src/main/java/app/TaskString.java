package app;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of String");
        int sizeString = scanner.nextInt();
        String firstString = "";
        for (int i = 0; i < sizeString; i++) {
            firstString += (char)(Math.random()*('z'-'a'+1)+'a');
        }
        String vowelString = "", consString = "";
        for (int i = 0; i < sizeString; i++) {
            char indexChar = firstString.charAt(i);
            if(indexChar == 'a' ||
            indexChar == 'e' ||
            indexChar == 'i' ||
            indexChar == 'o' ||
            indexChar == 'u' ||
            indexChar == 'y')  vowelString+=indexChar;
            else consString +=indexChar;
        }
        System.out.printf("First string: %s\nVowels string: %s\nConstants string: %s\n",firstString,vowelString,consString);

        
    }
}
