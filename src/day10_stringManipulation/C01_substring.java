package day10_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ne kadar güzel";

        // SUBSTRİNG İKİ FARKLI ŞEKİLDE KULLANILABİLİR

     //   1) Tek parametre olursa, o index den başlar sonuna kadar yazdırır


        System.out.println(str.substring(8)); // kadar güzel

        System.out.println(str.substring(0)); // Java ne kadar güzel
        System.out.println(str.substring(str.length()-3)); // zel

        System.out.println(str.substring(str.length())); // hiçlik
       // System.out.println(str.charAt(str.length())); str in uzunluğu 19, son harfin index i 18
        //                                             19.index de karakter yok


     //  2)İki parametre girilirse başlangıçIndex inden(dahil) başlar
        //  bitişIndex ine(hariç) kadar olan bölümü yazdırır

        System.out.println(str.substring(5,7)); // ne
        System.out.println(str.substring(3,4)); // a
        System.out.println(str.substring(0,1)); // J

        // str nın 5.index deki karakteri yazdırın
        System.out.println(str.charAt(5)); // n

        System.out.println(str.substring(5,6)); //n

        System.out.println(str.substring(2,2)); // hiçlik
        System.out.println(str.substring(5,1)); // StringIndexOutOfBoundsException --GERİYE GİTMEZ





    }
}
