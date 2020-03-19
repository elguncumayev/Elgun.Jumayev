package AlgoLesson2;

public class Main {
  public static void main(String[] args) {
    StringChange sc = new StringChange();

    String str1 = sc.invertCase("AbCd");
    String str2 = sc.toLowerCase("AbCd");
    String str3 = sc.toUpperCase("AbCd");

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
  }
}
