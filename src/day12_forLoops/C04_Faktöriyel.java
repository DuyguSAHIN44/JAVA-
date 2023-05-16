package day12_forLoops;

import java.util.Scanner;

public class C04_Faktöriyel {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        bu sayinin faktoriyel degerini
        hesaplayin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir sayı giriniz");
        int girilenSayı= scan.nextInt();

        int faktöriyel=1;

        for (int i =girilenSayı; i >=1 ; i--) {
            faktöriyel*=i;

        }
        System.out.println(girilenSayı+"!=" +faktöriyel);
    }
}
