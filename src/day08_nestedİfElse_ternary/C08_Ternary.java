package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // SORU 3: Kullanıcıdan bir harf isteyin
        // Girilen karakter küçük harf ise onu büyük harf olarak yazdırın
        // yoksa girilen harfi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf girinz");
        char harf=scan.next().charAt(0);

        System.out.println(harf>='a' && harf <='z'
                ? Character.toUpperCase(harf)
                :harf); // char bir karakteri Wrepper class ile büyük harf e ÇEVİRDİK

    }
}
