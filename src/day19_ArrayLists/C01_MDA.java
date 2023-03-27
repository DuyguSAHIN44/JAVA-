package day19_ArrayLists;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        //SORU 2 :Verilen 2 katlı bir array de
        // aynı index e sahip elementleri toplayıp,
        //yeni oluşturacağımız tek katlı bir array de bu toplamları atayın,
        //input:   int[][] arr= {{3,4,5},{2,3,6,7}};
        //output: [5,7,11]

        int[][] arr={{3,4,5,},{2,3,6,7}};

        // ortak index kullanabilmek için en kısa olanı bulmalıyız.

        int enKısaArrayLength = arr[0].length; // 3

        for(int i=0; i<arr.length; i++){

            if (arr[i].length < enKısaArrayLength){
                enKısaArrayLength=arr[i].length;

            }
        }

        //toplamları koymak için yeni bir  array oluşturalım

        int[] toplamlarArrayi= new int[enKısaArrayLength];

        int indexdekiElementlerToplamı=0;

        for (int i=0; i<toplamlarArrayi.length; i++){

            for (int j=0; j<arr.length; j++ ){

                indexdekiElementlerToplamı+=arr[j][i];
            }
            toplamlarArrayi[i]=indexdekiElementlerToplamı;
            indexdekiElementlerToplamı=0;
        }
        System.out.println(Arrays.toString(toplamlarArrayi));

    }
}
