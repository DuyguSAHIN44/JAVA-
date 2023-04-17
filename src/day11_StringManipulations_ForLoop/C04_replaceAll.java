package day11_StringManipulations_ForLoop;

public class C04_replaceAll {

    public static void main(String[] args) {

        String str="J12a3v45a 6C4a6n5d8ı6r";

        // str deki sayıları methodla temizleyin

        /*
        Eğer değiştirmek istediğimiz metin tek bir metin değil,
        ortak özelliği olan farklı metinlerse

        -tüm sayılar
        - sayı olmayanların tümü
        -tüm spaceler
        -space olmayan tüm karakterler

        bu ortak özellikleri belirtmek için Java regex tanımlamıştır
         */

        str=str.replaceAll("\\d","");
        System.out.println("str nin yeni hali: " +str); // str nin yeni hali: Java Candır

    }
}
