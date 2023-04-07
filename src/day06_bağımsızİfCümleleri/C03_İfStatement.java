package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C03_İfStatement {
    public static void main(String[] args) {

        // Soru 4: Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın,
        // üçgen eşkenar ise "Eşkenar üçgen" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz \n Sonra da enter tuşuna basınız");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

       // Java da 3 lü karşılaştırmalar Yoktur
        // Onun yerine ikili karşılaştırmalar yapıp && ile birleştirebiliriz

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0){
            System.out.println("Eşkenar üçgen");
        }

    }
}