package Calculator;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
  private String operation(String a, String b, char ch) {
    int f = Integer.parseInt(a);
    int g = Integer.parseInt(b);
    switch (ch) {
      case '+':
        return String.valueOf(f + g);
      case '-':
        return String.valueOf(f - g);
      case '*':
        return String.valueOf(f * g);
      case '/':
        return String.valueOf(f / g);
      default:
        return "";
    }
  }

  public void start() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      String string = scanner.nextLine();
      Stack<Character> operations = new Stack<>();
      String a = "", b = "";

      char ch;
      for (int i = 0; i < string.length(); i++) {
        ch = string.charAt(i);
        switch (ch) {
          case '+':
            if (operations.isEmpty()) operations.add('+');
            else {
              a = operation(a, b, '+');
              operations.pop();
            }
            break;
          case '-':
            if (operations.isEmpty()) operations.add('-');
            else {
              a = operation(a, b, '-');
              operations.pop();
            }
            break;
          case '*':
            if (operations.isEmpty()) operations.add('*');
            else {
              a = operation(a, b, '*');
              operations.pop();
            }
            break;
          case '/':
            if (operations.isEmpty()) operations.add('/');
            else {
              a = operation(a, b, '/');
              operations.pop();
            }
            break;
          default:
            if (operations.isEmpty()) a += ch;
            else b += ch;
        }
      }
      System.out.println(Integer.valueOf(operation(a, b, operations.pop())));
    }
  }
}