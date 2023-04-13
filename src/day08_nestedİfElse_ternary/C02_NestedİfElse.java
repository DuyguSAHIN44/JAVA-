package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C02_NestedİfElse {
    public static void main(String[] args) {

        /*
        Kullanıcıdan cinsiyetini ve yaşını alın,
        Kadın 60 yaş ve üzeri, erkek 65 yaş ve üzeri emekli olabilir
        Yaşını ve cinsiyetini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak için .. yıl daha çalışman gerekir" yazdırın
        Hatalı giriş yapılırsa kullanıcıyı uyarın

         */
        // Birden fazla değişkene bağlı if else statement larını yazarken
        // Önce değişkenlerden birine göre ana yapıyı oluşturalım

        // Bu soruda cinsiyeti ana değişken yapalım
        // İkinci değişkeni ana değişkenin her bölümünde ayrı ayrı değerlendirelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz"+"\nKadın için:K, Erkek için:E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yaş=scan.nextDouble();

        if (cinsiyet=='k' || cinsiyet=='K'){ // KADIN
            if (yaş<16 || yaş>80){
                System.out.println("Geçersiz yaş girişi, lütfen tekrar deneyiniz");
            } else if (yaş<60) {
                System.out.println("Emekli olabilmek için "+(60-yaş)+ "yıl daha çalışmanız gerekli");

            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet=='e' || cinsiyet=='E') { // ERKEK
            if (yaş<16 || yaş>80){
                System.out.println("Geçersiz yaş girişi, lütfen tekrar deneyiniz");
            } else if (yaş<65) {
                System.out.println("Emekli olabilmek için "+(65-yaş)+ "yıl daha çalışmanız gerekli");

            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        }else {
            System.out.println("Geçersiz cinsiyet, tekrar deneyiniz");
        }
    }
}
