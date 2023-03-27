package day18_multiDimensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr ={{3,5,7},{1,2,3,4,},{1,2},{7}};

        //toplam element sayısı kaçtır?

        int toplamElementSayısı=0;
        for (int i=0; i<arr.length; i++){
            toplamElementSayısı+=arr[i].length;
        }

        System.out.println("Toplam element sayısı : " +toplamElementSayısı);//10

        // Tüm elementlerin toplamını bulun

        /*MDA larda her bir elementi elden gçirmek istiyorsak
        kat sayısı kadar nested for loop kullanırız

         */

        int elementlerToplamı=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){ //icteki için for
              elementlerToplamı+= arr[i][j];
                System.out.println("Elementlerin toplamı : " + elementlerToplamı);//35
            }

        }

    }
}
