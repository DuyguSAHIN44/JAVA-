package day08_nestedİfElse_ternary;

public class C06_Ternary {
    public static void main(String[] args) {

        // Ternary operatorü ya direkt sout içerisinde kullanılır
        // veya bir değişkene atama yapılacak şekilde yazılır

        int sayı=20;

       // sayı%2==0 ? "Çift sayı" :"tek sayı";---BU ŞEKİLDE KABUL ETMEZ

        System.out.println(sayı % 2==0 ? "Çift sayı" :"tek sayı"); // YA BU ŞEKİLDE

        String sonuç=sayı % 2==0 ? "Çift sayı" :"tek sayı"; // YA DA BU ŞEKİLDE OLMALIDIR

        //Eğer true olduğundaki sonuç ile false olduğundaki sonuç
        // farklı data türlerinde olursa YAZDIRILABİLİR AMA ATAMA YAPILAMAZ

        // sayı çift ise "çift yazdırın"----SONUÇ--STRING
        // değilse sayının 2 katını yazdırın--SONUÇ--INT

        System.out.println(sayı % 2==0 ? "Çift sayı" :"2*sayı"); // YAZDIRABİLİRİZ

      //  int sonuç2=sayı % 2==0 ? "Çift sayı" :"2*sayı"; -----ANCAK ATAMA YAPAMAYIZ---STRING--INT

    }
}
