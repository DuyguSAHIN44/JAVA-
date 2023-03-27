package day22_constructors;

public class C02_Hemşire {
    /*
    ÖRNEĞİN :  Bir hastane programında hastanede çalışacak hemşirelerin hangi bilgileri tutmak istıtorsak,
    hangi methodları hemşireler için kullanmak istiyorsak
    bir hemşire class ı oluşturup
    tüm bu özellikleri (variable ve method ları) o class da oluştururuz.

    Programda ne zaman bir hemşireye ihtiyaç olsa hemşire class ından
    obje oluştururuz.
    Böylece otomatik olarak tüm method ve variablelere sahip olur.

     ÇOK ÖNEMLİ: Eğer biz istediğimiz parametrelere sahip bir
     constructor oluşturmazsak java dan obje oluşturabilmesi için,
     class a default bir constructor koyar



   default cons. GÖRÜNMEZ
   parametresi yoktur.
   cons. body si boştur

   C02_ Hemşire (){
   }

   Biz de istediğimiz parametrelere sahip,
   istediğimiz kadar cons. oluşturabiliriz

   ÇOK ÇOK ÖNEMLİ: Eğer biz bir constructur
   yani class da gözle görünen bir constructur varsa
   default const. ı siler.
   Bizim oluşturduğumuz  hiçbir constructur
   default constructor DENEMEZ.







     */
    String isim="isim atanmamış";
    String soyisim;
    String telNo;
    String adres;
    int yaş;
    boolean izindeMi;
    char evliMi;
    int ekMesaiÜcreti=20;

    public int  mesaiÜcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiÜcreti;
    }
}
