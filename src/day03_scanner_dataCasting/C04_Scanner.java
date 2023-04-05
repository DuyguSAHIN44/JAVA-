package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Soru 7 (Interview) Kullanıcıdan iki  tamsayı alıp ikisinin değerini değiştirin

        // sayı1=10; sayı2=20; ise ---- sayı1=20; sayı2=10; olmalı

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        int sayı1= scan.nextInt();
        int sayı2=scan.nextInt();

        int  temp=0;

        temp=sayı2;

        sayı2=sayı1;

        sayı1=temp;

        System.out.println("1.sayı : "+sayı1+  " sayı2 : "+sayı2);
    }
}
