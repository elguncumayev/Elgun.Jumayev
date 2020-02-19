package app;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
        final String LOWVOW = "aiouey";
        final String UPPVOW = "AIOUEY";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of String");
        int sizeString = scanner.nextInt();
        String firstString = "";
        int oneOrZero;
        for (int i = 0; i < sizeString; i++) {
            oneOrZero = (int) (Math.random()*2);
            firstString += (char)(Math.random()*('Z'-'A'+1)+'A' + 32*oneOrZero);
        }
        String lowVowelString = "", lowConsString = "",uppVowelString = "", uppConsString = "";
        for (int i = 0; i < sizeString; i++) {
            char c = firstString.charAt(i);
            if (LOWVOW.contains(String.valueOf(c))) lowVowelString += c;
            else if(UPPVOW.contains(String.valueOf(c))) uppVowelString += c;
            else if(c<= 'Z') uppConsString+=c;
            else lowConsString += c;
         }
        System.out.printf("First string: %s\nLower Vowels string: %s\nLower Consonants string: %s\n" +
                "Upper Vowels string: %s\nUpper Consonants string: %s\n",firstString,lowVowelString,lowConsString,
                uppVowelString,uppConsString);
    }
}