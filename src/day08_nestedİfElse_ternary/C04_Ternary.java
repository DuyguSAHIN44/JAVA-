package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // ÇOK KARMAŞIK SORULARDA TERNARY KULLANILMAZ. BASİT YAPILARDA KULLANILIR

        // Kullanıcıdan pozitif bir tamsayı alın
        // Sayı çift ise " çift sayı",
        // değilse "tek sayı" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı girinz");
        int sayı= scan.nextInt();

        if (sayı%2==0){
            System.out.println("Çift sayı");
        }else {
            System.out.println("Tek sayı");
        }


        System.out.println(sayı % 2 ==0 ? "Çift sayı" : "Tek sayı");
    }
}
