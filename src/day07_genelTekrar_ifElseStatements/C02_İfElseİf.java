package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C02_İfElseİf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>100 || not<=0){
            System.out.println("Geçersiz not girdiniz");
        } else if (not>=85) {
            System.out.println("Tebrikler AA ile geçtiniz");
        } else if (not>=65) {
            System.out.println("Tebrikler BB ile geçtiniz");
        } else if (not>=50) {
            System.out.println("CC ile geçtiniz");
        }else {
            System.out.println(" DD Maalesef kaldınız");
        }
    }
}
