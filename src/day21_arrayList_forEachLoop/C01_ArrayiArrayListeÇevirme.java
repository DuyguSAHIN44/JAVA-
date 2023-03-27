package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeÇevirme {
    public static void main(String[] args) {

        int [] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

         // arr array inin elementlerini içeren bir arrayList

        List<Integer> sayılar=new ArrayList<>();

        for (int i=0; i< arr.length; i++){
           sayılar.add(arr[i]);

        }
        System.out.println("sayılar listesi: " +sayılar); // sayılar listesi: [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]

        /*
        Java da bir array i arrayList e çevirmek için kullanılan asList() vardır.
        Ancak kullanımı tavsiye edilmez. Çünkü 2 tane büyük dezavantajı vardır.

        DEZAVANTAJLARI:

        1) asList() kullanılarak array den List e çevrilen listelerde
        ekleme / silme gibi uzunluğu değiştiren methodlar kullanılamaz.

        2) Arka planda array ve array dendönüştürdüğümüz list beraber hareket eder.
        Birinde yaptığımız update ler ötekine de işlenir.
         */
        List<int[]> arraydenList= Arrays.asList(arr);
        System.out.println("Array den liste çevrilen : " + arraydenList);

        // 2 listeye de 11 ekleyelim.


        sayılar.add(11);
       // arraydenList.add(11); // Unsupported0perationException
        System.out.println("sayılar listesi : " + sayılar);
        System.out.println("Array den liste çevrilen: " + arraydenList);

        // iki listin 0.indexindeki elementleri silelim.  // UnsupportedOperationException

        sayılar.remove(0);
        arraydenList.remove(0);

        System.out.println("sayılar listesi : " + sayılar);
        System.out.println("Array den liste çevrilen: " + arraydenList);

        // 2. DEZAVANTAJ
        System.out.println("Array          : "+ Arrays.toString(arr)  ); // ikisi de aynı
        System.out.println("Array den list : "+ arraydenList);

        // array in bir elementine yeni değer atayalım

        arr[0]=22;

        System.out.println("=========array i değiştirdikten sonra=====");
        System.out.println("Array          : "+ Arrays.toString(arr)  ); // ikisi de aynı
        System.out.println("Array den list : "+ arraydenList);

        // List in bir elementini update edelim.

        //arraydenList.set(1,45); // birinde yaptığımız update diğerini de değiştirir.

        System.out.println("=========array i değiştirdikten sonra=====");
        System.out.println("Array          : "+ Arrays.toString(arr)  ); // ikisi de aynı
        System.out.println("Array den list : "+ arraydenList);



    }
}
