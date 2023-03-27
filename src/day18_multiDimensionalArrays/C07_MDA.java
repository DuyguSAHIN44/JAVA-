package day18_multiDimensionalArrays;

public class C07_MDA {
    public static void main(String[] args) {

        int[][] arr ={{13,25,37},{41,12,23,34,},{11,25},{17}};

        // 20 ile 40 arasında (20 ve 40 dahil) olan sayıların toplamını bulun

        int istenenElementlerinToplamı=0;

        for (int i=0; i< args.length; i++){ //outer array ler için

            for (int j=0; j< arr.length; i++){ //inner array ler için

                if (arr[i][j]>=20 && arr[i][j]<=40){
                    istenenElementlerinToplamı+=arr[i][j];
                }
            }
        }
        System.out.println("İstenen elementlerin toplamı : " + istenenElementlerinToplamı); //144
    }
}
