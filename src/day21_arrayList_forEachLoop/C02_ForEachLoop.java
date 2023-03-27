package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        /*
        Bizden istenen görevde sırama önemsiz ise asıl amaçlanan
        tüm elementlerielden geçirmek ise forLoop yerine For Eacg tercih edilir.

        For Each Loop da;
           - index YOK
           -başlangıç değeri YOK
           -bitiş değeri YOK
           -BÜTÜN ELEMENTLERİ TEK TEK GETİRİR

         */

        int [] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        //arr in tüm elementlerinin toplamını yazdırın




        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;

        }
        System.out.println("Elementler toplamı: " + toplam); // Elementler toplamı: 72


        // arr in elementlerinfen 3 ile bölünebilenleri yazdırın

        for (int each:arr
             ) {
            if (each % 3==0) System.out.print(each + " ");  // 3 6 3 3 3

        }
        System.out.println("");


        // arr in elementleri içinde kaç tane tek sayı old bulun

        int sayac=0;
        for (int each:arr
             ) {
            if (each % 2 !=0)sayac++;

        }
        System.out.println("Array deki tek sayı adedi : " + sayac); // Array deki tek sayı adedi : 10

    }
}
