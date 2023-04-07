package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C02_İfStatements {
    public static void main(String[] args) {

        // SORU 1) Kullanıcıdan bir sayı isteyin,
        // sayıyı kontrol edip 5 ile bölünebiliyorsa
        // " sayı 5 in tam katı" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%5==0){
            System.out.println("sayı 5 in tam katı");
        }

        // SORU 3: Kullanıcıdan bir sayı alın,
        // sayı 3 ile bölünebiliyorsa "Üç ile bölünebilen sayı",
        // 5 ile bölünebiliyorsa "Beş ile bölünebilen sayı" yazdırın

        if (sayı%3==0){
            System.out.println("Üç ile bölünebilen sayı");
        }
    }
}
