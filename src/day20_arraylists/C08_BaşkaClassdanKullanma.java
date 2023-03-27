package day20_arraylists;

public class C08_BaşkaClassdanKullanma {
    public static void main(String[] args) {

         // Soru : Verilen sayının pozitif tam bölenleri sayısı 10 dan çok ise "Güzel",
        // yoksa "Kötü" yazdırın

        int sayı =25;

        int pozitifTamBölenlerSayısı= C07_tamBölenlerListesi.pozitifBölenleriListele(sayı).size();

        if (pozitifTamBölenlerSayısı >10){
            System.out.println("Güzel");
        }else {
            System.out.println("Kötü");
        }

    }
}
