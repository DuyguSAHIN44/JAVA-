package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;
public class C04_remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A, B, K]

        System.out.println(harfler.remove("B")); // true
        System.out.println(harfler); // [A, K]

        System.out.println(harfler.remove(0)); // A
        System.out.println(harfler); // [K]


        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(18);
        sayılar.add(2);
        System.out.println(sayılar); // [1, 3, 18, 2]
        /*
        Eğersadece sayılardan oluşan bir List varsa
        remove methoduna yazacağımız sayıyı index olarak kabul eder

        Eğer sayıyı silmek istersek
        remove methodundan önce o sayıyı bir objeye atayıp
        remove methodunda obje ismini yazabiliriz
         */
        sayılar.remove(1);
        System.out.println(sayılar); //[1, 18, 2]

        // 1 i silmek istiyoruz?

        System.out.println(sayılar.remove(0)); // 1 sadece getiriyor!!!

        Integer silinecekSayı=1;
        sayılar.remove(silinecekSayı);
        System.out.println(sayılar);  // [18, 2]


    }
}

