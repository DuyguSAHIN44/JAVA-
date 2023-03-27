package day37_throwKeyWord;

public class C02_ThrowKeyWord {
    public static void main(String[] args) {

        String a = null;
        String b = "";
        try {
            try {
                int c = a.length() + b.length(); // Null Point Exception verdi
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                    throw new RuntimeException();
                }
                System.out.println("NullPoint Ex. vardır işlem yapılamaz");

            }

            } catch (RuntimeException e) {
            System.out.println("Throw Keyword çalıştı");

        }
    }
}
