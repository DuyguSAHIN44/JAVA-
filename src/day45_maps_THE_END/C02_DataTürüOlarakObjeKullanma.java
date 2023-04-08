package day45_maps_THE_END;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_DataTürüOlarakObjeKullanma {
    public static void main(String[] args) {


        List<Object> sayılar = new ArrayList<>();
        sayılar.add(4);

        sayılar.add('D');
        sayılar.add("Java");
        sayılar.add(true);
        sayılar.add(4.2);

        int[]a={3,4,5};
        sayılar.add(a);
        System.out.println(sayılar);//[4, D, Java, true, 4.2, [I@568db2f2]
        System.out.println(  Arrays.toString((int[])sayılar.get(5)));// [3, 4, 5]

        System.out.println(7+6.5);//13.5
        System.out.println((int)sayılar.get(0)+(double)sayılar.get(4));//8.2

    }
}