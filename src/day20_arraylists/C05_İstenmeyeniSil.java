package day20_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Scanner;

public class C05_İstenmeyeniSil {
    public static void main(String[] args) {
        
        //Soru 3: Verilen String bir listede
        // İstenmeyen harf içeren elementleri silip,
        //kalan kısmını list olarak bize döndüren bir method oluşturun

        List<String>liste=C04_KullanıcıyaListeOluşturmak.kullanıcıyaListOluşturma();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğiniz bir harf girin");
        String istenmeyenHarf= scan.next().substring(0,1);


        List<String>ayıklanmışList=istenmeyenHarfİçerenleriSil(liste,istenmeyenHarf);
        System.out.println(ayıklanmışList);
    }

    public static List<String> istenmeyenHarfİçerenleriSil(List<String> liste,String istenmeyenHarf){

        //Mesela listemiz Ali,Veli,Ayşe,Fatma ve istenmeyen harf a olsun
        // for loop ile elementleri ele alırken remove yaparsak
        //list in uzunluğu değişeceği için sorun yaşarız
        // farklı bir list oluşturup, silinmeyecekleri yeni listeye ekleyelim

        List<String>kalanlarListesi=new ArrayList<>();

        for (int i =0; i< liste.size(); i++){
           if(! liste.get(i).contains(istenmeyenHarf)){
               kalanlarListesi.add(liste.get(i));
           }
        }
        return kalanlarListesi;
    }
}
