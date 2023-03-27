package day20_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C09_FibonacciDizisi {
    public static void main(String[] args) {

        // SORU 4 : Verilen pozitif bir n tamsayısını alarak,
        // bize ilk n tane tane Fibonacci sayısını bir list olarak döndüren bir method oluşturun.

        //0 1 1 2 3 5 8 13 21 34...

       // int sayıAdedi=10;// 10 tane

        System.out.println(istenenSayıdaFibonacciSayısıListele(10));
        System.out.println(istenenSayıdaFibonacciSayısıListele(44));

    }
    public static List<Integer>istenenSayıdaFibonacciSayısıListele(int sayıAdedi){

        List<Integer>fibonacciSerisi=new ArrayList<>();

        if (sayıAdedi<=0){
            System.out.println("Yanlış giriş");
        } else if (sayıAdedi==1) {
            fibonacciSerisi.add(0);

        } else if (sayıAdedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            int ilkSayı=0;
            fibonacciSerisi.add(ilkSayı);
            int ikinciSayı=1;
            fibonacciSerisi.add(ikinciSayı);
            int yeniSayı=ilkSayı+ikinciSayı;
            fibonacciSerisi.add(ilkSayı+ikinciSayı);

            while (fibonacciSerisi.size()<sayıAdedi){
                ilkSayı=ikinciSayı;
                ikinciSayı=yeniSayı;
                yeniSayı=ilkSayı+ikinciSayı;
                fibonacciSerisi.add(yeniSayı);

            }
        }
        return fibonacciSerisi;
    }
}
