package day27_stringBuilder;

public class C04_StringBuilderda_String_Methodları {
    public static void main(String[] args) {

        /*
        StringBilder Class ında olmayıp,
        String Class da olan methodları kullanmak istersek
        sb.toString() i kullanarak, StringBuilder i önce String e
        çevir sonra istediğimiz String methodları kullanırız.

        Bu konuda DİKKAT ETMEMİZ gereken konu
        String döndüren methodlar
        veya String Class ından kullanacağımız methodlar
        KALICI DEĞİŞİKLİK YAPMAZ

         */

        StringBuilder sb1=new StringBuilder("Java Candır.");
        StringBuilder sb2=new StringBuilder("Java candır.");

         sb1.substring(5);

        System.out.println(sb1); // Java Candır.

        // sb1=sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32... Büyük C ile küçük c arasındakı ASCII değeri farkı.

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true..
        // sb1 i toString e çevirdiğimizde
        //equalsIgnoreCase yi kullanabiliriz.

        sb1.subSequence(3,6);

        System.out.println(sb1); // Java Candır... değişiklik yapılsa bile String old için kalıcı olmaz.




    }
}
