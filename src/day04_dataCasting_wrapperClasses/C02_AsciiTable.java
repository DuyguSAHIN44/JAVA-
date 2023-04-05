package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {

        // Kullanıcıdan bir harf alın ve alfabede o harften sonraki 3 harfi yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);

        System.out.println("Girilen harften sonraki üç harf: " + (char) (girilenHarf + 1)+", "
                                                               + (char) (girilenHarf + 2)+", "
                                                               + (char) (girilenHarf + 3));
    }
}
