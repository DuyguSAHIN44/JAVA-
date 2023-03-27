package day31_inheritance;

public class DCorolla extends CToyota {
    String str3="Corolla";
    DCorolla(){

        System.out.println(" Parametresiz c çalıştı");
    }
    DCorolla(int sayı){
        this();
        System.out.println("int parametreli Corlla");

    }

    public static void main(String[] args) {
        DCorolla obj1=new DCorolla(5);


    }
}

/*
Biz görünür bir cons oluşturduğumuzda
Javanın default cons silmesine benzer olarak extends keyword
kullanmış bir satırında gözle görünür bir cons call yazılmışsa

Bir con içinde sadece 1 tane con call olabilir
 o da ilk satırda olmak zorundadır

 Eğer this(parametreliler) veya super ile cons. call
 yaptığımız argüment ile uyumlu parametreye sahip cons. yoksa Java CTE verir
 */
