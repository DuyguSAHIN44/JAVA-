package day20_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_tamBölenlerListesi {
    public static void main(String[] args) {

        //SORU 6: Kullanıcıdan main methodda pozitif bir tamsayı alıp
        // o tamsayıyı tam bölünebilen tüm pozitif tam sayıları
        // bir liste olarak bize döndüren bir method oluşturun)

        Scanner scan= new Scanner(System.in);
        System.out.println(" Pozitif bölenlerini bulunacak pozitif bir tamsayı giriniz");
        int girilenSayı=scan.nextInt();

        System.out.println(pozitifBölenleriListele(girilenSayı));
    }
    public static List<Integer>pozitifBölenleriListele(int verilenSayı){

        List<Integer>pozitifBolenlerListesi=new ArrayList<>();

        for (int i=1; i<=verilenSayı; i++){
            if(verilenSayı % i==0 ){
                pozitifBolenlerListesi.add(i);
            }
        }
        return pozitifBolenlerListesi;


    }
}



