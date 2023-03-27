package day38_exceptions_Finalize;

import java.io.PrintStream;
import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {

        int[]arr={3,8,9,15};
        //tüm elementleri yazdır

        for (int each:arr
        ){
            System.out.print(each+ "  ");//3,8,9,15
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
        for (int each:arr
        ){
            each=each+3;
            System.out.println(each+" ");
        }
        System.out.println(Arrays.toString(arr));// değişmedi

    }
}
