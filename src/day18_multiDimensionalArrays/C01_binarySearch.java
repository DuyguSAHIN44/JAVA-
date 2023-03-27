package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        // Verilen bir array de istenen elemanın olup olmadığını bulur

        int[] arr ={4,9,1,5,11,3,7,4,6};
        System.out.println(Arrays.binarySearch(arr, 5)); // -2
        System.out.println(Arrays.binarySearch(arr, 11));// 4
        System.out.println(Arrays.binarySearch(arr, 1));//-1

        /*
        Arrray de binarySearch() nun düzgün çalışması için
        öncelikle sort() çalıştırılmalıdır.
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 3, 4, 4, 5, 6, 7, 9, 11]

        System.out.println(Arrays.binarySearch(arr, 5));//4
        System.out.println(Arrays.binarySearch(arr, 11));//8
        System.out.println(Arrays.binarySearch(arr, 1));//0
        System.out.println(Arrays.binarySearch(arr, 4));//2


        //Binary Search() aranan elementin index ini döner

        System.out.println(Arrays.binarySearch(arr, 2));//-2
        System.out.println(Arrays.binarySearch(arr, -3));//-1
        System.out.println(Arrays.binarySearch(arr, 10));//8
        System.out.println(Arrays.binarySearch(arr, 13));//-10
        System.out.println(Arrays.binarySearch(arr, 20));//-10

        //Olmayan bir element aratılırsa, önce arrayde olsaydı
        // nerede olurdu bunu buluyoruz
        // Olması gereken sıranın işaretli değerini veriyoruz
        // Bu mantıklaen küçük element den daha küçük bütün sayılar için -1
        // en büyük elementlerden büyük olan bütün sayılar için de lenght-1 değeri döndürür

    }
}
