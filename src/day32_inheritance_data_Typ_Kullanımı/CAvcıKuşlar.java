package day32_inheritance_data_Typ_Kullanımı;

public class CAvcıKuşlar extends BKuşlar {


    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidirler";
    String gaga = "sivri gagali";

    public static void main(String[] args) {
        CAvcıKuşlar kartalAvcı=new CAvcıKuşlar();
        System.out.println(kartalAvcı.hareket); // C ucarlar
        System.out.println(kartalAvcı.beslenme);// C et yerler
        System.out.println(kartalAvcı.pence);// C pençelidir
        System.out.println(kartalAvcı.gaga);//C sivri gagalı

        System.out.println(kartalAvcı.kanat);// B kanatlıdır
        System.out.println(kartalAvcı.solunum);// B akciğerle
        System.out.println(kartalAvcı.cogalma); //B yumurtayla

        System.out.println(kartalAvcı.omur);// A yaşar ve ölürler


       BKuşlar kartalkus=new CAvcıKuşlar();   // EN GÜNCEL BİLGİ BURDA
        System.out.println(kartalkus.hareket); //  ilk bakacagim yer BKuşlar , sonra parent a nakacağız
        System.out.println(kartalkus.beslenme);// A beslenirler
        // System.out.println(kartalkus.pence);// ikisinde de yok CTE
        System.out.println(kartalkus.gaga);//  B gagaları vardır

        System.out.println(kartalkus.kanat);// B kanatlıdır
        System.out.println(kartalkus.solunum);// B akciğer
        System.out.println(kartalkus.cogalma); //B yumurtayla

        System.out.println(kartalkus.omur);// A yaşar ve ölürler


        AHayvanler kartalHayvan =new CAvcıKuşlar();
        System.out.println(kartalHayvan.hareket); //  ilk bakacagim yer unt AHayvanlar
        System.out.println(kartalHayvan.beslenme);// A beslenirler
        //System.out.println(kartalHayvan.pence);// CTE
        //System.out.println(kartalHayvan.gaga);//  CTE

        //System.out.println(kartalHayvan.kanat);// CTE
        System.out.println(kartalHayvan.solunum);// A nefes alırlar
        System.out.println(kartalHayvan.cogalma); // A coğalırlar

        System.out.println(kartalHayvan.omur);// A yaşar ve ölürler


        //Variable olarak özellikleri oluşturursak
        BKuşlar kuşlar=new BKuşlar(); // BUurda avcıkuşlardan bahsedemeyiz.
        BKuşlar avcıkuşlar=new CAvcıKuşlar();
        // Bu iki obje arasında bir fark göremeyiz.Her ikisi de kuşlardan bakar.

        // inheritance YUKARI DOĞRU çalışır

       /*
       Eğer 1 obje oluşturulurken data türü ve cons. aynı ise
       aradığımız özellikler için direkt o class a gider
       ve özelliklerini ararız



       Eğer data türü ve cons farklı ise (BKuşlar ve CAvcıkuşlar.. kuş olan avcı kuşa bakıyoruz)
       variable ve methodlar farklı davranırlar.

        Variableler, önce data türünün old class a bakar
        o variable yi bulursa
        değerini yazdırır
        bulamazsa data türünün parentlerina bakar
        orada bulursa değerini yazdırır
        orada da bulamazsa CTE verir


        Özetle bir özell. bir variable olarak oluşturursak
        data türü olan class ve parentlerindaki
        ortak özelliklere bakar
        ve
        Ortak bilgileri arar,
        en güncel bilgiyi aramaz

        EĞER ORTAK ÖZELLİKLERİ VERMEK İSTİYORSAK
        VARIABLE OLUŞTURMALIYIZ.
        */

    }

    }


