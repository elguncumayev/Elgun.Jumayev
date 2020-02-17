package app;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
        final String VOW = "aioueyAIOUEY";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of String");
        int sizeString = scanner.nextInt();
        String firstString = "";
        int randINT=91;
        for (int i = 0; i < sizeString; i++) {
            randINT = (int)(Math.random()*('z'-'A'+1)+'A');
            if(randINT>=91 && randINT<=96) i--;
            else {
                firstString+=(char)randINT;
            }
        }
        String vowelString = "", consString = "";
        //int[] letters = new int[26];
        for (int i = 0; i < sizeString; i++) {
            char c = firstString.charAt(i);
            if (VOW.contains(String.valueOf(c))) vowelString += c;
            else consString += c;
            //letters[(int) c - 97]++;
        }
        System.out.printf("First string: %s\nVowels string: %s\nConsonants string: %s\n",firstString,vowelString,consString);
        /*for (int i = 0; i < 26; i++) {
            System.out.printf("%c   -   %d\n",(char)(i+97),letters[i]);
        }*/
        
    }
}
