package day02_dataTürleri_Skenner;

public class C02_DataTürleri {
    public static void main(String[] args) {

        char ilkHarf='D'; // tek tırnak içinde tek karakter
        char ilkSayı='6';

        byte yaş=15; // En doğru kullanım bu olur, hafıza kullanımını optimize etmek için
        short yaş1=16;
        int yaş3=14;
        long yaş4=17;

        double sayı1=5.1234567896544452;
        System.out.println(sayı1); // 5.123456789654445

        /*
        Double virgülden sonra 16 haneye kadar yazdırır

        Ondalık kısmın sonunda hatalar olabilir

         */

        float sayı2= 45.123456879855555555555f;

        // sonuna f veya F yazmak zorundayız
        System.out.println(sayı2); // 45.123455




    }
}
