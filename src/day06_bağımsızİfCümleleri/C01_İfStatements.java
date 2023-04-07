package day06_bağımsızİfCümleleri;

public class C01_İfStatements {
    public static void main(String[] args) {
        /*
        Buradaki şartlar birbirinden bağımsızdır
        Uygun sayılar olursa 3 if body si de çalışabilir.
        Bazen de hiçbir if body si devreye girmeyebilir

        Kodumuz konsolda hiçbir şey yazdırmadı ancak
        Process finished with exit code 0
        yazmasından kodun hiçbir sorun olmadan
        çalıştığını anlıyoruz

        Sadece değerler şartları sağlamadığı için
        konsolda hiçbir şey yazdırmadı

         */
        int a = 13;
        int b = 44;
         if (a>b){
             System.out.println("a b'den büyüktür");
         }
         if (a<b){
             System.out.println("b a'den küçüktür");
         }
         if (a%2==0){
             System.out.println("a tek sayıdır");
         }


         boolean sonuç=a*7>b;
         /*
         Bazen if statement de direkt boolen bir değer şart olarak yazılabilir
         Bu durumda boolen variable değeri true ise if body çalışır
         False ise if body çalışmaz
          */

         if (sonuç){ // sonuç boolen old için tekrar true yazmaya gerek yoktur
             System.out.println("İstenen sonuç sağlandı"); // İstenen sonuç sağlandı
         }

    }
}
