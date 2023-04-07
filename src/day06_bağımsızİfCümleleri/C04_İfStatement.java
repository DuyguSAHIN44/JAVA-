package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C04_İfStatement {
    public static void main(String[] args) {

        // SORU 5: Kullanıcıdan notunu alın
        // 50 veya daha büyükse "Sınıfı geçtin",
        // 50 den küçükse "Maalesef kaldın yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scan.nextDouble();

        /*
        If statements da şart parantezinden sonra {} kullanmazsak
        Java ilk ; 'e kadar olan kısmı if body olarak kabul eder

        İf body zaten bir satır ise bir sorun olmaz
        Ama if body 1 satırdan çoksa , ilk satırdan sonrası
        her durumda çalışır
         */

        if (not>=50 && not<=100){
            System.out.println("Sınıfı geçtin");
        }
        if (not<50){
            System.out.println("Maalesef kaldın");
        }
    }
}
