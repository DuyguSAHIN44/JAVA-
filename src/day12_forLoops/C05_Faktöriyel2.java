package day12_forLoops;

import java.util.Scanner;

public class C05_Faktöriyel2 {
    public static void main(String[] args) {

       /* Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        bu sayinin faktoryel degerini
        hesaplayin.
        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        */


        int girilenSayı =6;

        int faktöriyel = 1;

        System.out.print(girilenSayı+"!= ");
        for (int i = girilenSayı; i >= 1; i--) {
            faktöriyel *= i;
            if (i != 1) {
                System.out.print(i + "*");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.print("= " + faktöriyel);
    }
}
