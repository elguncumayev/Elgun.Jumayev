package Merge;


import java.util.Arrays;
import java.util.Random;

public class Merge {
  public static void main(String[] args) {
    int[] data1 = new Random().ints(10, 30).limit(20).sorted().toArray();
    int[] data2 = new Random().ints(10, 30).limit(20).sorted().toArray();
    int[] data3 = merge(data1, data2);
    System.out.println(Arrays.toString(data1));
    System.out.println(Arrays.toString(data2));
    System.out.println(Arrays.toString(data3));
  }

  private static int[] merge(int[] data1, int[] data2) {
    int size1 = data1.length;
    int size2 = data2.length;
    int in1=0,in2=0;
    int[] result = new int[size1+size2];
    for (int i = 0; i < size1 + size2 - 1 ; i++) {
      if(data1[in1] > data2[in2]){
        result[i] = data2[in2];
        in2++;
      }
      else {
        result[i] = data1[in1];
        in1++;
      }
    }
    result[size1+size2-1] = Math.max(data1[size1-1], data2[size2-1]);
    return result;
  }
}
