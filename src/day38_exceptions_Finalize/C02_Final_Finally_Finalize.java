package day38_exceptions_Finalize;

public class C02_Final_Finally_Finalize {
    public static void main(String[] args) {


        try {

            System.out.println(10/0);
            System.out.println("bolmenin sonrasındaki satır");
        } catch (Exception e) {
            System.out.println("catch satır");
            throw new RuntimeException(e);
        } finally {
            System.out.println("fina");
        }
    }
}
