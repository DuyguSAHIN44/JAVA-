package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {

        // List data türü olarak primitive kabul etmez. (List<int>sayılar...


        List<Integer> sayılar= new ArrayList<>(); //BOŞ LİSTE
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(2);

        System.out.println(sayılar); //][3,5,2] SIRASIYLA YAZAR


        // 3 ile 5 arasına element olarak 7 ekle?

        sayılar.add(1,7);

        System.out.println(sayılar); // [3, 7, 5, 2]


        List<Integer> ekler=new ArrayList<>();
        ekler.add(4);
        ekler.add(6);

        System.out.println(ekler); // [4, 6]

        sayılar.addAll(ekler);
        System.out.println(sayılar); // [3, 7, 5, 2, 4, 6]

        // 7 ile 5 arasına ekleri ekleyin?

        sayılar.addAll(2,ekler);
        System.out.println(sayılar); // [3, 7, 4, 6, 5, 2, 4, 6]




    }
}
