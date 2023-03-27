package day23_constructor;

public class C02_constructorCall {

        int sayı;
        String str;

      public  C02_constructorCall (){
        System.out.println(" Parametresiz const. çalıştı"); //  Parametresiz const. çalıştı

        }
    /*
    Java da ihtiyaç olursa bir consrtuctor içinden
    başka constructor çağrılabilir.

    Constructor call için 2 kural vardır:
    1) Constructor call içinde bulunduğu constructor un
    ilk satırında olmalıdır
     */


    public C02_constructorCall(int sayı) {
        System.out.println(" int const. çalıştı");
        this.sayı=sayı;

    }
    public C02_constructorCall(String str) {
        // C02_constructorCall : Böyle yazıldığında method call olarak algılar.
        this(5); // Java sytax olarak costructor call olarak bunu belirlemiştir.
        this.str = str;
        System.out.println("String parametreli const. çalıştı");

    }

    public static void main (String[]args){



        //C02_constructorCall obj2=new C02_constructorCall("Java"); // String parametreli const. çalıştı
      //  System.out.println(obj2.sayı); // 5
        //System.out.println(obj2.str); // Java
    }


       // C02_constructorCall obj1=new C02_constructorCall();
    }

