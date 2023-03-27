package day36_exceptions;

public class C03_TryCatch {
    public static void main(String[] args) {
         int sayı1=20;
         int sayı2=0;

        try {
            System.out.println(sayı1/sayı2);// Burada bölen 0 olursa; try da hiçbir şey yazdırmaz direkt exceptiona (catch) gider
            //eğer exception olmazsa try çalışır, catch kısmı hiç çalışmaz
            System.out.println(" DENEME1");
            System.out.println("DENEME2");
            System.out.println("DENEME3");

        } catch (ArithmeticException e) {
            System.out.println("Bölen sıfır olmamalı");

            /*
            Bir try bloğunda exception oluşursa, o satırdan
            catch satırına kadar aradaki tüm kodlar ignore edilir(çalışmaz)
            Eğer try bloğunda exception oluşmazsa catcgh devreye girmez ( if else gibi)

             */
        }
    }
}
