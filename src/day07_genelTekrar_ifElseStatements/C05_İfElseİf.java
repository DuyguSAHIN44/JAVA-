package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C05_İfElseİf {
    public static void main(String[] args) {

        /*
        Kullanıcıdan cinsiyetini ve yaşını alın,
        Kadın 60 yaş ve üzeri, erkek 65 yaş ve üzeri emekli olabilir
        Yaşını ve cinsiyetini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak için .. yıl daha çalışman gerekir" yazdırın

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz"+"\nKadın için:K, Erkek için:E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yaş=scan.nextDouble();


        if ((cinsiyet== 'E'  && yaş>=65) || ( cinsiyet == 'K'  && yaş>=60 )){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet =='E' && yaş<65) {
            System.out.println("Emekli olabilmek için "+(65-yaş)+ "yıl daha çalışman gerekli");
        }else if (cinsiyet=='K' && yaş<60){
            System.out.println("Emekli olabilmek için "+(60-yaş)+ " yıl daha çalışman gerekli");
        }


    }
}
