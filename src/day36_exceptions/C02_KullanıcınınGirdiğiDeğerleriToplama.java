package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanıcınınGirdiğiDeğerleriToplama {

    public static void main(String[] args) {

        // Kullanıcıdan istediği kadar tamsayı alıp toplayın
        // Kullanıcı q ya bastığında işlemi sonlandırıp
        // kaç sayı girdiğini ve toplamını yazdırın
        // q veya Q dışında tam sayı olmayan bir değer girilirse hata
        // mesajı verip değer isteyerek işleme devam edin

        int sayaç = 0;
        int toplam = 0;
        int girilenSayı = 0;  // Kullanıcının kaç sayı gireceğini bilmiyoruz q ya basınca bitecek

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Toplanmak üzere tamsayı giriniz.\nBitirmek için Q ya basınız");

            try {
                girilenSayı = scan.nextInt();//  1) q veya Q veya 2) geçersiz input girirse exception oluşur
                toplam += girilenSayı;// Q harfi yerine farklı bir harf veya dooblea girebilir onun için
                sayaç++;  // exception verebilir buradaki 3 ünu seçip code bastık

            } catch (InputMismatchException e) { // hangi sorun ile karşılaşacaksak onu yazıyoruz

                char input = scan.next().charAt(0);

                if (input == 'q' || input == 'Q') {
                    System.out.println("girilen " + sayaç + " adet tamsayının toplamı: " + toplam);
                    break;
                } else {// q veya Q değilse
                    System.out.println("Tamsayı değeri girmelisiniz");
                }

            }
        }
                while (true) ;
                System.out.println("Bu iş bu kadar");


            }
        }
