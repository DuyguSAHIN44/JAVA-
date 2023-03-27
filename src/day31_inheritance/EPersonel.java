package day31_inheritance;

public class EPersonel {

    String isim="İsim belirtilmemiş";
    String ünvan="Personel ünvan belirtilmemiş";
    boolean izindeMi;

    public void standartMaaş(){
        System.out.println("Personel askeri ücreti:"+8500);
    }
    public void özelSigorta(){
        System.out.println("Personelden katkı payı alarak");
    }

}
