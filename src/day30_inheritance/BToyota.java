package day30_inheritance;

public class BToyota extends Araba{// tümaraba özell sahip old. içn extends yaptık

    String marka="Toyota";
    String akü="İnce akü kullanır";
    String lastik="Bridgestone";

    public void motor(){
        System.out.println("Toyotalar çevreci toyota motorlar kullanır");

    }
    public void güvenlik(){
        System.out.println("Toyota extra güvenlik önlemleri barındırır");
    }

}
