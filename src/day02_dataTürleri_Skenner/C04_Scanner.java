package day02_dataTürleri_Skenner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);

        // 1. adim : Scanner objesi oluşturun



        System.out.println("Lütfen isminizi giriniz");

        // 2.adım: Kullanıcıdan ne istedinizi söyleyin

        String isim=scan.nextLine();

        // 3.adım:girilen bilgiyi içine
        // koyacağımız bir variable oluşturun
        // Oluşturduğumuz scanner objesi ile uygun methodu
        // kullanarak bilgiyi alın

        System.out.println("Girilen isim :" +isim);


    }
}
