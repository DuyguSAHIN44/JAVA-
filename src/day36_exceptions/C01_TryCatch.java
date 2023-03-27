package day36_exceptions;

public class C01_TryCatch {
    public static void main(String[] args) {


    /*
    Kodları yazarken sorun oluşma ihtimali gördüğümüzde
    sorun çıkma potansiyeli olan kodları
    try -catch ve gerekirse finaly blokları ile
    çevreleriz
     */
        int sayı1 = 20;
        int sayı2 = 0;

        try {

            System.out.println(sayı1 / sayı2);

        } catch (ArithmeticException e) {
          //  e.printStackTrace();
            // e.printStackTrace(): exception da gördüğümüz tüm hata açıklamalarını yazdırır

            //System.out.println("Bölen sayı 0 olamaz"); Normal yazdı

          //  System.out.println(e.getMessage()); // hatanın kaynağını gösterdi ( by zero )

          // System.out.println(e.getCause()); null-- boş
        }
        /*
        Bir try catch bloğu 3 bölümden oluşur

       1- try bloğu: 16-20 (hariç) satır
        exception oluşturma potansiyeli olan kodları yazarız

        2- catch statement (Exception e)
        catch statement:
        ArithmeticException: oluşma ihtimali olan exception
        e: karşılaştığı exception ı kaydedeceğimimz obje

        3- catch bloğu:20-27(hariç): öngörülen exception gerçekleştiğinde
        çalışmasını istediğimiz kodlar
         */
    }
}