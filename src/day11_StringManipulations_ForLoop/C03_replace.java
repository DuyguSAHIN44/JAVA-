package day11_StringManipulations_ForLoop;

public class C03_replace {
    public static void main(String[] args) {

        // REPLACE---YER DEĞİŞTİRME
        // hem stringler hem de char ifadeleri yapabiliriz
        // diyelim ki "a" değiştirilecek str.replece dediğimizde bütün a ları değiştirir

        String str="Java Candır";

        System.out.println(str.replace("J","H")); // Hava Candır
        System.out.println(str.replace("j","k")); // Java Candır-- KÜÇÜK k OLMADIĞI İÇİN YAZMADI

        System.out.println(str.replace("a","")); // Jv Cndır

        System.out.println(str.replace("Java","X")); // X Candır

        System.out.println(str.replace("v","yayaya")); //Jayayayaa Candır


        // str daki space leri yok edin
        str=str.replace(" ","");
        System.out.println(str); // JavaCandır

        System.out.println(str.replaceFirst("a","")); // JvaCandır

    }
}
