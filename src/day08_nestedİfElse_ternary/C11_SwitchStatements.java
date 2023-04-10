package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Kullanıcıdan bir harf isteyin
        // o harfle başlayan gün ismi varsa yazdırın
        // yoksa "geçersiz harf" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        harf=Character.toUpperCase(harf); // harf ibüyük yaptık

        // Eğer if elde ile yaparsak

        if (harf=='P'){
            System.out.println("Pazartesi,Perşembe veya Pazar");
        } else if (harf=='S') {
            System.out.println("Salı");

        } else if (harf=='C') {
            System.out.println("Carşamba,Cuma veya Cumartesi");

        }else {
            System.out.println("Geçersiz harf girdiniz");
        }
        System.out.println("*********************************************************");

        // Daha düzenli ve kullanışlı olark SWITCH STATEMENT kullanabiliriz
        // switch statements, switch in önünde yazılan değişkene eşit olan case i çalıştırır
        // çalışmaya başladıktan sonra
        // break görünceye kadar veya switch in sonuna kadar çalışır


        switch (harf){
            case 'P':
                System.out.println("Pazartesi,Perşembe veya Pazar");
                break;
            case 'S':
                System.out.println("Salı");
                break;
            case 'C':
                System.out.println("Carşamba,Cuma veya Cumartesi");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz");
        }
    }
}
