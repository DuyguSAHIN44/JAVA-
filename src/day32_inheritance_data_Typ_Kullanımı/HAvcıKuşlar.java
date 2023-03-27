package day32_inheritance_data_Typ_Kullanımı;

public class HAvcıKuşlar extends GKuşlar{


    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");

    }

    public static void main(String[] args) {
        HAvcıKuşlar kartalAvcı=new HAvcıKuşlar();
        kartalAvcı.hareket();// H uçarlar

        kartalAvcı.kanat();// G kanatlıdır
        kartalAvcı.solunum();// data türleri aynı old için burda yok sonra parent a gitti
        kartalAvcı.cogalma();//yumurtayla çoğalır



        GKuşlar kuşlar=new GKuşlar();

        kuşlar.hareket();// F hareket ederler
        kuşlar.beslenme();//F beslenirler
       // kuşlar.pence;// CTE
        kuşlar.gaga();// G gagaları vardır

        kuşlar.kanat();// G kanatlıdır
        kuşlar.solunum();// data türleri aynı old için burda yok sonra parent a gitti
        kuşlar.cogalma();// G yumurta


        GKuşlar kartalKuş=new HAvcıKuşlar();
        kartalKuş.hareket();// H uçarlar
        kartalKuş.beslenme();//H ET YERLER
      //  kartalKuş.pence;// CTE
        kartalKuş.gaga();// H sivri gagalıdır

        kartalKuş.kanat();// G kanatlıdırlar
        kartalKuş.solunum();//  G akciğer( override nin YÖNÜ ÖNEMLİ, En Güncele bakar)
        kartalKuş.cogalma();// G yumurta

        kartalAvcı.ömür();// yaşar ve ölürler



        FHayvan hayvanlar=new FHayvan();// aynı ise bu classtan başlıyoruz, ilk bulduğumuz değeri yapıştırırz (SADECE BU CLAASS a bakarız)ve override bakmıyoruz
        hayvanlar.hareket();// F hareket ederler
        hayvanlar.beslenme();//F Beslenirle
        //  hayvanlar.pence;// CTE
       // hayvanlar.gaga();// CTE

       // hayvanlar.kanat();// CTE
        hayvanlar.solunum();//  F solunum
        hayvanlar.cogalma();// F Çoğalırlar


        FHayvan kartalHayvan=new HAvcıKuşlar();// aramaya hayvanlar classından basliyoruz data farklı old için override bakıyoruz
        kartalHayvan.hareket();// H uçarlar
        kartalHayvan.beslenme();//H Et yerler
       // kartalHayvan.pence;// CTE
       // kartalHayvan.gaga();// CTE

       // kartalHayvan.kanat();// CTE
        kartalHayvan.solunum();//  G akciğer
        kartalHayvan.cogalma();// G yumurta
        /*
        Özellikler method olarak oluşturulmuş ise
        data türü ve cons. aynı ise o class tan
        aramaya başlarım
        bulduğum ilk değeri kullanırım

        Data türü ve cons. farklı ise
        data türü olan classtan aramaya başalr (GKuşlardan baslar=
        o classs veya parent classlarında
        bulamazsa CTE verir

        o class veya parent classlarında bulursa override
        edilmiş mi kontrol eder ve en güncel bilgiyi bulup yazdırır

         */
    }
}