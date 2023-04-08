package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C03_İfElseİf {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı alın
        //sayı 3 ile bölünebiliyora "3 ün katı",
        // 5 e bölünebiliyorsa "5 in katı",
        // sayı hem 3 ün hem de 5 in katıysa "3 ün ve 5 in katı",
        // ikisine de bölünemiyorsa "ne 3 ün katı ne de 5 in katı" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı= scan.nextInt();

        if (sayı % 3 ==0 && sayı % 5 ==0){
            System.out.println("Sayı 3 ün ve 5 in katı");
        } else if (sayı % 3==0){
            System.out.println("Sayı 3 ün katı");
        } else if (sayı % 5==0) {
            System.out.println("Sayı 5 in katı");
        }else {
            System.out.println("Sayı ne 3 ün ne de 5 in katı");
        }
        /*
        Eğer bir if else if... cümlesi else ile bitiyorsa
        MUTLAKA if body lerinden BİR TANESİ ÇALIŞIR
         */

    }
}
