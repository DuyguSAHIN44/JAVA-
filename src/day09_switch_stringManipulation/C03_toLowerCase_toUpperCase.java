package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Candır";

         // str i büyük harf olarak yazdırın

        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str); // Java Candır

        // String manipulation yaptıktan sonra, asıl variable ye atama yapılamazsa
        // asıl variable değişmez

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR --- ATAMA YAPTIK VE KALICI HALE GELDİ

        System.out.println(str.toLowerCase()); // java candır--- KÜÇÜK HARF OLDU AMA ATAMA YAPMADIĞIMIZ İÇİN KALICI HALE GELMEDİ



        // str i Türkçe karakterleri göz önünde bulundurarak küçük harfe çevirin

        str=str.toLowerCase(Locale.forLanguageTag("TR")); // Türkçe ye çevirip atadık
        System.out.println(str); // java candır---yazdırdık
    }
}
