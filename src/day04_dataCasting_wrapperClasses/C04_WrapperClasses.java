package day04_dataCasting_wrapperClasses;

public class C04_WrapperClasses {
    public static void main(String[] args) {


        /*
        non-primitive data türlerinin hazır methodları varken
        primitive data türlerinin hazır methodları yoktur
        Java  primitive data türleri için, kolayca geçiş yapabilecekleri
         non primitive data türleri oluşturmuştur

         int===>Integer
         char==>Character
         byte==>Byten==>Boolean
         BUNUN NE FAYDASI VAR?? Integer. dersek bir sürü seçenek çıkıyor YANİ hazır methodları var:)))
         */

        Integer sayı=10;
        //int variable a atadığımız değerleri atayabiliyoruz ve hazır methodları var
        //variable oluşturmadan da bazı methodları kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE); // -2147483648

        String sonuçStr="345";

        // sonuca 10 ekler mi
        System.out.println(sonuçStr+10); // HAYIR 34510----1.YÖNTEM

        int sonuç=Integer.parseInt(sonuçStr);
        System.out.println(sonuç+10); //355
        System.out.println("----------------------------------------");
        sonuç=Integer.valueOf(sonuçStr);
        System.out.println(sonuç+10); //355-----------2.YÖNTEM

        char krk='3';
        System.out.println(Character.isDigit(krk)); // true
        System.out.println(Character.isLetter(krk)); // false




    }
}
