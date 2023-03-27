package day37_throwKeyWord;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class C01_ThrowKeyWord {
    public static void main(String[] args) {

        /*
        Kodlari yazarken bazen muhtemel bir durumda
            bazi kodlarin ignore edilmesi istenebilir
​
            bu durumda kodlari IGNORE etme yontemi olarak
            isteyerek exception firlatip
​
            sonra da calismasini istedigimiz yerde
            catch ile yakalayip yolumuza devam edebiliriz
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yaş = scan.nextInt();
        try {


            if (yaş < 0) {
                throw new IllegalArgumentException("Yanlış formatta giriş yapıldı");//

            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}



