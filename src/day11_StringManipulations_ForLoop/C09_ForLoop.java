package day11_StringManipulations_ForLoop;

public class C09_ForLoop {
    public static void main(String[] args) {

        // 50 den başlayıp, 100 e kadar (100 dahil)
        // sayıları yan yana, aralarında bir boşluk olacak şekilde yazdırın

        for (int i = 50; i <=100; i++) {
            System.out.print(i +" ");

        }

        System.out.println("");

        // 3 basamaklı sayılardan 23 ile bölünebilenleri
        // yan yana, aralarında bir boşluk olacak şekilde yazdırın

        for (int i= 100; i <=999; i++) {
            if (i % 23 == 0) {
                System.out.print(i + " ");

            }
        }
            System.out.println("");

        // 20 den başlayıp, 7 şer artarak 100 e kadar yazdırın
        // (100 yazdırmanız gerekiyorsa yazdırın ama geçirmeyin)

        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i +" ");

        }

        System.out.println("");

        // 100 den başlayarak 1 e kadar (sınırlar dahil)
        // 7 ile bölünebilen sayıları yazdırın

        for (int i =100; i>=1 ; i--) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }






    }
}
