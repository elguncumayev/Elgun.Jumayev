package app;

import java.util.Scanner;
import java.util.stream.IntStream;

public class HelloWorldApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    IntStream.range(0, 100)
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
    //int num=100;
    //    switch(num){
    //      case 100:
    //        System.out.println("100");
    //        break;
    //      case 10:
    //         System.out.println(10);
    //         break;
    //         default:
    //           throw new IllegalArgumentException();
    //    }
    //    String str = new String();
    //
    //
    //    str += "a";
    //    str += "\n";
    //    str += "b";
    //    System.out.println(str);
    //
    //    //int num;
    //    while(true) {
    //      System.out.println("Enter number: ");
    //      try {
    //          int num;
    //          num = scan.nextInt();
    //          break;
    //      } catch (InputMismatchException e) {
    //        System.out.println("Please try again.");
    //      }
    //    }
    //    System.out.println("Finish!");
    //
  }

}
