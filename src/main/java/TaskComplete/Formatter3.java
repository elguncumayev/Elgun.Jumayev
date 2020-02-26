package TaskComplete;

import java.util.Arrays;

public class Formatter3 implements Formatter{
  //task1
  public void print(String str){
    str = str.toUpperCase();
    char[] line = new char[str.length()+4];
    Arrays.fill(line,'*');
    String linedot = new String(line);
    System.out.println(String.format("%s\n* %s *\n%1$s", linedot,str));
  }



  //task2
  @Override
  public String change(String str) {
    str = str.toUpperCase();
    char[] line = new char[str.length()+4];
    Arrays.fill(line,'*');
    String linedot = new String(line);
    return String.format("%s\n* %s *\n%s", linedot,str, linedot);
  }


  //task3

}
