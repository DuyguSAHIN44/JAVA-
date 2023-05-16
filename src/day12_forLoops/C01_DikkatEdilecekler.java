package day12_forLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {


        for (int i =20; i <10; i++) {
            System.out.println(i +" ");
        }

        // for loop çalıştı ancak ilk değer için bitiş değeri false verdiğinden
        // loop body si HİÇ DEVREYE GİRMEDİ


        for (int i = 0; i <10 ; i++) {
            System.out.println(i +" ");
        }

        // Loop başladıktan sonra artış/azalış yöntemi sebebiyle
        // bitiş değerinden uzaklaşıyorsa, loop teorik olarak sonsuza kadar çalışır
        //  buna SONSUZ LOOP denir
    }
}
