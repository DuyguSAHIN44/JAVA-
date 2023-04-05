package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 4: Kullanıcıdan bir çemberin yarıçapını alıp
        // çevresini ve alanını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz");
        double yarıÇap= scan.nextDouble();

        System.out.println("Çemberin çevresi : "+2*3.14*yarıÇap);
        System.out.println("Dairenin alanı : "+3.14*yarıÇap*yarıÇap);
    }
}
