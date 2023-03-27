package day22_constructors;

public class C04_Doktor {

    C04_Doktor(){
        System.out.println("Parametresiz constructor çalıştı");
    }

    String isim="isim atanmamış";
    String soyisim;
    String telNo;
    String adres;
    int yaş;
    char evliMi;
    int ekMesaiÜcreti = 30;

    public int mesaiÜcretiHesapla(int mesaiSaati) {

        return mesaiSaati * ekMesaiÜcreti;
    }
}

