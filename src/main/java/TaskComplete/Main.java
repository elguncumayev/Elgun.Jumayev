package TaskComplete;

public class Main {
  public  static void print(String str,Formatter fmt){
    System.out.println(fmt.change(str));
  }
  public static void main(String[] args) {
    Formatter fmt1 = new Formatter1();
    //Formatter fmt2 = new Formatter2();
    Formatter fmt3 = new Formatter3();
    print("hello", fmt1); // hello
    System.out.println(new Formatter2("hello")); // HELLO      //print("hello", fmt2); // HELLO
    print("hello", fmt3); // ***********
                              // *  HELLO  *
                              // ***********

  }
}
