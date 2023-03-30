package day02_dataTürleri_Skenner;

import java.util.Scanner;

public class C05_ScannerİlkGörev {
    public static void main(String[] args) {


        /*
        Kullanıcıdan bir sayı alın ve sayının karesini yazdırın

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayı= scan.nextDouble();

        System.out.println("Girilen sayının karesi : "+sayı*sayı); // 36.0
    }
}
