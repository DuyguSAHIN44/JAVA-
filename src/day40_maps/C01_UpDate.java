package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_UpDate {
    public static void main(String[] args) {

        // Verilrn map de şube ismi M olanların
        // şubesini N yapın

        Map<Integer,String>okulMap= MapMethodDepo.örnekMapOluştur();
        System.out.println(okulMap);

        System.out.println(okulMap.get(101)); //Ali-Cem-10-H-MF
        System.out.println(okulMap.put(101, "Ali-Cem-10-M-MF"));
        System.out.println(okulMap.put(102,"Kemal-Can-11-M-Söz"));

        // 1) önce key leri bir set olarak kaydedelim
        // 2) her bir value ların split ile array lere dönüştürelim
        // 3 Şube bilgisi eskiŞube olanları yeniŞube yapalım
        // 4) array deki bilgileri birleştirerek yeniden map a ekleyelim
        // 5)okulMap ın son halini return edeliM


        // 6) Return edilen yeni halini eski okulMap e assing edelim
      // okulMap=MapMethodDepo.topluŞubeDeğiştirme(okulMap,"M","N");
    }
}
