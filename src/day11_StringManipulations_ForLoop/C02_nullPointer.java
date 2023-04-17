package day11_StringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        /*
         null bir feğer değildir.

         null bir pointerdir

         yanına yazıldığı non-primitive a değer atanmadığını işaret eder

         */

        String str; // str oluşturuldu ama değer atanmadı

        /*
        Java method içerisinde değer atamadan variable oluşturulmasına izin verir.
        daha sonra değer atanacağı için değer atamasi yapilmaz
        deger ataması yapılmadan listeleme bile CTE verdiği için
        değer verilmediğini işaratleyecek, ama CTE oluşmasını engelleyecek
        bir çözüm olarak null pointer oluşturulmuştur
         */

        str=null;  // str="null" değil
                   // null olarak işaretlenmiş, değeri null olarak atanmış değil

        System.out.println(str); // null

         //System.out.println(str.concat("Java")); // NullPointerException

        System.out.println(str + "Java"); // nullJava --SADECE + YA İZİN VERİYOR

        // System.out.println(str.length()); // NullPointerException

        System.out.println(str+"Java"); // nullJava

        String str2=str+"Java";
        System.out.println("str2 : "+str2); // str2 : nullJava

        // int sayı=null;  primitive variable lere null değeri olmaz
        Integer sayı=null;

        String str3=""; // str3=değer atanmıştır
                        // atanan değer hiçliktir

        System.out.println(str3.concat("Java")); // Java

        System.out.println(str.isEmpty()); // NullPointerException ---NULL OLARAK İŞARETLENMİŞ BİR STRING HİÇ BİR METHODLA KULLANILAMAZ
                                           // SADECE YAZDIRILABLIR YADA + ŞEKLİNDE KULLANILABİLİR




    }
}
