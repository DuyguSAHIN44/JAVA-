package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C08_İfElseStatements {
    public static void main(String[] args) {

        // Kullanıcıdan bir karakter isteyin
        // Girilen karakter küçük harf ise onu büyük harf olarak yazdırın
        // yoksa girilen karakteri yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if ('a' <= krk && krk <= 'z') {
            System.out.println(Character.toUpperCase(krk));
        } else {
            System.out.println(krk);
        }
    }
}
