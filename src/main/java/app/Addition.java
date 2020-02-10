package app;

import java.util.*;
import java.io.*;

public class Addition {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1,num2;
        System.out.println("Input the first number");
        num1=scan.nextInt();
        System.out.println("Input the second number");
        num2=scan.nextInt();
        System.out.printf("Sum of two numbers is %d",num1+num2);

    }
}
