package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_ÇokluExceptions {
    public static void main(String[] args) {

        String str = "Javaher geçen gün güzelleşiyor";
        int[] arr = {3, 4, 6, 3, 6, 7, 4, 2, 5, 7};

        // Kullanıcıdan 0 veya pozitif bir tamsayı isteyin
        // girilen değeri index olarak kullanıp
        //str ve arr nin o index deki elemanları yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("İndex olarak kullanmak için 0 veya pozitif bir tamsayı girin");




        // Birbirinden bağımsız 3 farklı türde exception riski var
        // Bunları farklı şekillerde handle edebiliriz (yaparsak basit kaçar)
        // 1- herbirini ayrı ayrı try catch yapabiliriz
        // 2- tek bir try birden fazla catch yapabiliriz ( bu daha güzel)
        //3- Tek bir try catch yapıp tüm exceptionları  yakalayacak bir exception yazılabilir




        try {
            int index= scan.nextInt(); // (InputMismatchException )exception verme ihtimalı var

            System.out.println(str.charAt(index)); //(StringIndexOutOfBoundsException) exception verme ihtimalı var ( fazla sayı girebiliriz)

            System.out.println(arr[index]); // (ArrayIndexOutOfBoundsException) exception verme ihtimalı var
        } catch (InputMismatchException e) {
            System.out.println("Tamsayı girmelisin");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sınırları dışında");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sınırları dışında ");
        }

        try {
            int index = scan.nextInt(); // (InputMismatchException )exception verme ihtimalı var

            System.out.println(str.charAt(index)); //(StringIndexOutOfBoundsException) exception verme ihtimalı var ( fazla sayı girebiliriz)

            System.out.println(arr[index]);
        } catch (RuntimeException e) {
          //  System.out.println("Giriş hatalı olabilir, index String veya Array in dışında olabilir");
            e.printStackTrace();
            // Biz mesaj yazacaksak genel bir mesaj yazabilirz
            //veya javanın hata kodlarını yazdırabiliriz
        }


    }
}
