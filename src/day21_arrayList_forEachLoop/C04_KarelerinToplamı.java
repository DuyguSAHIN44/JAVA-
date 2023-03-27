package day21_arrayList_forEachLoop;

import java.util.Arrays;

public class C04_KarelerinToplamı {
    public static void main(String[] args) {

        /*
        SORU 2: Verilen int array deki her elementin karelerini alıp,
        karelerinin toplamını yazdıran bir method oluşturun.
         */

        int[] arr={2,3,5,5,6};

      karelerToplamınıYazdır(arr);
    }
    public static void karelerToplamınıYazdır(int[]arr){

        int karelerToplamı=0;
        for (int each:arr
             ) {
          karelerToplamı += each*each;

        }
        System.out.println("Verilen array deki karelerin toplamı: " +karelerToplamı); // Verilen array deki karelerin toplamı: 99

        }

    }

