package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class day05_DateTime {
    public static void main(String[] args) {


        LocalTime saat=LocalTime.now();
        System.out.println(saat); // 12:17:06.999049500

        System.out.println(saat.getNano()); // 456506800( Nano  saniyeyi veriyor)

        /*
        Bir loop ile 1 den 10000 e kadar olan sayıları toplayın
        ve bu işlemin kaç nano saniye sürdüğünü bulun
         */

        int toplam=0;

        int basSüresiNano=saat.getNano();

        for (int i = 1; i <=10000; i++) {
            toplam += i;

        }

        LocalTime saatSon=LocalTime.now();
        int bitSüresiNano=saatSon.getNano();

        System.out.println("İşlem süresi: " + (bitSüresiNano-basSüresiNano));

    }
}
