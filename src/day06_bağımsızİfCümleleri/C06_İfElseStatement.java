package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C06_İfElseStatement {
    public static void main(String[] args) {


        // SORU 3: Kullanıcıdan yaşını isteyin
        // 65 yaş ve üzeri ise "Emekli olabilirsin" yazdırın,
        // yoksa emekli olması için çalışması gereken yıl sayısını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yaş= scan.nextInt();

        if (yaş>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olmak için "+(65-yaş)+ " yıl daha çalışman gerekli");
        }
    }
}
