package day31_inheritance;

public class Hemşire extends FMuhasebe {
    String ünvan="Hemşire";
    public void standartMaaş(){
        System.out.println("Hemşireler min");
    }
    public void özelSigorta(){
        System.out.println( "Hemşireler aylık 300 ");
    }
    public void nöbetÜcreti(int nöbetSayısı){
        System.out.println(nöbetSayısı*200);




        }

    public static void main(String[] args) {
        Hemşire hemşire=new Hemşire();
        hemşire.method();
    }

    public void method(){

        System.out.println(this.ünvan); // hemşire
        System.out.println(super.ünvan); //personel ünvanı belirtilmemiş
        System.out.println(this.sgkNo); // Çalışan sgk no
        System.out.println(super.sgkNo);//Çalışan sgk no
        this.standartMaaş();//10000
        this.fazlaMesai(3);//600
        super.fazlaMesai(4);// 800
        this.özelSigorta();//300
        super.özelSigorta(); // personel


    }
    }




