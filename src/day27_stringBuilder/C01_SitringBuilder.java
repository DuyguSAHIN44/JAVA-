package day27_stringBuilder;

public class C01_SitringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        sb1.append("Mustafa");
        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 7

        sb1.append(" Yılmaztürk");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity()); //34= 2 * eski capacity + 2
        System.out.println(sb1.length()); // 17

        sb1.append("Java yı çok sever, sabah akşam java çalışır");
        System.out.println(sb1.capacity()); // 70= 2*34+2
        System.out.println(sb1.length()); // 62

        // 2. YÖNTEM
        StringBuilder sb2=new StringBuilder("Java candır");
        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length()); // 11

        // 3.YÖNTEM


        StringBuilder sb3=new StringBuilder(11);
        sb3.append("12345678910");
        System.out.println(sb3.capacity()); // 11
        System.out.println(sb3.length()); // 11

        sb3.append(" : TC NO ");
        System.out.println(sb3); //12345678910 : TC NO
        System.out.println(sb3.capacity()); // 24 = 11*2+2
        System.out.println(sb3.length()); //20 Normalde 11 " : TC NO " birleşince 20 oldu.

        String str="Java candır";
        sb3.append(str,4,str.length());

        System.out.println(sb3); // 12345678910 : TC NO  candır

        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 27 eşitledi
        System.out.println(sb3.length()); //  27


    }
}
