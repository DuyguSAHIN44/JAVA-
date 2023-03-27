package day34_abstractClasses_interfaces;

public class CAvcıKuşlar extends BKuşlar {
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }

    @Override
    public void ömür() {
        System.out.println(" Avcı kuşlar ortalama 10 yıl yaşar");

    }

    public void pence(){

        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");

        CAvcıKuşlar kartal=new CAvcıKuşlar();
        CAvcıKuşlar şahin=new CAvcıKuşlar();

       // BKuşlar kuş= new BKuşlar(); { ABSTRACT CLASS lardan obje oluşturulamaz
        AHayvan baykuş=new CAvcıKuşlar();
        baykuş.hareket();
        baykuş.solunum();
        baykuş.beslenme();
        baykuş.cogalma();
        baykuş.ömür();// body yok AHayvan da



    }
}
