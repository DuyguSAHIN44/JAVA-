package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C04_İfElseİf {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı alın
        //sayı 3 ile bölünebiliyora "3 ün katı",
        // 5 e bölünebiliyorsa "5 in katı",
        // sayı hem 3 ün hem de 5 in katıysa "3 ün ve 5 in katı",

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı= scan.nextInt();

        if (sayı % 3==0 && sayı % 5==0){
            System.out.println("Sayı hem 3 ün hem de 5 in katı");
        } else if (sayı % 3==0) {
            System.out.println("Sayı 3 ün katı");
        }else if (sayı % 5==0){
            System.out.println("Sayı 5 in katı");
        }
        /*
        Bazen şartlar olası tüm durumları karşılamaz
        bu durumda if else if... cümleleri else ile BİTMEZ

        Else ile bitmeyen if else if ... cümlelerinde
        bazı durumlarda hiç bir if body si devreye girmeyebilir
         */

        }
    }


