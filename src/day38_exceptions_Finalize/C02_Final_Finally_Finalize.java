package day38_exceptions_Finalize;

public class C02_Final_Finally_Finalize {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE); // -2147483648  DEĞİŞTİRİLEMEZ  FİNAL OLUNCA

       // Integer.MIN_VALUE=3;  Constant Data
        System.out.println(Math.PI); // 3.141592653589793 DEĞİŞTİRİLEMEZ


        try {

            System.out.println(10/0);
            System.out.println("bolmenin sonrasındaki satır çalıştı");
        } catch (Exception e) {
            System.out.println("catch satırı çalıştı");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally satırı çalıştı");
        }
        /*
        Eğer 10/5 olsaydı: 1) "bölmenin sonrasındaki satır çalışırsı"
                           2) "Finally satırı çalışırdı
                           exception olmadığı için catch bloğu çalımaz
                           finally her türlü çalışır

            10/0 olsaydı: 1) "catch satırı çalışırdı; ÇÜNKÜ EXCEPTİON VERİRDİ 0 DAN DOLAYI
                          2) "finally satırı çalışırdı" Çünkü her türlü en son çalışır
                          NOT:TRY nın altı çalışmaz çünkü EXCEPTİON var
         */
    }
}
