package app;
import java.io.*;
import java.util.*;
public class TaskEnvelope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int height = scan.nextInt();
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        int tangent = (width-2)/height;
        int startPointForRow = tangent;
        for (int y = 1; y < height-1; y++) {
            System.out.print("*");
            for (int x = 0; x < width-2; x++) {
                if(x==startPointForRow || x==width-2-startPointForRow-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            startPointForRow +=tangent+1;
            System.out.println("*");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        scan.close();
    }
}