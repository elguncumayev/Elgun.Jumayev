package app;

public class Swap {

   private  static void swap2(Box box3, Box box4){
       int c = box3.a;
       box3.a = box4.a;
       box4.a = c;
   }
    public static void main(String[] args) {
       Box box1 = new Box();
       box1.a = 5;
       Box box2 = new Box();
       box2.a = 6;
        System.out.printf("i:%d, j:%d\n",box1.a,box2.a);
        swap2(box1,box2);
        System.out.printf("i:%d, j:%d\n",box1.a,box2.a);
    }
}
