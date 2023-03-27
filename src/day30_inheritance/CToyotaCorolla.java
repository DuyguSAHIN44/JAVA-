package day30_inheritance;

public class CToyotaCorolla extends BToyota{

    String lastik="Lassa 255-55-15";
    String model="Corolla";
    String yakıt="Corolla dizel benzinli ve elektrikli olabilir";

    public void motor(){
        System.out.println("Corolla araçlar Türkiye de üretilen motor kullanır");

    }
    public void üretiYeri(){
        System.out.println("Türkiye de üretilir");
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla =new CToyotaCorolla();
        System.out.println(corolla.lastik); // Lassa 255-55-15
        System.out.println(corolla.model); //Corolla (BU CLASS DA VAR BURDAN ALIR
        System.out.println(corolla.yakıt); //Corolla dizel benzinli ve elektrikli olabilir
        corolla.motor();// bu classtan alır
        System.out.println(corolla.marka);//Toyota
        System.out.println(corolla.akü); //Toyota
        corolla.güvenlik();// Toyota
        System.out.println(corolla.vites);// Araba

    }

}

