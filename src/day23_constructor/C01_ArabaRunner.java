package day23_constructor;

public class C01_ArabaRunner {
    public static void main(String[] args) {

        Araba araba1=new Araba();  // Araba Bilgileri:yıl=0, marka='Marka belirtilmemiş', model='Model belirtilmemiş', hasarlıMı=false, fiyat=0
        System.out.println(araba1); // Araba Bilgileri:yıl=0, marka='Volvo', model='Model belirtilmemiş', hasarlıMı=false, fiyat=15000}
        araba1.fiyat=15000;
        araba1.marka="Volvo";

        System.out.println(araba1);
        Araba araba2=new Araba(10000,"BMW");
        System.out.println(araba2); // Araba Bilgileri:yıl=0, marka='BMW', model='Model belirtilmemiş', hasarlıMı=false, fiyat=10000}

    }
}
