package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorldApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /*int num=100;
    switch(num){
      case 100:
        System.out.println("100");
        break;
      case 10:
         System.out.println(10);
         break;
         default:
           throw new IllegalArgumentException();
    }
    String str = new String();


    str += "a";
    str += "\n";
    str += "b";
    System.out.println(str);*/

    //int num;
    while(true) {
      System.out.println("Enter number: ");
      try {
          int num;
          num = scan.nextInt();
          break;
      } catch (InputMismatchException e) {
        System.out.println("Please try again.");
      }
    }
    System.out.println("Finish!");
  }

}
