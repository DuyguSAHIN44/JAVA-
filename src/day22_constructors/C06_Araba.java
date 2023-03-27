package day22_constructors;

public class C06_Araba {

    /*
    bir obje oluşturulurken default cons veya parametresiz görünür con kullanılırsa
    obje ilk atılan değerlere sahip olur. istediğimiz değerleri atamak için tek tek tüm variable lare
    atama yapmamız gerekir.

    Bunun yerine atamak istediğimiz değerleri parametre olarak constructor yollayalım
     ve atamaları consr. içinde yapalım*/

    @Override
    public String toString() {
        return "Araba Özellikleri {" +
                "yıl=" + yıl +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarlıMı=" + hasarlıMı +
                ", fiyat=" + fiyat +
                '}';
    }


    public C06_Araba(String mrk, String mdl, boolean hmi, int yl, int fyt) {
        yıl = yl;
        marka = mrk;
        model = mdl;
        hasarlıMı = hmi;
        fiyat = fyt;

    }

    public C06_Araba() {

    }

    int yıl;   // BURAYI YAZDIRMAK İÇİN: 1)Code 2)generate 3)tostring sonra araba runner a gidip (araba1) deyince hepsini yazıyor
    //YUKARIDA YAPTIM RETURN OLAN KISIM
    String marka = " Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    boolean hasarlıMı;
    int fiyat = 10000;

    public void yakıtTüketimi(String yakıtTürü) {

        switch (yakıtTürü) {
            case "Benzin":
                System.out.println("benzinli araçlar için yakıt tüketimi 6 l/100km ");
                break;
            case "Dizel":
                System.out.println("dizel araçlar için yakıt tüketimi 5 l/100km");
                break;
            case "Elektrik":
                System.out.println("elektrikli araçlar için yakıt tüketimi 5 kw/100km");
                break;
            default:
                System.out.println("geçersiz yakıt türü");

        }
    }

}
