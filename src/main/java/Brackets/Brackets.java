package Brackets;

import java.util.Stack;

public class Brackets {
  public int calc(String origin) {
    Stack<Character> brs = new Stack<>();
    int max = 0;
    for (int i = 0; i < origin.length(); i++) {
      char ch = origin.charAt(i);
      if(ch == '('){
        brs.push(ch);
      }
      else {
        brs.pop();
      }
      if(brs.size() >= max){
        max = brs.size();
      }
    }
    return max;
  }
}
