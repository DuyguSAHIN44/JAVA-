package day34_abstractClasses_interfaces;

public abstract class EBalık extends AHayvan{
    public void hareket(){
        System.out.println("Balıklar yüzer");
    }
    public void solunum(){
        System.out.println("Balıklar solungaç solunumu yapar");
    }
    public void çoğalma(){
        System.out.println("Balıklar yumurta ile çoğalır");
    }
    public abstract void yüzgeç();
      public abstract void yaşamAlanı();
      public abstract void iskeletYapısı();

    }


