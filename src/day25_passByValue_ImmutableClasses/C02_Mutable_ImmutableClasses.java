package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java gün geçtikçe daha da keyifli oluyor.";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str); // Java gün geçtikçe daha da keyifli oluyor.
        /*
        String ve Wrapper class lar ımmutable oldukları için
        DEĞİŞTİRİLEMEZLER
        Ancak Array ve List mutable oldukları için
        atama yapmasakta method kullansakta değerleri değişir.
         */

        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(5);
        sayılar.add(8);
        System.out.println(sayılar); // [5, 8]

        sayılar.set(0,7);
        sayılar.remove(1);

        System.out.println(sayılar); // [7]
    }
}
