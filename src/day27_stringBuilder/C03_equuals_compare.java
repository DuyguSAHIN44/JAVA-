package day27_stringBuilder;

public class C03_equuals_compare {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        // System.out.println(sb1==str);
        /*
        Java da farklı data türüne sahip
        non primitive objeler == ile karşılaştırılamazlar.
         */
        System.out.println(sb1==sb2); // false... her defasında new dosyası kurduğumuz için false verdi
        System.out.println(sb1==sb1); // true

        System.out.println(sb1.equals(sb2)); //false
        /*
         İçerik aynı olsa bile Stringbuilder da
         equals methodu false verir.
         Çünkü Stringbuilder Class ın da equals methodu yoktur
         Equals methodunu parent class ı olan object class ından
         kullanır ve bundan dolayı içeriklere bakmadan false verir
         STRİNGBUİLDER DE EQUALS İŞE YARAMAZ.
         */

        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true

        /*
        İki Stringbuilder in içeriklerinin aynı olduğunu
        kontrol etmek için compareTo() kullanılır.
         */

        System.out.println(sb1.compareTo(sb2)); // 0
        // System.out.println(sb1.compareTo(str)); // CTE

        StringBuilder sb3=new StringBuilder("Hava");
        StringBuilder sb4=new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); //-10
        System.out.println(sb3.compareTo(sb4)); // -12

        /*
        CompareTo() karşılaştırılan StringBuilderler aynı metne
        sahipse 0 döner
        Aynı değilse, baştan itibaren kontrole başlar.
        Farklı olan ilk harfin karşılaştırılan kelimedeki
        aynı indexdeki harfleri kaç harf ilerde olduğunu döndürür.
         */

    }
}
