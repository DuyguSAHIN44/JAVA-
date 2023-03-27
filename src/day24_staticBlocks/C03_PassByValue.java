package day24_staticBlocks;

import java.util.Arrays;

     // Java kesin PassByValue dir.

public class C03_PassByValue {

    public static void main(String[] args) {

        int[] arr={3,4,5};

        elementleriArtır(arr,4);
        System.out.println("Method call dan sonra arr :" + Arrays.toString(arr));

    }

    public static void elementleriArtır(int[]arr,int artışMiktarı){

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artışMiktarı;

            System.out.println("Method da array : " + Arrays.toString(arr));

        }
    }


}
