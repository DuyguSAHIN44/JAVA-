package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
     dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
     baslangic degerinden kucuk olsa da program calissin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini tamsayı olarak giriniz");
        int baş = scan.nextInt();

        System.out.println("Bitiş değerini tamsayı olarak giriniz");
        int bit = scan.nextInt();

        int sayılarToplamı = 0;

        if (baş<=bit) {
            for (int i = baş; i < bit; i++) {
                sayılarToplamı += i;

            }


        } else { // başlangıç değeri bitiş değerinden büyük

            for (int i = baş; i>= bit; i--) {
                sayılarToplamı += i;

            }

        }
        System.out.println("sayılarToplamı: "+ sayılarToplamı);
    }
}
