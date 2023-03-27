package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MDA {
    public static void main(String[] args) {

        String[][] sınıflar={{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        // G yi yazdırın
        System.out.println(sınıflar[0][2]); //G

        // Q yu Y yapın

        sınıflar[2][2]="Y";
        System.out.println(Arrays.deepToString(sınıflar)); //[[A, B, G, M], [F, P, A, V], [K, D, Y]]

        //ilk sınıfın mevcudunu yazdırın

        System.out.println(sınıflar[0].length); //4

        // sınıflarda toplam kaç kişi ol yazdırın

        System.out.println(sınıflar.length); //3 (array in içindeki arrayleri verir.

        int toplamÖğrenciSayısı=0;
        for (int i=0; i<sınıflar.length; i++){
            toplamÖğrenciSayısı+=sınıflar[i].length;


        }
        System.out.println("Toplam öğrenci sayısı : " + toplamÖğrenciSayısı); //Toplam öğrenci sayısı : 11

    }

}
