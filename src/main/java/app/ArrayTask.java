package app;

import java.util.*;
import java.io.*;

public class ArrayTask {
    public static void main(String[] args) {
        int num1,num2;
        int[] arr = new int[30];
        int[] arr2 = new int[30];
        for(int i=0;i<30;i++){
            num1=1;
            num2=0;

            num1= (int) (Math.random()*(40+1)-20);
            /**if(num1%2==1 || num1%2==-1){
                num1++;
            }**/
            arr[i]=num1+num1%2;

            num2 = (int) (Math.random()*(57+1)-27);
            /**if(num2%2==0){   29
                if(num2==-30){
                    num2++;
                }
                else{
                    num2--;
                }
            }**/
            arr2[i]=num2+num2%2-1;
        }
        for (int i = 0; i < 30; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 30; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int sum1=0,sum2=0;
        for (int i = 0; i < 30; i++) {
            sum1+=arr[i];
            sum2+=arr2[i];
        }
        System.out.println(sum1+" "+sum2+" "+(sum1+sum2));
    }
}