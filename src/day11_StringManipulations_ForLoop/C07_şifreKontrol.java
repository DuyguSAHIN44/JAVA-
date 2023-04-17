package day11_StringManipulations_ForLoop;

public class C07_şifreKontrol {

    public static void main(String[] args) {

          /*
         Soru 4 : Kullanicidan bir sifre isteyip,
          asagidaki sartlari kontrol edin ve kullaniciya
         duzeltmesi gereken tum eksikleri soyleyin,
         eger tum sartlari saglarsa, "sifre
         basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
          */

        // Soruyu if else ile yaparsak sadece 1 hata yazdırır, ötekilere bakmaz
        // bağımsız 4 if else cümlesi olmalısağladığını kontrol eden bir variable (flag) kullanacağız
        // en sonda 4 şartı da

        int flag=0;
        String şifre="123";


        // ilk harf kucuk harf olmali
        if (şifre.charAt(0)>='a' && şifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("İlk karakter küçük harf olmalı");
        }


        //son karakter rakam olmali
        int sonHarf=şifre.charAt(şifre.length()-1);

        if (sonHarf>='0'&& sonHarf<='9'){
            flag++;
        }else {
            System.out.println("Son karakter rakam olmalı");
        }


        // sifre bosluk icermemeli
        if (şifre.contains( " ")){
            System.out.println("Şifre boşluk içermemeli");
        }else {
            flag++;
        }

        // uzunlugu en az 10 karakter olmali
        if (şifre.length()>=10) {
            flag++;
        }else {
            System.out.println("Şifre en az on karakter olmalıdır");
        }

        // Eğer şifre tüm şartları sağlarsa, bunu nasıl kontrol edeceğiz??
        //eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

        if (flag==4) {
            System.out.println("sifre basariyla kaydedildi");


        }
    }
}
