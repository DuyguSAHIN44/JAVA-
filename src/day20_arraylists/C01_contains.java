package day20_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {

    public static void main(String[] args){

        /*
    NOT: LİST İN ARRAY LERE GÖRE AVANTAJI ESNEKTİR.ELEMENT EKLEME VE SİLME YAPIYORUZ
    ATAMA YAPMA SIKINTIMIZ YOKTUR

    Uzun bir listeyi javada  list olarak kaydetmek istersek işimiz zor
    tek tek eklemek istemezsek bir array oluşturup bir LOOP ile List e ekleyebiliriz.
     */

    int[] arr = {2,3,5,4,3,6,7,5,4,3,2,5,6,8,6,5,1};

    List<Integer> sayılar = new ArrayList<>();

      for(int i = 0; i <arr.length; i++){

          sayılar.add(arr[i]); //


    }
        System.out.println(sayılar); // [2, 3, 5, 4, 3, 6, 7, 5, 4, 3, 2, 5, 6, 8, 6, 5, 1]

        // Listede element olarak 3 var mı?

        System.out.println(sayılar.contains(3)); // true

        System.out.println(sayılar.contains(9)); // false

    }
}