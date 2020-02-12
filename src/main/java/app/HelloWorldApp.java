package app;

public class HelloWorldApp {

  public static void main(String[] args) {
    int num=100;
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
    System.out.println(str);

  }

}
