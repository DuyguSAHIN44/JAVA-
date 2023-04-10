package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {
          /*
        Kullanıcıdan cinsiyetini ve yaşını alın,
        Kadın 60 yaş ve üzeri, erkek 65 yaş ve üzeri emekli olabilir
        Yaşını ve cinsiyetini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak için .. yıl daha çalışman gerekir" yazdırın
        Hatalı giriş yapılırsa kullanıcıyı uyarın

         */

        // Ana değişkenimiz yaş olsun
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz"+"\nKadın için:K, Erkek için:E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yaş=scan.nextDouble();

        if (yaş<16 || yaş>80){ // 0-16 || 80 den büyük

             System.out.println("Geçersiz yaş girdiniz");

        } else if (yaş<60) { //16-60
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olabilmek için "+(60-yaş)+ " yıl daha çalışmanız gerekli");
            }else if(cinsiyet=='e'|| cinsiyet=='E'){
                System.out.println("Emekli olabilmek için" +(65-yaş)+ " yıl daha çalışmanız gerekli");
            }else {
                System.out.println("Geçersiz cinsiyet");
            }
        } else if (yaş<65) { // 60-65
            if (cinsiyet=='k' || cinsiyet=='K') {
                System.out.println("Emekli olabilirsiniz");
            }else if(cinsiyet=='e'|| cinsiyet=='E'){
                System.out.println("Emekli olabilmek için" +(65-yaş)+ " yıl daha çalışmanız gerekli");
            }else {
                System.out.println("Geçersiz cinsiyet");
            }
        }else { // 65-80
            if (cinsiyet=='e'||cinsiyet=='E'||cinsiyet=='k'||cinsiyet=='K') {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Geçersiz cinsiyet girişi");

        }

        }
    }
}
