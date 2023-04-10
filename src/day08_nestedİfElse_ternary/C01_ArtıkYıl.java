package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C01_ArtıkYıl {
    public static void main(String[] args) {

        //Kullanıcıdan artık yıl olup olmadığını kontrol etmek için yıl girmesini isteyin
        //Kural 1: 4 ile bölünmeyen yıllar artık yıl değildir
        //Kural 2: 4 ile bölünüp 100 ile bölünmeyen yıllar artık yıldır
        //Kural 3: 4 ün katı olmasına rağmen 100 ile bölünebilen yıllardan
        // sadece 400 ün katı olan yıllar artık yıldır

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz");
        int yıl= scan.nextInt();

        if (yıl % 4 !=0){
            System.out.println("Artık yıl değildir");
        } else if (yıl % 100 !=0) {
            System.out.println("Artık yıldır");
        } else if (yıl % 400 ==0) {
            System.out.println("Artık yıldır");
        }else {
            System.out.println("Artık yıl değildir");
        }
    }
}
