package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_SayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {

        //Kullanıcıdan 3 basamaklı bir pozitif tamsayı alın
        // ve sayının rakamlar toplamını yazdırın

        // 1. YÖNTEM
     //   Scanner scan=new Scanner(System.in);
      //   System.out.println("Lütfen üç basamaklı bir pozitif tamsayı giriniz");
      //   int girilenSayı= scan.nextInt();

       //  int birlerbasamağı=girilenSayı % 10;
      //   girilenSayı=girilenSayı / 10;

     //    int onlarbasamağı=girilenSayı % 10;
       //  girilenSayı=girilenSayı / 10;

        // int yüzlerbasamağı=girilenSayı % 10;

       // int rakamlarToplamı=birlerbasamağı+onlarbasamağı+yüzlerbasamağı;

       // System.out.println(rakamlarToplamı);

        //2. YÖNTEM
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir pozitif tamsayı giriniz");
        int girilenSayı= scan.nextInt();

        int rakam=girilenSayı % 10;
        int rakamlarToplamı=rakam;

        //--------------------------------
        girilenSayı=girilenSayı / 10;
        rakam=girilenSayı % 10;
        rakamlarToplamı=rakamlarToplamı+rakam;

        //-----------------------------------
        girilenSayı=girilenSayı / 10;
        rakam=girilenSayı % 10;
        rakamlarToplamı=rakamlarToplamı+rakam;

        System.out.println("Girilen sayının rakamlar toplamı: " +rakamlarToplamı);
    }
}
