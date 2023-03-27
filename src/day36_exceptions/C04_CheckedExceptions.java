package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Checked exceptions kod yazılır yazılmaz, daha run etmeden
        javanın riskli kodları tanımlayıp çalıştırmadan
        önce bana bir yol göstermelisin dediği
        exception türleridir

        Checked Exception  genelde dosya okuma ve yazma IO
        işlemlerinde oluşur.

        IO exception ihtimaline karşı kodu yazar yazmaz
        java altını kırmızı çizer

        Checked exception kodun altını kırmızı çizdiğimizden
        kodumuzun çalışır hale gelmesi için kırmızı çizgiyi kaldırmamız lazım

        1- try catch bloğu kullanarak exception handle edilebilir
        ve javaya exception oluştuğunda
        javaya ne yapmasını istediğimiz göstermelidir

        2- Eğer exception ı handle etmek istemiyorsak
        sadece kodumuzun çalışmasını istiyorsak
        method deklerasyonuna bu exce ihtimalini
        yazarak kodu çalışır hale getirebiliriz

        method signuture ye throws keyword ile
        beklenen exception türünü yazarsak kod çalışır duruma gelir
        ANCAK exception oluşursa Java yaçözüm yolu
        sunulmadığından kodun çalışması durur.
        BURADA EXCEPTİON GİDERİLMEDİ SADECE KIRMIZI YAZI GİDERİLDİ

         */
        String dosyaYolu="src/day36_exceptions/text.txt";

        FileInputStream fiş=new FileInputStream(dosyaYolu);



    }
}
