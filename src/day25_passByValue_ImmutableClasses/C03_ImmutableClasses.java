package day25_passByValue_ImmutableClasses;

import java.util.Locale;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        /*
        Java da class ve o classda oluşturulan
        objeler ya MUTABLE ya da IMMUTABLE dir

        O zaman nasıl değer değişiyor?

        Java metinsel ifadeleri atıyabileceğimiz 3 class oluşturmustur:
        1) String....immutable
        2)StringBuilder....mutable
        3)StringBuffer....mutable

        Immutable den oluşturulan classlarda oluşturulan objeler de
        immutable dir

        String immutable olduğundan aynı str objesine
        yeni değer atadığında
        java eski değeri DEĞİŞTİREMEZ
        Bunun yerine istenen yeni değere sahip yeni bir obje
        oluşturur ve str nin pointer ini yeni objeye yöneltir

        Kullanılmayan eski objeler Garbage Collector tarafından
        toplanmak üzere beklerler.
         */

        String str="Java candır";
        str=str.toLowerCase();

        System.out.println(str); // java candır

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

         // Aşağıdaki kod çalıştığında
        //Java kaç obje oluşturur?

        String s="Hava";
        for (int i = 0; i < 100; i++) {
            s=s + ".";
            System.out.println(s);
        }

    }
}
