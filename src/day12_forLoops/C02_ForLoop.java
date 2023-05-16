package day12_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

         */

        int baş=20;
        int bit=40;

        int sayıToplamı=0;


            if (bit<baş){
                System.out.println("Lütfen bitiş değeri başlangıç değerinden büyük olmalıdır");
            }else {
                for (int i =baş; i <=bit; i++) {

                    sayıToplamı+=i; //sayıToplamı=sayıToplamı+i;
                }
            }
             System.out.println("Sayıların toplamı: " +sayıToplamı);
        }
       }


